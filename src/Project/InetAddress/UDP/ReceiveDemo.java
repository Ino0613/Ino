package Project.InetAddress.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
    UDP接收数据的步骤
        1.创建接受端的Socket对象(DatagramSocket)
        2.创建一个数据包，用于接收数据
        3.调用DatagramSocket对象的方法接收数据
        4.解析数据包，并把数据在控制台显示
        5.关闭接收端
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {

        //创建接受端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包，用于接收数据
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        //调用DatagramSocket对象的方法接收数据
        ds.receive(dp);

        //解析数据包，并把数据在控制台显示
        byte[] data = dp.getData(); //数据缓冲区
        int leng = dp.getLength();  //数据的长度
        String dataString = new String(data,0,leng);
        System.out.println("数据是:" + dataString);

        //关闭接收端
        ds.close();
    }
}
