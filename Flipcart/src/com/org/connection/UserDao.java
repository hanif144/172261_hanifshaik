package com.org.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.org.user.UserValues;

public class UserDao {
	
	
	public String insert(UserValues user) throws ClassNotFoundException, SQLException
	{
		try
		{
			
		String query="insert into uservalues values(?,?,?,?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, user.getUsername());
		pStatement.setString(2, user.getEmail());
		pStatement.setString(3, user.getPassword());
		pStatement.setString(4, user.getRepassword());
		pStatement.executeUpdate();
	
		
	}
	
	catch(Exception e) {
        e.printStackTrace();

		}
		return "inserted";
}
	
public  boolean validate(String username1,String password) {
		
		System.out.println(username1+" "+password);
		try {
		 //String queryString = "SELECT * FROM users where user_emailid=? and user_password=?";
			Connection con=ConnectionFactory.getConnection();
			System.out.println(con);
					String query = "SELECT email, password FROM uservalues";
			
		     PreparedStatement s=con.prepareStatement(query);
		      
		     
		      ResultSet results =s.executeQuery(query);
		    
			
			 while (results.next())
			 { 
				 System.out.println("inside while");
				 String emailid = results.getString("EMAIL");
			  String pass = results.getString("PASSWORD");
			  
			 if ((username1.equals(emailid)) && (password.equals(pass)))
			 { 
				 
				 return true;
			
			 } }
			
		      
		}
		catch (Exception e) {
			 e.printStackTrace();
		}
		return false;
		 
		
		
	}

//public static void main(String[] args) {
//	UserDao dao=new UserDao();
//	System.out.println(dao.validate("user@gmail.com", "123"));
//}

}

