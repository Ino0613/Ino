package Project.Class.Object2;

import java.util.Scanner;

public class PlainRectTest {
    public static void main(String[] args) {
        PlainRect p1 = new PlainRect(10, 10, 20, 10);
        int a1 = p1.getArea();
        int c1 = p1.getCycle();
        System.out.println("该矩形的面积为：" + a1);
        System.out.println("该矩形的周长为：" + c1);
        boolean i1 = p1.isInside(25,13);
        boolean i2 = p1.isInside(29,19);
        if (i2) {
            System.out.println("该点在矩形中");
        }else
            System.out.println("点不在矩形中");
        System.out.println("请分别输入两个点");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        boolean i3 = p1.isInside(sc1.nextDouble(),sc2.nextDouble());
        if (i3) {
            System.out.println("该点在矩形中");
        }else
            System.out.println("点不在矩形中");
    }
}
