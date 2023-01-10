package online.weiyin.demo;

import online.weiyin.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bean = (BookService) context.getBean("bookService");
        bean.serve();
    }
}
