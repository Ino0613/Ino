package Project.InetAddress.TCP.Project5;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {

    private  Socket s;

    public ServerThread(Socket accept) {
        s = accept;
    }

    @Override
    public void run() {
        //接收数据写到文本文件
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Ino\\Ino\\copy.java"));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
