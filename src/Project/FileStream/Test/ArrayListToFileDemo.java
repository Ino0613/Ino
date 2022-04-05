package Project.FileStream.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    需求：
        把ArrayList集合中的学生数据写入到文本文件。
    要求：
        每一个学生对象的数据作为文件中的一行数据
    格式：
        学号，姓名，年龄，居住地
    举例：
        0001,林青霞,30，西安
    思路：
        1.定义学生类
        2.创建ArrayList集合
        3.创建学生对象
        4.把学生对象添加到集合中
        5.创建字符缓冲输出流对象
        6.遍历集合，得到每一个学生对象
        7.把学生对象的数据拼接成指定格式的字符串
        8.调用字符缓冲输出流对象的方法写数据
        9.释放资源
 */
public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        //创建学生对象
        ArrayList<Student> arr = new ArrayList<Student>();
        Student s1 = new Student("2020210001", "林青霞", 30, "西安");
        Student s2 = new Student("2020210002", "王雷川", 20, "北京");
        Student s3 = new Student("2020210003", "赵新浩", 21, "太原");
        //把学生对象添加到集合中
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Ino\\Ino\\Student.txt"));
//        for (Student s : arr) {
//            //把学生对象的数据拼接成指定格式的字符串
//            StringBuilder sb = new StringBuilder();
//            sb.append(s.getNum()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
//            //调用字符缓冲输出流对象的方法写数据
//            bw.write(sb.toString());
//            bw.newLine();
//            bw.flush();
//        }

        for (Student s : arr) {
            //把学生对象的数据拼接成指定格式的字符串

            //调用字符缓冲输出流对象的方法写数据
            bw.write(s.toString());
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();

    }
}
