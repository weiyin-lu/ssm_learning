package online.weiyin.demo;

import online.weiyin.config.SpringConfig;
import online.weiyin.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = context.getBean(BookDao.class);
        String save = bean.save(10,"lu");
        System.out.println(save);
    }
}
