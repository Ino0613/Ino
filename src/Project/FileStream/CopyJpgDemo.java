package Project.FileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求：
        E:\\Ino\\1.png 复制到模块目录下的1.png

    思路：
        1.根据数据源创建字节输入流对象
        2.根据目的地创建字节输出流对象
        3.读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
        4.释放资源
 */
public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\Ino\\1.jpg");
        //字节输出流对象昂
        FileOutputStream fos = new FileOutputStream("D:\\Ino\\Ino\\1.jpg");
        byte[] bts = new byte[1024];
        int len;
        while ((len = fis.read(bts)) != -1) {
            fos.write(bts, 0, len);
        }
        fos.close();
        fis.close();



    }
}
