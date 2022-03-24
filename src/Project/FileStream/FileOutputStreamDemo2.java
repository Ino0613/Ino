package Project.FileStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求:
        把文件中的内容读取出来在控制台输出
    FileInputStream: 从文件系统中的文件获取输入字节
        FileInputStream(String name), 通过打开与实际文件的连接来创建一个FileInputStream,该文件由文件系统中的路径名name

    使用字节输入流读数据的步骤:
        1.创建字节输入流对象
        2.调用字节输入流对象的读数据方法
        3.释放资源
 */
public class FileOutputStreamDemo2 {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\Ino\\Ino\\Test.txt");
            fos.write("Ino".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }  finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
