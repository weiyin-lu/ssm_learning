package online.weiyin.dao.impl;

import online.weiyin.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private String databaseName;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("BookDao run" + databaseName +connectionNum);
    }
}
