package online.weiyin.dao.impl;

import online.weiyin.dao.BookDao;

public class BookDaoImpl implements BookDao {

//    Spring默认采用无参构造方法创建bean
    public BookDaoImpl() {
        System.out.println("BookDao Constructor run");
    }

    @Override
    public void save() {
        System.out.println("BookDao run");
    }
}
