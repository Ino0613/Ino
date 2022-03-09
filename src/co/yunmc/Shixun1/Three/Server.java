package co.yunmc.Shixun1.Three;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        //1.创建ServerSocket
        Socket accept = null;
        PrintWriter pw = null;
        BufferedReader br = null;
        try {
            System.out.println("服务器启动......");
            ServerSocket server = new ServerSocket(8888);
            System.out.println("服务器启动成功");

            //2.accept() 等待客户端的连接,调用此方法以后，程序会进入阻塞状态
            System.out.println("等待客户端的连接......");
            accept = server.accept();
            System.out.println("有一个客户端连接成功");
            //3.IO流  需求：想每一次写出一行数据
            //字节流 -> 字符流 -> PrintWriter
            OutputStream out = accept.getOutputStream();
            pw = new PrintWriter(new OutputStreamWriter(out));
            //
            pw.println("服务端：客户端你好");
            pw.flush();

            //读取客户端发送给你的消息
            br = new BufferedReader(new InputStreamReader(accept.getInputStream()));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (pw != null) pw.close();
                if (accept != null) accept.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
