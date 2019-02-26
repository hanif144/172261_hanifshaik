package com.org.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.org.user.UserValues;

public class UserDao {
	
	public int insert(UserValues user) throws ClassNotFoundException, SQLException
	{
		String query="insert into user values(?,?,?,?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, user.getUsername());
		pStatement.setString(2, user.getEmail());
		pStatement.setString(3, user.getPassword());
		pStatement.setString(4, user.getRepassword());
		int output=pStatement.executeUpdate();
		return output;
	}
		
		public static void main(String[] args) {

				try {
					System.out.println(new UserDao().insert(new UserValues("haneef","haneefss.274@gmail.com","honey","honey")));
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
		}

	

	
		
		
	}


