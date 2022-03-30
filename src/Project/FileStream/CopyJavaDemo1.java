package Project.FileStream;

import java.io.*;

/*
    需求:
        把模块目录下的 .java文件复制到模块目录下的Copy.java

    思路：
        1.根据数据源创建字符输入流对象
        2.根据目的地创建字符输出流对象
        3.读写数据，复制文件
        4.释放资源
 */
public class CopyJavaDemo1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Ino\\Ino\\Test.java"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Ino\\Ino\\Test1.java"));

//        int by ;
//        while ((by = isr.read()) != -1) {
//            osw.write(by);
//        }
//        osw.close();
//        isr.close();
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs,0,len);
        }
        osw.close();
        isr.close();
    }
}
