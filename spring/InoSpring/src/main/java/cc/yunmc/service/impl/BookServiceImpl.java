package cc.yunmc.service.impl;

import cc.yunmc.dao.BookDao;
import cc.yunmc.dao.UserDao;
import cc.yunmc.service.BookService;

public class BookServiceImpl implements BookService {
    //5.删除业务层中使用new的方式创建的dao对象
    private BookDao bookDao;
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("Book Service save ...");
        bookDao.save();
        userDao.save();
    }

    //6.提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
