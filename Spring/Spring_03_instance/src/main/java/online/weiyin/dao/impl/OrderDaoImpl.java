package online.weiyin.dao.impl;

import online.weiyin.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("OrderDao run");
    }
}
