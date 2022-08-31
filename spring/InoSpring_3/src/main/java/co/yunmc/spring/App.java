package co.yunmc.spring;

import co.yunmc.spring.config.SpringConfig;
import co.yunmc.spring.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ac.getBean(BookDao.class);
        String name = bookDao.findName(100);
        System.out.println(name);
    }
}
