package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {
	
	private static String url="jdbc:mysql:///local_notes";//数据库连接地址
	private static String username="root";//用户名
	private static String password="root123";//密码
	private static String jdbcName="com.mysql.jdbc.Driver";//驱动名称
	
	public static Connection getCon() throws Exception{
		Class.forName(jdbcName);
		Connection conn=DriverManager.getConnection(url, username, password);
		return conn;
	}
	
	
	public void closeCon(Connection conn) throws Exception{
		if(conn!=null) {
			conn.close();
		}
	}
	
//	public static void main(String[] args) {
//		
//		DButil dbutil=new DButil();
//		try {
//			dbutil.getCon();
//			System.out.println("数据库连接成功");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("数据库连接失败");
//		}
//	}
}
