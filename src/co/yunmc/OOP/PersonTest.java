package co.yunmc.OOP;

/*
    八种基本数据类型: boolean、byte、char、short、
                   int、float、long、double
    OOP(面向对象） Object Oriented
    一、设计类，其实就是设计类的成员
        属性 = 成员变量 = field = 域、字段
        方法 = 成员方法 = 函数 = method
        创建类的对象 = 类的实例化 = 实例化类
    二、类和对象的使用（面向对象思想落地的实现）
        1.创建类、设计类的成员
        2.创建类的对象
        3.通过 “对象.属性” or "对象.方法" 来调用对象的结构
    三、如果创建了一个类的多个对象，
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();

        //调用对象的结构: 属性、方法
        //调用属性: "对象.属性"
        p1.name = "Tom";
        p1.age = 20;
        p1.isMale = true;
        System.out.println(p1.name + p1.age + p1.isMale);

        //调用方法: "对象.方法"
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        Person p2 = new Person();
        System.out.println(p2.name);
        System.out.println(p2.age);

    }
}

class Person{

    //属性
    String name;
    int age = 1;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }

    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话:" + language);

    }

}
