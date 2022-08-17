package cc.yunmc;

import cc.yunmc.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
        //通过静态工厂创建对象
//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();

        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        OrderDao daoFactory = (OrderDao) ac.getBean("daoFactory");
//        daoFactory.save();
        UserDao userDao = (UserDao) ac.getBean("userDao");

        userDao.save();
    }
}
