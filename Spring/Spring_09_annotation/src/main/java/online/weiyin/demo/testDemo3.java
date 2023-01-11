package online.weiyin.demo;

import online.weiyin.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class testDemo3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource bean = context.getBean(DataSource.class);
        System.out.println(bean);
    }
}
