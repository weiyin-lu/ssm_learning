package online.weiyin.factory.order;

import online.weiyin.dao.OrderDao;
import online.weiyin.dao.impl.OrderDaoImpl;

//OrderDao的静态工厂
public class OrderDaoFactory {
    public static OrderDao getInstance() {
        System.out.println("OrderDaoFactory run");
        return new OrderDaoImpl();
    }
}
