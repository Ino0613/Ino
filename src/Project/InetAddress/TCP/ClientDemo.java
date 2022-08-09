package Project.InetAddress.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
    TCP发送数据的步骤
        1.创建客户端是Socket对象(Socket)
        2.获取输出流，写数据
        3.释放资源
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象
        //Socket st = new Socket(InetAddress.getByName("192.168.1.102"), 10000);
        Socket st = new Socket("192.168.1.102", 10000);

        //获取输出流，写数据
        OutputStream os = st.getOutputStream();
        os.write("Hello,TCP,我来了".getBytes());

        //释放资源
        st.close();
    }
}
