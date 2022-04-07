package Project.FileStream.Test;

import java.io.*;

/*
        需求：
            把某视频 复制到模块目录下的
        思路：
            1.根据数据源创建字节输入流对象
            2.根据目的地创建字节输出流对象
            3.读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
            4.释放资源

        四种方式实现复制视频，并记录每种方式复制视频的时间
            1.基本字节流一次读写一个字节          共耗时: 42796 ms
            2.基本字节流一次读写一个字节数组       共耗时: 81 ms
            3.字节缓冲流一次读写一个字节          共耗时: 91 ms
            4.字节缓冲流一次读写一个字节数组       共耗时: 20 ms
     */
public class Copymp4Demo {

    public static void main(String[] args) throws IOException {
        //记录开始时间
        long starttime = System.currentTimeMillis();

        //复制视频
//        copymovie1();
//        copymovie2();
//        copymovie3();
        copymovie4();
        //记录结束时间
        long endtime = System.currentTimeMillis();
        System.out.println("共耗时: " + (endtime - starttime) + " ms");

    }

    public static void copymovie4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Ino\\c.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Ino\\Ino\\c.mp4"));
        byte[] bts = new byte[1024];
        int len;
        while ((len = bis.read(bts)) != -1) {
            bos.write(bts,0,len);
        }
        bos.close();
        bis.close();
    }

    public static void copymovie3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Ino\\c.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Ino\\Ino\\c.mp4"));
        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
        bos.close();
        bis.close();
    }

    public static void copymovie2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Ino\\c.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\Ino\\Ino\\c.mp4");
        byte[] bt = new byte[1024];
        int len;
        while ((len = fis.read(bt)) != -1) {
            fos.write(bt,0,len);
        }
        fos.close();
        fis.close();
    }

    public static void copymovie1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Ino\\c.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\Ino\\Ino\\c.mp4");
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();

    }

}
