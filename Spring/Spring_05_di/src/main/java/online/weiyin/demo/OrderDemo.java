package online.weiyin.demo;

import online.weiyin.service.BookService;
import online.weiyin.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService bean = (OrderService) context.getBean("orderService");
        bean.serve();
    }
}
