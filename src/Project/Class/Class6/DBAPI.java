package Project.Class.Class6;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBAPI {


    public static Connection conn = null;
    public static PreparedStatement stmt = null;
    public static ResultSet rs = null;
    public static String driver = null;
    public static String url = null;
    public static String username = null;
    public static String password = null;


    /*
    * 加载配置文件 初始化
     */
    static {
        Properties prop = new Properties();
        //加载配置文件
        try {
            prop.load(DBAPI.class.getClassLoader().getResourceAsStream("db.properties"));
            driver = prop.getProperty("driver");
            url = prop.getProperty("url");
            username = prop.getProperty("username");
            password = prop.getProperty("password");
            //加载驱动
            Class.forName(driver);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * 获得连接
     */
    public static Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url, username, password);
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("连接失败！");
        }

        return connection;
    }

    /**
     * 获取操作数据库的对象
     * @param sql 语句
     * @param ob 可变参数
     * @return
     */
    public static PreparedStatement getStmt(String sql, Object... ob) {
        //加载驱动
        try {
            //创建连接对象
            conn = getConnection();
            //创建执行对象
            stmt = conn.prepareStatement(sql);
            if (ob.length > 0) {
                for (int i = 0; i < ob.length; i++) {
                    stmt.setObject(i + 1, ob[i]);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stmt;
    }

    /**
     * 查询
     * 返回查询结果的集合
     * @param sql 语句
     * @param ob 可变参数
     * @return rs 结果集合
     */
    public static ResultSet mySelect(String sql, Object... ob) {
        PreparedStatement pstm = getStmt(sql, ob);
        try {
            rs = pstm.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    /**
     * 关闭连接 释放资源
     */
    public static void closeAll(){
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
