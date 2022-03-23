package Project.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

    /*
        创建Collection集合的对象
            多态的方式
            ArrayList()
     */
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();

        //添加元素,boolean add (E e)
        c.add("Hello");
        c.add("Java");

        //输出
        System.out.println(c);
    }
}
