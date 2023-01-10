package online.weiyin.service.impl;

import online.weiyin.dao.BookDao;
import online.weiyin.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {

    BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        System.out.println("service setter");
        this.bookDao = bookDao;
    }

    @Override
    public void serve() {
        bookDao.save();
        System.out.println("BookService run");
    }

//    spring提供的生命周期控制方法
    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }
//    该方法在setter属性设置之后执行
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
