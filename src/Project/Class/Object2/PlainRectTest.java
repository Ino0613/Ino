package Project.Class.Object2;

import java.util.Scanner;

public class PlainRectTest {
    public static void main(String[] args) {
        PlainRect p1 = new PlainRect(10, 10, 20, 10);
        int a1 = p1.getArea();
        int c1 = p1.getCycle();
        System.out.println("�þ��ε����Ϊ��" + a1);
        System.out.println("�þ��ε��ܳ�Ϊ��" + c1);
        boolean i1 = p1.isInside(25,13);
        boolean i2 = p1.isInside(29,19);
        if (i2) {
            System.out.println("�õ��ھ�����");
        }else
            System.out.println("�㲻�ھ�����");
        System.out.println("��ֱ�����������");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        boolean i3 = p1.isInside(sc1.nextDouble(),sc2.nextDouble());
        if (i3) {
            System.out.println("�õ��ھ�����");
        }else
            System.out.println("�㲻�ھ�����");
    }
}
