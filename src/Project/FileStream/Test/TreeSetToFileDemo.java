package Project.FileStream.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
    需求：
        键盘录入5个学生信息（姓名，语文成绩，数学成绩，英语成绩）
    要求:
        按照成绩总分从高到低写入文本文件
    思路:
        1.定义学生类
        2.创建TreeSet集合，通过比较器排序进行排序
        3.键盘录入学生书局
        4.创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
        5.把学生对象添加到TreeSet集合
        6.创建字符缓冲输出流对象
        7.遍历集合，得到每一个学生对象
        8.把学生对象的数据拼接成指定格式的字符串
        9.调用字符缓冲流对象的方法写数据
        10.释放资源
 */
public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Students> ts = new TreeSet<>(new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                int num = s2.getSum() - s1.getSum();
                int num1 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num2 = num1 == 0 ? s1.getMath() - s2.getMath() : num1;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }

        });

        //键盘录入学生数据
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第" + (i + 1) + "个学生信息:");
            System.out.println("姓名：");
            String name = sc.next();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            //创建学生对象。把键盘录入的数据对应赋值给学生对象的成员变量
            Students s = new Students();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            //吧学生对象添加到TreeSet集合
            ts.add(s);
        }
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Ino\\Ino\\Students.txt"));

        //遍历集合，得到每一个学生对象
        for (Students s : ts) {
            bw.write(s.getName() + "," + s.getChinese() + "," + s.getMath() + "," + s.getEnglish() + "," + s.getSum());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
