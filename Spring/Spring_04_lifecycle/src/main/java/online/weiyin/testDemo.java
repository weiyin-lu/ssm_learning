package online.weiyin;

import online.weiyin.dao.BookDao;
import online.weiyin.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bean = context.getBean(BookDao.class);
//        bean.save();
        BookService bean = context.getBean(BookService.class);
        bean.serve();
//        context.close(); //一种暴力关闭容器的方法，必须有主动关闭行为才能调用销毁方法
        context.registerShutdownHook(); //注册容器销毁钩子，在程序任意位置写入即可自然关闭
    }
}
