package online.weiyin.service.impl;

import junit.framework.TestCase;
import online.weiyin.config.SpringConfig;
import online.weiyin.pojo.Account;
import online.weiyin.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceImplTest extends TestCase {

    @Autowired
    AccountService accountService;


    @Test
    public void transfer() {
        Boolean transfer = accountService.transfer(1, 2, 1000);
        System.out.println(transfer);
    }
}