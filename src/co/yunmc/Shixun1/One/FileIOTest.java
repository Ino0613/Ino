package co.yunmc.Shixun1.One;

import java.io.*;

public class FileIOTest {
    public static void main(String[] args) {
        //1.声明流
        InputStream in = null;
        OutputStream out = null;

        //2.创建流
        File file = new File("src/co/yunmc/shixun/a.txt");
        try {
            in = new FileInputStream(file);
            out = new FileOutputStream("src/co/yunmc/shixun/b.txt");
            int a = -1;
        //3.使用流
            while ( (a = in.read()) != -1 ){
                out.write(a);
                out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
               if(out != null) out.close();
               if (in != null) in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
