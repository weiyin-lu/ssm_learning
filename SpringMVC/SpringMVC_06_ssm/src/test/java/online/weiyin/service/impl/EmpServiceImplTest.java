package online.weiyin.service.impl;

import online.weiyin.config.SpringConfig;
import online.weiyin.pojo.Emp;
import online.weiyin.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class EmpServiceImplTest {

    @Autowired
    private EmpService empService;

    @Test
    public void getById() {
        Emp byId = empService.getById(1);
        System.out.println(byId);
    }

    @Test
    public void getAll() {
        List<Emp> all = empService.getAll();
        System.out.println(all);
    }
}