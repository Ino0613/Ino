package Project.InetAddress.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
    UDP发送数据的步骤
        1.创建发送端的Socket对象(DatagramSocket)
        2.创建数据，并把数据打包
        3.调用DatagramSocket对象的方法发送数据
        4.关闭发送端
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并把数据打包
        byte[] bys = "Hello,UDP,我来了".getBytes();
        int len = bys.length;
        InetAddress add = InetAddress.getByName("192.168.1.102");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys,len,add,port);
        //发送数据
        ds.send(dp);
        ds.close();
    }
}
