package online.weiyin.dao.impl;

import online.weiyin.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    private int connectionNum;
    private String databaseName;

    public OrderDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("OrderDao run"+databaseName+connectionNum);
    }
}
