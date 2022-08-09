package Project.Class.chap8.ch8;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class code8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 代码8.4 */
		Statement stmt = null;
		ResultSet rs = null; // 用来存放查询结果
		Connection dbConn; // 建立连接
		try {
			dbConn = (Connection) DBUtil.getConnection();
			assert dbConn != null;
			stmt = (Statement) dbConn.createStatement();

			System.out.println("Connection Successful!");
			String SQL = "SELECT * FROM Questions"; // SQL查询代码
			stmt = (Statement) dbConn.createStatement();
			rs = stmt.executeQuery(SQL); // 执行SQL查询代码
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
						+ rs.getString(4) + "=" + rs.getString(5) + " " + rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}