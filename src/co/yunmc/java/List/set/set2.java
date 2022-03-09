package co.yunmc.java.List.set;

import java.util.HashSet;
import java.util.Set;

public class set2 {
    public static void main(String[] args) {
        //创建set集合对象
        Set<Students> set = new HashSet<>();
        //使用set储存多个学生信息
        Students stu1 = new Students("张三","男",20,98);
        Students stu2 = new Students("李四","男",21,38);
        Students stu3 = new Students("王五","女",20,66);
        Students stu4 = new Students("张三","男",20,98);

        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);

        System.out.println(set);

    }
}
