package Project.FileStream;

import java.io.*;

public class SystemInDemo {
    public static void main(String[] args) throws IOException {
//        InputStream is  = System.in;
////        int n;
////        while ((n = is.read()) != -1) {
////            System.out.print((char)n);
////        }
//
//        InputStreamReader bis = new InputStreamReader(is);
//
//        BufferedReader br = new BufferedReader(bis);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串：");
        String Line = br.readLine();

        System.out.println("输入的字符串为:" + Line);
        System.out.println("请输入一个整数:");
        int i = Integer.parseInt(br.readLine());
        System.out.println("输入的整数为：" + i);
    }
}
