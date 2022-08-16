package cc.yunmc;

import cc.yunmc.dao.BookDao;
import cc.yunmc.dao.UserDao;
import cc.yunmc.service.BookService;
import cc.yunmc.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class AppForDISet {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        BookService bookService = (BookService) ac.getBean("bookService");
//        bookService.save();

//        DataSource dataSource = (DataSource) ac.getBean("dataSource");
//        System.out.println(dataSource);

        BookDao userDao = ac.getBean("userDao", BookDao.class);
        userDao.save();
    }
}
