package Project.FileStream;

import java.io.*;

/*
    字节缓冲流(构造方法)：
        BufferedOutputStream (OutputStream out)
        BufferedInputStream (InputStream in)

 */
public class BuffferedStreamDemo {
    //创建缓冲字节流
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Ino\\Test.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Ino\\Ino\\Test.txt"));
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());

        //一次读取一个字节数据
//        int by;
//        while ((by = bis.read()) != -1) {
//            bos.write(by);
//        }

        //一次读取一个字节数组
        byte[] bts = new byte[1024];
        int len;
        while ((len = bis.read(bts)) != -1) {
            System.out.println(new String(bts, 0, len));
        }

        bos.close();
        bis.close();
    }

}
