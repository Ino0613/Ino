package Project.FileStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    需求：
        把fos.txt中的内容读取出来在控制台输出

    使用字节输入流读取数据的步骤:
        1.创建字节输入流对象
        2.调用字节输入流对象的读数据方法
        3.释放资源
 */
public class FileInputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\Ino\\Ino\\1.txt");
        int by;
        //调用字节输入流对象的读数据方法
        //int read (byte[] b)，从该数据流读取最多b.length个字节的数据到一个字节数组中
        byte[] bt = new byte[5];

        //第一次读取数据
//        int len = fis.read(bt);
//        System.out.println(len);
//
        byte[] bts = new byte[1024]; //1024及其整数倍数
        int len;
        while ((len = fis.read(bts)) != -1) {
            System.out.println(new String(bts,0,len));
        }
        //释放资源
        fis.close();
    }
}
