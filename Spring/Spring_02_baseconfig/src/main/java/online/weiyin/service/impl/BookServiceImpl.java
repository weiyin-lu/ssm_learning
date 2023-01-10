package online.weiyin.service.impl;

import online.weiyin.dao.BookDao;
import online.weiyin.service.BookService;

public class BookServiceImpl implements BookService {

    BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void serve() {
        bookDao.save();
        System.out.println("BookService run");
    }
}
