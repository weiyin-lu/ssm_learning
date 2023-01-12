package online.weiyin.demo;

import online.weiyin.config.SpringConfig;
import online.weiyin.controller.BookController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1 {
    public static void main(String[] args) {
//        需要注释掉SpringMvcConfig类的配置注解来测试bean加载控制的效果，多个Configuration注解会扫描所有注册到注解的bean
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController bean = context.getBean(BookController.class);
        bean.save(); //此处会报NoSuchBeanDefinitionException
    }
}
