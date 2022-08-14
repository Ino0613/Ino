package cc.yunmc;

import cc.yunmc.dao.BookDao;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ac.afterPropertiesSet();
        BookDao bookDao = (BookDao) ac.getBean("bookDao");
        bookDao.save();
        ac.registerShutdownHook();
//        ac.close();
    }
}
