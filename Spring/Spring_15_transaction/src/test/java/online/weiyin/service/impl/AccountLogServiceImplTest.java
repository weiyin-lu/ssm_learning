package online.weiyin.service.impl;

import online.weiyin.config.SpringConfig;
import online.weiyin.service.AccountLogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountLogServiceImplTest {

    @Autowired
    AccountLogService accountLogService;

    @Test
    public void log() {
        int log = accountLogService.log(1, 2, 1000);
        System.out.println(log);
    }
}