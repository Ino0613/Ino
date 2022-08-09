package cc.yunmc.dao.impl;

import cc.yunmc.dao.BookDao;

public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("Book Dao save...");
    }

    public void init(){
        System.out.println("init...");

    }

    public void destroy(){
        System.out.println("destroy...");
    }
}
