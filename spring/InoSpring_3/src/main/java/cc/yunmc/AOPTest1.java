package cc.yunmc;

import cc.yunmc.config.SpringConfig;
import cc.yunmc.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest1 {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ac.getBean(BookDao.class);
        bookDao.update();
    }
}
