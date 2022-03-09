package Project.Shop;

import Project.Shop.dao.CartItemDao;
import Project.Shop.daoimpl.CartItemDaoImpl;
import Project.Shop.entity.CartItem;
import Project.Shop.entity.Product;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
/**
 * 1.购物车的设计
 *      特点:
 *      1.有序 添加的顺序 不是商品编号的顺序
 *      2.添加和删除操作比较多 效率有要求
 *      3.添加和删除必须先查询到 对查询效率也有要求
 *      4.唯一：同一种只能出现一次，会累计数量
 *      条件1 必须满足，有序
 * 集合类型：
 *      ArrayList 有序 添加顺序 不适合添加和删除
 *      LinkedList 有序 添加顺序 适合添加和删除
 *      HashSet 无序
 *      LinkedHashSet 有序 添加顺序 添加删除效率高 查询效率高
 *                   无法判断某个条目是否存在，因为无法确定之前的数量
 *      TreeSet 有序 不是添加顺序
 *      HashMap 无序
 *      LinkedHashMap 有序 添加删除效率高 查询效率高
 *                   能够判断某个条目是否存在
 *                   使用条目的id作为key，根据key获取条目
 *      TreeMap 有序 不是添加顺序
 *
 *  2.购物车条目的设计
 *      方案1：直接使用Product 作为购物车条目
 *
 *      方案2：使用新的类CarItem作为购物车条目
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("1.添加商品");
            System.out.println("2.查看所有商品");
            System.out.println("3.查询指定编号商品");
            System.out.println("4.添加到购物车");
            System.out.println("5.显示购物车");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("添加商品");
                    addProduct();
                    break;
                case 2:
                    System.out.println("查看所有商品");
                    showAll();
                    break;
                case 3:
                    System.out.println("查询指定编号商品");
                    showById();
                    break;
                case 4:
                    System.out.println("添加到购物车");
                    showCart();
                    break;
                case 5:
                    System.out.println("显示购物车");
                    break;
                case 6:
                    System.out.println("谢谢使用");
                    break;
                default:
                    System.out.println("请重新输入!");
            }
        }while (true);
    }

    /**
     * 从后台获取购物车信息，并在前台输出
     */
    private static void showCart() {
        CartItemDao itemDao = new CartItemDaoImpl();
        LinkedHashMap<Integer, CartItem> shoppingCart = itemDao.findCart();
        Collection<CartItem> items = shoppingCart.values();
        System.out.println("编号\t商品名称\t商品价格\t数量\t小计");
        //实现总计步骤1：初始化总计
        double sum = 0;
        for (CartItem item:items){
            System.out.println(item.getId() + "\t" + item.getName() + "\t"+ item.getPrice() + "\t" + item.getAmount() + "\t" + item.getAmount()*item.getPrice());
            //实现总计步骤2：累计每次小计
            sum += item.getAmount()*item.getPrice();
        }
        System.out.println("总计：" + sum);
    }


    private static void addProduct() {
        //在前台输入商品的相关信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入编号：");
        int id = sc.nextInt();
        System.out.println("请输入商品名称：");
        String name = sc.next();
        System.out.println("请输入商品价格：");
        double price = sc.nextDouble();
        System.out.println("请输入商品颜色：");
        String color = sc.next();
        System.out.println("请输入商品尺寸：");
        int size = sc.nextInt();
        System.out.println("请输入商品库存：");
        int stock = sc.nextInt();

        //将商品信息写入后台
        Product product = new Product(id,name,price,color,size,stock);
        ProductDao productDao = new ProductDaoImpl();
        productDao.add(product);
        //输出结果
//        System.out.println("添加成功");
    }

    private static void showById() {
        //输入要查询的商品编号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的商品编号");
        int id = sc.nextInt();
        //获取后台的商品信息
        ProductDao productDao = new ProductDaoImpl();
        Product product = productDao.findById(id);

        //输出
        System.out.println("编号\t\t商品名称  \t价格 \t颜色\t尺寸\t库存");
        if (product == null){
            System.out.println("改变好的商品不存在");
        }else{

        }
    }

    private static void showAll() {
        //获取后台的商品信息
        ProductDao productDao = new ProductDaoImpl();
        List<Product> productList = productDao.findAll();

        //输出
        System.out.println("编号\t\t商品名称  \t价格 \t颜色\t尺寸\t库存");
        for(Product product:productList){
            System.out.println(product.getId() + "\t" + product.getName() + "\t\t" + product.getPrice() + "\t" + product.getColor() + "\t" + product.getSize()+ "\t"+ product.getStock() + "\t");
        }
    }
}
