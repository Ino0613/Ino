package Project.FileStream.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
    需求：
        有一个文件里面存储了班级同学的姓名，每一个姓名占一行,要求
     通过程序实现随机点名
    思路：
        1.创建字符缓冲输入流对象
        2.创建ArrayList集合对象
        3.调用字符缓冲输入流对象的方法读数据
        4.把读取到的字符串数据存储到集合中
        5.释放资源
        6.使用Random产生一个随机数，随机数的范围再：[0,集合的长度)
        7.把第6步产生的随机数作为索引到ArrayList集合中获取值
        8.把第7步得到的数据输出再控制台
 */
public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\Ino\\Ino\\1.txt"));

        //创建ArrayList集合对象
        ArrayList<String> arr = new ArrayList<>();

        //调用字符缓冲输入流对象的方法读数据
        //把读取到的字符串数据存储到集合中
        String line;
        while ((line = br.readLine()) != null) {
            arr.add(line);
        }

        //释放资源
        br.close();

        //使用Random产生一个随机数，随机数的范围再：[0,集合的常熟)
        Random rd = new Random();
        int num = rd.nextInt(arr.size());
        //把第6步产生的随机数作为索引到ArrayList集合中获取值
        String s = arr.get(num);
        System.out.println("幸运者是:" + s);
    }
}
