package online.weiyin.service.impl;

import online.weiyin.dao.BookDao;
import online.weiyin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BookServiceImpl implements BookService {

    @Autowired //自动装配注解，默认使用暴力反射，需要提供无参构造方法或者唯一的构造方法
//    @Qualifier("bookDao") //按bean名装配模式，依赖autowired注解
    BookDao bookDao;

    @Value("10") //简单类型的自动装配
    int connectionNum;
    @Override
    public void serve() {
        bookDao.save();
        System.out.println("BookService run" + connectionNum);
    }
}
