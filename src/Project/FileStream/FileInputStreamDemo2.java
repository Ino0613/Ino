package Project.FileStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\Ino\\Ino\\Test.txt");
        int by = fis.read();
        System.out.println(by);
        System.out.println((char) by);

//        while (by != -1) {
//            System.out.print(by);
//            System.out.print((char)by);
//            by = fis.read();
//        }
        int by1;
        while ((by1 = fis.read()) != -1) {
            System.out.print((char)by1);

        }

        fis.close();
    }
}
