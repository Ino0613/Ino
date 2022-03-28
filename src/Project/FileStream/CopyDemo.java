package Project.FileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求：
        复制

        数据源:
        E:\\Ino\\1.txt --- 读数据 --- InputStream --- FileInputStream

        目的地:
        D:\\Ino\\Ino\\1.txt --- 写数据 --- OutputStream --- FileOutputStream

    思路：
        1.根据数据源创建字节输入流对象
        2.根据目的地创建字节输出流对象
        3.读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
        4.释放资源
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        //根据数据流创建字节输入流对象
        FileInputStream fis = new FileInputStream("E:\\Ino\\1.txt");
        //根据目的地创建字节输出流对象昂
        FileOutputStream fos = new FileOutputStream("D:\\Ino\\Ino\\1.txt");

        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();

    }
}
