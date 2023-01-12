package online.weiyin.service.impl;

import online.weiyin.dao.BookDao;
import online.weiyin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Override
    public void serve() {
        System.out.println("BookService serve run");
        bookDao.save();
    }
}
