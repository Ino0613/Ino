package Project.Class.Class6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author 写你的名字
 * @Date 2022/5/24 17:58 （可以根据需要修改）
 * @Version 1.0 （版本号）
 */
public class TestDBA {
    public static void main(String[] args) throws SQLException {
        Connection con = DBAPI.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = DBAPI.mySelect("select from * consumer",con);

    }
}
