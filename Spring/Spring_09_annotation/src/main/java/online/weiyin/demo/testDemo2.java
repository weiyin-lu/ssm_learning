package online.weiyin.demo;

import online.weiyin.config.SpringConfig;
import online.weiyin.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testDemo2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bean = context.getBean(BookService.class);
        bean.serve();
    }
}
