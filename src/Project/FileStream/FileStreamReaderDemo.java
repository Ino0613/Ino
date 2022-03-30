package Project.FileStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    读数据的2中方式:
        int read() 一次读一个字符数据
        int read(char[] cbuf) 一次读一个字符数组数据
 */
public class FileStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Ino\\Ino\\1.txt"));
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.print((char) ch);
//        }
//        isr.close();

        char[] chas = new char[1024];
        int len;
        while ((len = isr.read(chas)) != -1) {
            System.out.print(new String(chas, 0, len));
        }

        isr.close();
    }
}
