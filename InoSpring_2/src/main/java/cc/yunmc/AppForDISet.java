package cc.yunmc;

import cc.yunmc.dao.BookDao;
import cc.yunmc.dao.UserDao;
import cc.yunmc.service.BookService;
import cc.yunmc.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDISet {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookService bookService = (BookService) ac.getBean("bookService");
        bookService.save();


    }
}
