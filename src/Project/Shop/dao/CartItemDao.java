package Project.Shop.dao;

import Project.Shop.entity.CartItem;

import java.util.LinkedHashMap;

public interface CartItemDao {


    void addCarItem(CartItem item);

    LinkedHashMap<Integer , CartItem> findCart();

}
