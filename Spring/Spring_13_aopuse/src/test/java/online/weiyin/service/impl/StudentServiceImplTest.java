package online.weiyin.service.impl;

import junit.framework.TestCase;
import online.weiyin.config.SpringConfig;
import online.weiyin.pojo.Student;
import online.weiyin.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) //spring-test提供的类运行器
@ContextConfiguration(classes = SpringConfig.class) //spring-test提供的配置，可以将配置类写到test中
public class StudentServiceImplTest extends TestCase{

    @Autowired
    StudentService service;

    @Test
    public void testSelectAll() {
        service.selectAll();
    }

    @Test
    public void testSelectByPrimaryKey() {
        service.selectByPrimaryKey(1);
    }
}