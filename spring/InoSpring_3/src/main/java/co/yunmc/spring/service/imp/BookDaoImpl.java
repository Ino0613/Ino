package co.yunmc.spring.service.imp;

import co.yunmc.spring.dao.BookDao;

public class BookDaoImpl implements BookDao {

    public String findName(int id) {
        System.out.println("id" + id);
        return "Ino";
    }
}
