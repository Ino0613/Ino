import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        test1();
    }
    public static void name(){
        String s = "软件2001班-2020210121-张圃杰";
        System.out.println(s);
    }

    public static void num(){
        System.out.println("请输入要判断的年份:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int year = Integer.parseInt(s);
        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("该年份为闰年");
        } else {
            System.out.println("该年份不是闰年");
        }
    }

    public static void test1(){
        int[] a = {1, 9, 15, 17, 27, 55, 68, 34, 93, 45};
        System.out.println("请输入数组中要查询的数字:");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == s) {
                System.out.println("该数字存在数组中,位置是" + i);
                break;
            }else
                flag=false;
        }
        if (!flag){
            System.out.println("该数字不存在数组中");
        }
    }
}