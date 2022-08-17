package cc.yunmc.service.impl;

import cc.yunmc.dao.UserDao;
import cc.yunmc.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
