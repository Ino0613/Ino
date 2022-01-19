package co.yunmc.Shixun1.Two;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BufferedTest {
    public static void main(String[] args) {
        //1.声明流
        BufferedReader br = null;
        PrintWriter pw = null;
        //2.创建流
        try {
            br = new BufferedReader(new FileReader("src/co/yunmc/Shixun1/Two/a.txt"));
            pw = new PrintWriter(new FileWriter("src/co/yunmc/Shixun1/Two/b.txt"));

//            String br1 = br.readLine();//读取一行
//            System.out.println(br1);
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
            String a = null;
            while ( (a = br.readLine()) != null){
                pw.println(a);
                pw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            try {
                if (pw != null) pw.close();
                if (br != null) br.close();
            } catch (Exception e){
                System.out.println("关闭资源发生报错");
            }

        }
    }
}
