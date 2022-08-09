package Project.Class.chap8.ch8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class code8_5 {
	public static void main(String[] args) {
		/* 代码8.5,使用游标控制结果集。例如：查询Question表中的所有信息，并将所有元组逆序输出 */

		Statement stmt = null;
		ResultSet rs = null; // 用来存放查询结果
		Connection dbConn; // 建立连接
		try {
			dbConn = DBUtil.getConnection();
			System.out.println("Connection Successful!");
			String SQL = "SELECT * FROM student"; // SQL查询代码
			stmt = dbConn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery(SQL); // 执行SQL查询代码
			rs.last(); // 将游标移动到结果集的最后一行
			rs.afterLast(); // 将游标移动到结果集的最后一行之后
			while (rs.previous()) { // 将游标向上移动，当移动到结果集的第一行时返回false
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
						+ rs.getString(4) + "=" );//+ rs.getString(5) + " " + rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
