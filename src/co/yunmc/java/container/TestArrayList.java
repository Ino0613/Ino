package co.yunmc.java.container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


        /*
            ArrayList的其他方法
            增加
            add(elem)
            add(i,elem)
            addAll(list)
            addAll(i,collection)

            删除
            removeAll(e)
            retailAll(e)
            remove(e)
            set(2,10)
            clear()

         */
public class TestArrayList {
    public static void main(String[] args) {
        //创建一个集合对象
        List list = new ArrayList();
        List list3 = new ArrayList();
        //添加元素
        list.add(80);
        list.add(1,100);
//        list.add("Ino");
        list.add(1);

        //元素的数量
        int i1 = list.size();
        System.out.println(i1);
        //获取指定索引的元素
        int i2 = (int) list.get(1);
        System.out.println(i2);

        //遍历元素
        //方法一  for循环
        for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
        //方法二
        String i3 = list.toString();
        System.out.println(i3);
        //方法三 for-each循环
        for (Object e:list
             ) {
            System.out.println(e);
        }
        //方法四  Iterator
        Iterator it = list.iterator();
        while(it.hasNext()){ //是否有元素
            int it1 = (int)it.next();
            System.out.println(it1);
        }
        System.out.println("================");
        //方法五  Lambda 表达式+ 流式编程
        list.forEach((i4)->System.out.println(i4));
        list.forEach(System.out::print);
        System.out.println();
        System.out.println("================");
        System.out.println("================");
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(6);
        list2.add(9);
        list2.add(100);
        list2.addAll(list);
        System.out.println(list2);

        list2.remove(list2.indexOf(6)); //删除索引元素
        System.out.println(list2);

        list2.remove(1); //删除索引元素
        System.out.println(list2);

        System.out.println("=================");
        list2.set(2,613);
        System.out.println(list2);

        list2.addAll(2,list);
        System.out.println(list2);

        list2.removeAll(list);
        System.out.println(list);
        System.out.println(list2);

        list2.retainAll(list); //两个数组的交集
        System.out.println(list2);

        System.out.println(list.contains(90));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(80));

    }


}
