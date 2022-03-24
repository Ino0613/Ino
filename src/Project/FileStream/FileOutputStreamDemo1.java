package Project.FileStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {


    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream file = new FileOutputStream("Ino\\TestFile");
        /*
            做了三件事情:
                A.调用系统共能创建了文件
                B.创建了文字输出流对象
                C.让字节输出流对象指向创建好的文件
         */
        file.write(Integer.parseInt("String"));

        //void close() 关闭此文件输出流并释放与此流相关联的任何系统资源
        file.close();
    }
}
