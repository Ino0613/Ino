package co.yunmc.Shixun1.One;

import java.io.File;
//文件字节输入流和文件字节输出流
//FileInputStream  -->  文件 -> 程序  读取的过程
//FileOutputStream -->  程序 -> 文件  写入的过程
public class FileTest {
    public static void main(String[] args) {
        //绝对路径
        String a = "D:/Desktop/";
        //相对路径
        String c = "src/co/yunmc/shixun/IOTest.java";
        File file = new File(a);
        File file1 = new File(c);
        boolean b = file.exists();
        boolean d = file1.exists();
        System.out.println(b);
        System.out.println(d);

        if (file.exists()){
            //进行一系列的操作
            long length = file.length();
            System.out.println(length);
        }
    }
}
