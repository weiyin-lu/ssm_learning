package online.weiyin.demo;

import online.weiyin.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao bean = (OrderDao) context.getBean("orderDao");
        bean.save();
    }
}
