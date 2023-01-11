package online.weiyin.demo;

import online.weiyin.config.SpringConfig;
import online.weiyin.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = context.getBean(BookDao.class);
        bean.update();
//        int save = bean.save();
//        System.out.println(save);
    }
}
