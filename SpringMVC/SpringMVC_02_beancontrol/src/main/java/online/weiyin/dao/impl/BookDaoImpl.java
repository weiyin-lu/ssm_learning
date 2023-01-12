package online.weiyin.dao.impl;

import online.weiyin.dao.BookDao;
import org.springframework.stereotype.Component;

@Component
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("BookDao save run");
    }
}
