package Project.Class.chap8.ch8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class code8_5 {
	public static void main(String[] args) {
		/* ����8.5,ʹ���α���ƽ���������磺��ѯQuestion���е�������Ϣ����������Ԫ��������� */

		Statement stmt = null;
		ResultSet rs = null; // ������Ų�ѯ���
		Connection dbConn; // ��������
		try {
			dbConn = DBUtil.getConnection();
			System.out.println("Connection Successful!");
			String SQL = "SELECT * FROM student"; // SQL��ѯ����
			stmt = dbConn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery(SQL); // ִ��SQL��ѯ����
			rs.last(); // ���α��ƶ�������������һ��
			rs.afterLast(); // ���α��ƶ�������������һ��֮��
			while (rs.previous()) { // ���α������ƶ������ƶ���������ĵ�һ��ʱ����false
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
						+ rs.getString(4) + "=" );//+ rs.getString(5) + " " + rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
