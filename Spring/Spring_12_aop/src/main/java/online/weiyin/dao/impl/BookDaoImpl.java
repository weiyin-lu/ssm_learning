package online.weiyin.dao.impl;

import online.weiyin.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public int save() {
        System.out.println("BookDao save run");
        return 100;
    }

    @Override
    public void update() {
        System.out.println("BookDao update run");
    }
}
