package Project.Class.chap8.ch8;

import java.sql.*;
public class DBUtil {
	private final static String DBDRIVER="com.mysql.jdbc.Driver";//com.mysql.cj.jdbc.Driver
	private final static String DBURL="jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8";
	private final static String DBUSER="root";
	private final static String DBPASSWORD="Zhang010613.";//
	public static  Connection getConnection(){
		try{
			Class.forName(DBDRIVER);
			Connection conn=DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
			return conn;
		}catch(ClassNotFoundException e){
			System.out.println("error");
			System.out.println(e.getMessage());
		}catch(SQLException e){
			System.out.println("error");
			System.out.println(e.getMessage());
		}
		return null;
	}
	public static void close(ResultSet rs,Statement st,Connection conn){
		try {
			if(rs!=null)
				rs.close();
			if(st!=null)
				st.close();
			if(conn!=null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static ResultSet executeQuery(String sql){
		
			Connection conn=DBUtil.getConnection();
			ResultSet rs=null;
			Statement st=null;
		try{
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			return rs;
		}catch(SQLException ex){
			System.out.println(ex.getMessage());
		}
		return null;
	}
	}
