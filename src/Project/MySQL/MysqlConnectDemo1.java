package Project.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConnectDemo1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 加载驱动类
        Class.forName("com.mysql.jdbc.Driver");

        // 构建连接参数
        String url = "jdbc:mysql://localhost:3306/1";
        String user = "root";
        String password = "Zhang010613.";

        // 获取连接对象
        Connection connection = DriverManager.getConnection(url, user, password);

        // 获取执行者
        Statement statement = connection.createStatement();

        // 判断连接对象
        if (connection == null) {
            System.out.println("连接失败");
        }else {
            System.out.println("连接成功");
        }
        connection.close();
    }
}
