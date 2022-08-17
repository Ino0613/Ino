package cc.yunmc.dao.impl;

import cc.yunmc.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookDaoImpl implements BookDao, InitializingBean, DisposableBean {

    @Override
    public void save() {
        System.out.println("Book Dao save...");
    }

    public void init(){
        System.out.println("init...");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init...");
    }


}
