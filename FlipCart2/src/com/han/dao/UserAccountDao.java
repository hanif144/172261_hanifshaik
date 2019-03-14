package com.han.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.han.conn.ConnectionFactory;

public class UserAccountDao {

	public int insert(String username, String email,String password,String repassword) throws SQLException {
		String query = "insert into uservalues values(?,?,?,?)";
	    Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setString(1, username);
		pStatement.setString(2, email);
		pStatement.setString(3, password);
		pStatement.setString(4, repassword);
		int output = pStatement.executeUpdate();
		return output;
		}
	
	public   int validate(String email, String password) throws SQLException {
		int i=0;
		String query="select COUNT(*) from uservalues where email= ? and password=?";
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, email);
		pStatement.setString(2, password);
		ResultSet count=pStatement.executeQuery();
		while(count.next()) {
			i=count.getInt(1);
		}
		return i;
	}
}
		
		
		
	
	
	
//	public static void main(String[] args) {
//		try {
//			System.out.println(new UserAccountDao().insert(new UserAccount("haneef","haneef")));
//			System.out.println(new UserAccountDao().read("haneef"));
//		}
//		catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//}

