package Project.FileStream.Test;

import java.io.*;
import java.util.ArrayList;

/*
    需求:
        把文本文件中的数据读取到集合中，并遍历集合
    要求:
        每一个字符串元素作为文件中的一行数据
    思路:
        1.创建字符缓冲输入流对象
        2.创建ArrayList集合对象
        3.调用字符缓冲输入流对象的方法读数据
        4.把读取到的字符串数据储存到集合中
        5.释放资源
        6.遍历集合
 */
public class ArrayListDemo2 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\Ino\\Ino\\array.txt"));
        //创建ArrayList集合对象
        ArrayList<String> arr1 = new ArrayList<String>();

        String line;
        while ((line = br.readLine()) != null) {
            arr1.add(line);
        }
        br.close();

        for (String s : arr1) {
            System.out.println(s);
        }
    }
}
