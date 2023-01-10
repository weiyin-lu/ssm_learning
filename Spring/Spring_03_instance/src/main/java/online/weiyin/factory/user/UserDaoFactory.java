package online.weiyin.factory.user;

import online.weiyin.dao.UserDao;
import online.weiyin.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getInstance() {
        System.out.println("UserDaoFactory run");
        return new UserDaoImpl();
    }
}
