package co.yunmc.Shixun1.One;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//InputStream
//    public long skip (long n );
//    跳过此输入流中n个字节；
//    public void close();
//    关闭此输入流，并释放与该流管理的所有系统资源


public class IOTest {
    public static void main(String[] args) {
        //1.声明流
        InputStream in = null;
        OutputStream out = null;

        //2.创建流
        in = System.in;//System类中已经存在的一个流
        out = System.out;//控制台输出

        //3.使用流
        try {
//            int i = in.read();
//            out.write(i);
//            out.flush();//刷新缓冲区，强制将所有的数据都写出去

            int b = -1;
            while ( ( b = in.read() ) != -1 ){
                out.write(b);
                out.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //4.关闭资源 无论是否发生报错
            try {
                if(out != null )
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(in !=null )//防止发生空指针异常
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
