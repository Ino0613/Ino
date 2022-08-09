package Project.InetAddress.UDP;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
        InetAddress
            此类表示Internet协议(IP)地址

        public static InetAddress getByName (String host): 确定主机名称的IP地址，主机名称
        public String getHostName() : 获取此IP地址的主机名
        public String getHostAddress () : 返回文本显示中的IP地址字符串
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //getByName(String host) 确定主机名称的IP地址
        InetAddress add = InetAddress.getByName("192.168.1.102");

        //public String getHostName() 获取此IP地址的主机名
        String name = add.getHostName();
        String ip = add.getHostAddress();
        System.out.println("主机名:" + name + "  IP为:" + ip);

    }
}
