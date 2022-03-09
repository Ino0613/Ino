package co.yunmc.java.List.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
    HashSet: 无序  唯一
    LinkedHashSet: 有序 唯一
    TreeSet: (红黑树)有序（自然顺序） 唯一

    Set 是无序的，相比Collection没有增加任何方法,List相比Collection
 */
public class set1 {
    public static void main(String[] args) {
        //创建set集合对象
//        Set<String> set1 = new HashSet(); //快
//        Set<String> set1 = new LinkedHashSet(); //快 + 有序
        Set<String> set1 = new TreeSet();

        //添加元素
        set1.add("JavaSE");
        set1.add("MySQL");
        set1.add("JavaSE");
        set1.add("Web");

        //遍历元素
        System.out.println(set1.size());
        System.out.println(set1);
        System.out.println(set1);

        for (String e:set1){
            System.out.println(e);
        }

        Iterator<String> it = set1.iterator();
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }

        set1.forEach((e)->System.out.println(e));
    }
}
