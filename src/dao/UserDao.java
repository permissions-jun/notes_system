package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import moudle.user;
import util.DButil;

public class UserDao {
	

	public user login(Connection con,user user,String userid)throws Exception{
		user resultUser=null;
		String sql="select * from user where user_name=? and password=? and permissions=?";//sql语句查询
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, user.getUser_name());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getId());
		ResultSet rs=pstmt.executeQuery();//返回结果集，没有查询对象则rs。next（）返回false
		if(rs.next()) {
			resultUser =new user();
			resultUser.setId(rs.getString("id"));
			resultUser.setPassword(rs.getString("password"));
			resultUser.setUser_name(rs.getString("user_name"));
		}
		return resultUser;
	}

	public int Reg(String name, String pswd) throws Exception {
		Connection con=null;
		con=DButil.getCon();
		String sql="insert into user values(null,?,?,0)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, pswd);
		int count=pstmt.executeUpdate();
		return count;

		
	}

	
	 

}
