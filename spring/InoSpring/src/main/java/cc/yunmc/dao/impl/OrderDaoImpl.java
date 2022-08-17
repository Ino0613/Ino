package cc.yunmc.dao.impl;

import cc.yunmc.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("Order Dao save ...");
    }
}
