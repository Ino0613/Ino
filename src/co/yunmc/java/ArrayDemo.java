package co.yunmc.java;
import java.util.Scanner;

public class ArrayDemo {
//    public static void main(String[] args) {
//
//        int[] arr = new int[]{8,2,1,0,3};
//        int[] a = new int[]{2,0,3,2,4,0,1,3,2,3,3};
//        String tel = "";
//        for(int i = 0;i<a.length;i++){
//            tel += arr[a[i]];
//        }
//        System.out.println("联系方式：" + tel);
//        //180
//    }

    public static void main(String[] args) {
        //1.使用Scanner 读取学生个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生人数:");
        int num = sc.nextInt();

        //2.创建数组，存储学生成绩，动态初始化
        int[] score = new int[num];

        //3.给数组中的元素赋值
        System.out.println("请输入" + num + "个学生成绩:");
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }
        //4.获取数组中的元素的最大值:最高分
        int maxscore = 0;
        for(int i = 0;i<score.length;i++){
            if(maxscore < score[i]){
                maxscore = score[i];
            }
        }
        //5.根据每个学生成绩与最高分的插值，得到每个学生的登记，并输出登记和成绩
        char level;
        for(int i =0;i <score.length;i++){
            if(maxscore - score[i] <= 10){
                level = 'A';
            }else if(maxscore - score[i] <= 20){
                level = 'B';
            }else if(maxscore - score[i] <= 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("Student" + i +"score is " + score[i]
             + "成绩为" + level);
        }

        String[][] arra1 = new String[3][1];
        int[][] arra2 = new int[][]{{1, 2}, {3, 4,5,6}, {5, 6,7}};
        System.out.println(arra2[0].length);
        for (int i = 0; i < arra2.length; i++) {
            for (int j = 0; j < arra2[i].length; j++) {
                System.out.print(arra2[i][j]);
            }
            System.out.println();
        }





    }
}
