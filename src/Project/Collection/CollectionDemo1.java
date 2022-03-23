package Project.Collection;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayDeque<String>();

        //boolean add(E e) 添加元素
        System.out.println(c.add("Hello"));
        System.out.println(c.add("Java"));

        System.out.println(c);
        Iterator<String> it = c.iterator();
//        System.out.println(it.next());
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
