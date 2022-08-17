package cc.yunmc;

import cc.yunmc.dao.BookDao;
import cc.yunmc.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //获取IoC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //获取bean
        BookDao bookDao = (BookDao) ac.getBean("bookDao");
        //bookDao.save();

        BookService bookService = (BookService) ac.getBean("bookService");
        bookService.save();
    }
}
