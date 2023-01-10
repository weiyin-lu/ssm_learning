package online.weiyin.service.impl;

import online.weiyin.dao.BookDao;
import online.weiyin.dao.OrderDao;
import online.weiyin.service.OrderService;

public class OrderServiceImpl implements OrderService {
    OrderDao orderDao;
    BookDao bookDao;

    public OrderServiceImpl(OrderDao orderDao, BookDao bookDao) {
        this.orderDao = orderDao;
        this.bookDao = bookDao;
    }

    @Override
    public void serve() {
        orderDao.save();
        bookDao.save();
        System.out.println("OrderService run");
    }
}
