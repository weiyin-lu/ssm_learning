package online.weiyin.demo;

import online.weiyin.dao.ListDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ListDao bean = (ListDao) context.getBean("listDao");
        bean.print();
    }
}
