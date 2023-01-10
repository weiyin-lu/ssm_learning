package online.weiyin.demo;

import online.weiyin.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao bean = (UserDao) context.getBean("userDao");
        bean.save();
    }
}
