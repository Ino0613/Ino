package cc.yunmc.dao.impl;

import cc.yunmc.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("Book Dao save... ");
    }

    public void update(){
        System.out.println("Book Dao update...");
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
