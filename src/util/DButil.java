package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {
	
	private static String url="jdbc:mysql:///local_notes";//���ݿ����ӵ�ַ
	private static String username="root";//�û���
	private static String password="root123";//����
	private static String jdbcName="com.mysql.jdbc.Driver";//��������
	
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
//			System.out.println("���ݿ����ӳɹ�");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("���ݿ�����ʧ��");
//		}
//	}
}
