package online.weiyin.service.impl;

import online.weiyin.dao.BookDao;
import online.weiyin.dao.OrderDao;
import online.weiyin.service.BookService;

public class BookServiceImpl implements BookService {
    BookDao bookDao;
    OrderDao orderDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public void serve() {
        bookDao.save();
        orderDao.save();
        System.out.println("BookService run");
    }
}
