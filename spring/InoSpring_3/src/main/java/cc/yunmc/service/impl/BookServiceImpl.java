package cc.yunmc.service.impl;

import cc.yunmc.dao.BookDao;
import cc.yunmc.dao.UserDao;
import cc.yunmc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService {
    //5.删除业务层中使用new的方式创建的dao对象
    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("Book Service save ...");
        bookDao.save();
    }


}
