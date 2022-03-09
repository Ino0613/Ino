package Project.Shop;

import Project.Shop.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao{
    //存储商品信息的集合对象,商品列表只有一份(static)
    private static List<Product> productList = new ArrayList<Product>();
    //静态代码块 第一次加载类的时候执行，只执行一次，一般是对静态变量进行初始化操作
    static{
        productList.add(new Product(1111,"皮鞋",23,"黑色",42,100));
    }
    /**
     * 添加商品
     * @param p
     */
    //list语法是不唯一的，但是可以通过编码的判断（遍历list，如果指定编号的元素存在，就不添加）来实现其唯一性
    public void add(Product p){
        //先判断集合中是否有指定id的商品
        boolean flag = false;
//        for (int i =0;i< productList.size();i++){
//            Product p1 = productList.get(i);
//            if (p1.getId()==p.getId()){
//                flag = true;//存在
//                break;
//            }
//        }
        for (Product p1 : productList){
            if (p1.getId()==p.getId()){
                flag = true;//存在
                break;
            }
        }
        if (flag){
            System.out.println("该编号商品已存在");
        }else{
            productList.add(p);
            System.out.println("添加成功");
        }
    }


    /**
     * 获取（而不是输出）所有的商品信息
     * @return
     */
    public List<Product> findAll(){
        return productList;
    }

    /**
     * 获取指定编号的商品
     * @param id 编号
     * @return 商品
     */
    public Product findById(int id){
        //如果按照索引查询，效率高 productList.get(id);但此处是按照编号查询
        //只能逐个比较
        for (int i = 0;i< productList.size();i++){
            //获取指定index的商品
            Product product = productList.get(i);
            if(product.getId() == id){
                return product;
            }
        }
//        for(Product product : productList){
//            if(product.getId() == id){
//                return product;
//            }
//        }
        return null;
    }
}
