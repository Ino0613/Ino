package cc.yunmc.service.impl;

import cc.yunmc.dao.OrderDao;
import cc.yunmc.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
