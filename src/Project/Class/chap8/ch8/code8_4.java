package Project.Class.chap8.ch8;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class code8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ����8.4 */
		Statement stmt = null;
		ResultSet rs = null; // ������Ų�ѯ���
		Connection dbConn; // ��������
		try {
			dbConn = (Connection) DBUtil.getConnection();
			assert dbConn != null;
			stmt = (Statement) dbConn.createStatement();

			System.out.println("Connection Successful!");
			String SQL = "SELECT * FROM Questions"; // SQL��ѯ����
			stmt = (Statement) dbConn.createStatement();
			rs = stmt.executeQuery(SQL); // ִ��SQL��ѯ����
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
						+ rs.getString(4) + "=" + rs.getString(5) + " " + rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}