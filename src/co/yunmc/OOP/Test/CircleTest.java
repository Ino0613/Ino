package co.yunmc.OOP.Test;
import java.util.Scanner;
/*
    2.利用面向对象的编程方法，设计类Circle计算圆的面积。
 */

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        double area = c1.findArea();
        System.out.println("请输入圆的半径");
        Scanner s1 = new Scanner(System.in);
        double radius = s1.nextDouble();
        System.out.println("圆的面积为：" + area);
    }
}
//圆
class Circle{
    //属性
    double radius;

    //求圆的面积
    public double findArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
