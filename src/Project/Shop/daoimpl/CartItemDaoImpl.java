package Project.Shop.daoimpl;

import Project.Shop.dao.CartItemDao;
import Project.Shop.entity.CartItem;

import java.util.LinkedHashMap;

public class CartItemDaoImpl implements CartItemDao {

    //购物车 不适用static修饰，每个用户有自己的购物车
    private static LinkedHashMap<Integer, CartItem>
        shoppingCart = new LinkedHashMap<Integer, CartItem>();

    @Override
    public void addCarItem(CartItem item) {
        //判断指定编号的条目是否已经存在
        CartItem item2 = shoppingCart.get(item.getId());
        if (item2 == null){
            shoppingCart.put(item.getId(), item);
        }else {
            //如果存在，修改数量，如果不存在，直接添加条目
//            int num1 = item.getAmount();
//            int num2 = item2.getAmount();
//            int num = num1 + num2;
//            item2.setAmount(num);
            item2.setAmount(item.getAmount()+ item2.getAmount());
        }
    }

    /**
     * 获取所有的购物车条目==获取购物车信息
     */
    @Override
    public LinkedHashMap<Integer , CartItem> findCart(){
        //假设购物车中之前有两个条目

        return shoppingCart;
    }
}
