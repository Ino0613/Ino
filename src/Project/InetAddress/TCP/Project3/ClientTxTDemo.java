package Project.InetAddress.TCP.Project3;

import java.io.*;
import java.net.Socket;

/*
    客户端： 数据来自于文本文件
 */
public class ClientTxTDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端对象Socket
        Socket s = new Socket("192.168.1.102", 10000);

        //封装文本数据
        BufferedReader br = new BufferedReader(new FileReader("D:\\Ino\\Ino\\1.txt"));

        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        br.close();
        s.close();
    }
}
