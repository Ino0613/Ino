package cn.iyunmc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestJdbc {
    public static void main(String[] args) throws Exception {

        //加载Class类名
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
        String name = "root";
        String password = "Zhang010613.";
        Connection conn = DriverManager.getConnection(url,name,password);
        Statement stmt = conn.createStatement();

        String sql = "update student set tel = 200 where id = 1";
        stmt.executeUpdate(sql);

        stmt.close();
        conn.close();
    }
}
