package cc.yunmc.dao.impl;

import cc.yunmc.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("bookDao")
@Scope("singleton")

public class BookDaoImpl implements BookDao {
    @Value("Ino")
    private String name;
    @Override
    public void save() {
        System.out.println("Book Dao save... " + name);
    }
//    @PostConstruct
//    public void init() {
//        System.out.println("init ...");
//    }
//    @PreDestroy
//    public void destroy() {
//        System.out.println("destroy...");
//    }
}
