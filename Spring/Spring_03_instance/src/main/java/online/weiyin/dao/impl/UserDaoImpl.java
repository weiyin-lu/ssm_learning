package online.weiyin.dao.impl;

import online.weiyin.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDao run");
    }
}
