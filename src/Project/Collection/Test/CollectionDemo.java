package Project.Collection.Test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    /*
        需求：
            创建一个储存学生对象的集合，存储三个学生对象，使用程序实现在控制台遍历该集合
        思路:
            1.定义学生类
            2.创建Collection集合对象
            3.创建学生对象
            4.把学生添加到集合中
            5.遍历集合(迭代器方法)
     */
    public static void main(String[] args) {
        List<Students> c = new ArrayList<>();

        Students s1 = new Students("20202111","林青霞","20");
        Students s2 = new Students("20202112","张三","20");
        Students s3 = new Students("20202113", "李四", "20");

        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Students> it = c.iterator();
        while (it.hasNext()) {
            Students s = it.next();
            System.out.println(s.getName()+"," + s.getSid()+ "," + s.getAge());
        }

        for (int i = 0; i < c.size(); i++) {
            Students s = c.get(i);
            System.out.println(s.getName()+"," + s.getSid()+ "," + s.getAge());
        }

        System.out.println("------------");
        for (Students s : c){
            System.out.println(s.getName()+"," + s.getSid()+ "," + s.getAge());
        }

    }


}
