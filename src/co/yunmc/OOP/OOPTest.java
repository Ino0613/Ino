package co.yunmc.OOP;
/*
    一、Java面向对象学习的三条主线
       1.Java类及类的成员、属性、方法、构造器；代码块、内部类
       2.面向对象的三大特征：封装性、继承性、多态性
       3.其他关键字：this、super、static、final、interface、
         package、import、extends
    面向过程（POP）  Procedure Oriented Programming
    面向对象（OOP）  Object Oriented Programming
 */

public class OOPTest {
    String name = "张三";
    int age = 21;
    public void main(String[] args) {
        this.name=name;
        this.age=age;
        System.out.println(name + age);
    }
}
