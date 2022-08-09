/*代码8.13*/
package Project.Class.chap8.ch8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class code8_13 { // TestDB
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DBUtil.getConnection();
			// 开始事务
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			// 执行存储过程
			String storedProcedure = "call proc1('11','10')";
			ResultSet rs = stmt.executeQuery(storedProcedure);
			while (rs.next()) {
				System.out.println("PlayerID: " + rs.getString("questionID"));
				System.out.println("CategoryID: " + rs.getString("CategoryID"));
				
			}
			rs.close();
			stmt.close();
			// 结束事务
			con.close();
		} catch (Exception ex) {
			try {
				con.rollback();
			} catch (SQLException sqlex) {
				ex.printStackTrace();
			}
		}
	}

}
