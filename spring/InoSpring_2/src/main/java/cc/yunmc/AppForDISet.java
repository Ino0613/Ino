package cc.yunmc;

import cc.yunmc.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDISet {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        BookService bookService = (BookService) ac.getBean("bookService");
//        bookService.save();

//        DataSource dataSource = (DataSource) ac.getBean("dataSource");
//        System.out.println(dataSource);

        BookDao bookDao = (BookDao) ac.getBean("bookDao");
        System.out.println(bookDao);
    }
}

