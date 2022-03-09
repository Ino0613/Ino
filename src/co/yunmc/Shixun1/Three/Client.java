package co.yunmc.Shixun1.Three;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        //1.创建对象
        Socket client = null;
        InputStream cl = null;
        BufferedReader br = null;
        try {
            System.out.println("客户端启动中...");
            client = new Socket("0.0.0.0",8888);
            System.out.println("客户端启动成功");
            //2.获取IO流
            cl = client.getInputStream();
            br = new BufferedReader(new InputStreamReader(cl));
            //客户端接收 服务器传输的数据
            String line = br.readLine();
            System.out.println(line);
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));

            pw.println("客户端：服务器你好，我是客户端");
            pw.flush();

            //需求 把某一个对象传输给服务端
            //ObjectOutputStream ObjectInputStream
            ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

              if (br != null) br.close();
              if (client != null) client.close();

            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
