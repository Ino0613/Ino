package Project.File;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //File(String pathname) 通过将给定的路径名字符串转化为抽象路径名来创建i虚拟的File
        File f1 = new File("D:\\Ino\\1.txt");
        System.out.println(f1);

        //File(String parent,String child) 从父路径名字符串和子路径名字符串创建新的FIle
        File f2 = new File("E:\\Ino", "java.txt");
        System.out.println(f2);

        //File(File parent,String child) 从父抽象路径名和子路径名字符串创建新的File
        File f3 = new File("E:\\Ino");
        File f4 = new File(f3, "java.ext");
        System.out.println(f4);

    }
}
