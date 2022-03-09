package Project.Shop.daoimpl;

import Project.Shop.dao.CartItemDao;
import Project.Shop.entity.CartItem;

import java.util.LinkedHashMap;

public class CartItemDaoImpl implements CartItemDao {

    //购物车 不适用static修饰，每个用户有自己的购物车
    private LinkedHashMap<Integer, CartItem>
        shoppingCart = new LinkedHashMap<Integer, CartItem>();

    @Override
    public void addCarItem(CartItem item) {

    }

    /**
     * 获取所有的购物车条目==获取购物车信息
     */
    @Override
    public LinkedHashMap<Integer , CartItem> findCart(){
        //假设购物车中之前有两个条目
        shoppingCart.put(1111,new CartItem(1111,"皮鞋",238,1));
        shoppingCart.put(2222,new CartItem(2222,"Ino",2380,2));

        return shoppingCart;
    }
}
