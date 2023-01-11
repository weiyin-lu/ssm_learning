package online.weiyin.service.impl;

import online.weiyin.mapper.AccountMapper;
import online.weiyin.pojo.Account;
import online.weiyin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    /**
     * A向B转账M元
     * @param userAId A用户
     * @param userBId B用户
     * @return
     */
    @Override
    public Boolean transfer(int userAId, int userBId, int M) {
//        A对象
        Account accountA = new Account();
        accountA.setId(userAId);
        accountA.setPrice(BigDecimal.valueOf(-M));
//        B对象
        Account accountB = new Account();
        accountB.setId(userBId);
        accountB.setPrice(BigDecimal.valueOf(M));
//        业务
        accountMapper.updatePrice(accountA); //A减钱，事务协调员，独立的事务会纳入事务管理员
//        int i = 1/0; //模拟异常，在开启事务后，两个操作没有同时成功，事务会自动回滚
        accountMapper.updatePrice(accountB); //B加钱，事务协调员，同上
        return true;
    }
}
