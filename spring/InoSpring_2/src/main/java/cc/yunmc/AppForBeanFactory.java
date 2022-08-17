package cc.yunmc;

import cc.yunmc.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource resources = new ClassPathResource("ApplicationContext.xml");
        BeanFactory bf = new XmlBeanFactory(resources);

        BookDao bookDao = bf.getBean(BookDao.class);
        bookDao.save();
    }
}
