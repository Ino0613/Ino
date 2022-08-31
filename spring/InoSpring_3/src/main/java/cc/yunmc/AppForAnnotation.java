package cc.yunmc;

import cc.yunmc.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class AppForAnnotation {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookDao bookDao1 = (BookDao) ac.getBean("bookDao");
//        BookDao bookDao2 = (BookDao) ac.getBean("bookDao");
//        System.out.println(bookDao1);
//        System.out.println(bookDao2);
//        ac.close();
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource bean = ac.getBean(DataSource.class);
        System.out.println(bean);

    }
}
