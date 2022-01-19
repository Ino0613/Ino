package co.yunmc.Shixun1.Two;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriterTest {
    //字符输入流 和 字符输出流
    public static void main(String[] args) {
        //1.声明流
        Reader in = null;
        Writer out = null;
        //2.创建流
        try {
            in = new FileReader("src/co/yunmc/Shixun1/Two/a.txt");
            out = new FileWriter("src/co/yunmc/Shixun1/Two/b.txt");

            //3.使用流
            in.read();//每次读取一个字符
            int c = -1;
            while ( (c = in.read()) != -1){
                out.write(c);
                out.flush();
            }
            System.out.println("a.txt的内容完全写出到b.txt");
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                if ( out != null) out.close();
                if ( in != null) in.close();
            } catch (Exception e) {
                System.out.println("关闭资源的时候发生报错");
                e.printStackTrace();
            }
        }
    }
}
