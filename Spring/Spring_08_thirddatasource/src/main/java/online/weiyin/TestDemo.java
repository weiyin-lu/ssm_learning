package online.weiyin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class TestDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource source = (DataSource) context.getBean("source");
        System.out.println(source);
    }
}
