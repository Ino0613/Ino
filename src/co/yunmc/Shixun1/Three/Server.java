package co.yunmc.Shixun1.Three;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        //创建ServerSocket
        try {
            ServerSocket server = new ServerSocket(8888);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
