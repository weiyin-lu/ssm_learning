package online.weiyin.service.impl;

import online.weiyin.mapper.AccountLogMapper;
import online.weiyin.pojo.AccountLog;
import online.weiyin.service.AccountLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountLogServiceImpl implements AccountLogService {

    @Autowired
    AccountLogMapper accountLogMapper;


    /**
     * 添加一条日志记录
     * @param userA
     * @param userB
     * @param money
     * @return
     */
    @Override
    public int log(int userA, int userB, int money) {
        AccountLog log = new AccountLog();
        log.setMessage("账户" + userA + "向账户" + userB + "转账" + money + "元");
        int insert = accountLogMapper.insert(log);
        return insert;
    }
}
