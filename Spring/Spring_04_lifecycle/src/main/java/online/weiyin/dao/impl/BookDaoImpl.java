package online.weiyin.dao.impl;

import online.weiyin.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao run");
    }

    public void init() {
        System.out.println("dao init");
    }

    public void destroy() {
        System.out.println("dao destroy");
    }
}
