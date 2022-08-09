package cc.yunmc;

import cc.yunmc.dao.BookDao;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookDao bookDao = (BookDao) ac.getBean("bookDao");
        bookDao.save();
    }
}
