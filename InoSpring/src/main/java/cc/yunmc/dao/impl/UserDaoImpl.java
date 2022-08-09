package cc.yunmc.dao.impl;

import cc.yunmc.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("UserDao save ...");
    }
}
