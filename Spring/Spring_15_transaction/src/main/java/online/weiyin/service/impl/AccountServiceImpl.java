package online.weiyin.service.impl;

import online.weiyin.mapper.AccountMapper;
import online.weiyin.pojo.Account;
import online.weiyin.service.AccountLogService;
import online.weiyin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Autowired
    AccountLogService accountLogService;

    /**
     * A向B转账M元
     * @param userAId A用户
     * @param userBId B用户
     * @return
     */
    @Override
    public Boolean transfer(int userAId, int userBId, int M) throws IOException {
//        A对象
        Account accountA = new Account();
        accountA.setId(userAId);
        accountA.setPrice(BigDecimal.valueOf(-M));
//        B对象
        Account accountB = new Account();
        accountB.setId(userBId);
        accountB.setPrice(BigDecimal.valueOf(M));
//        业务
        try {
            accountMapper.updatePrice(accountA); //A减钱，事务协调员，独立的事务会纳入事务管理员
//            if(true) throw new RuntimeException("测试异常");//模拟异常，在开启事务后，两个操作没有同时成功，事务会自动回滚
//            if(true) throw new IOException("测试异常"); //默认的事务模式无法回滚该异常，需要在事务管理员设置属性
            accountMapper.updatePrice(accountB); //B加钱，事务协调员，同上
        }
        finally {
//            这段代码应该受AccountLogService的管理，配置了始终启动新事务，因此不受上方代码的影响
            accountLogService.log(userAId,userBId,M);
        }
        return true;
    }
}
