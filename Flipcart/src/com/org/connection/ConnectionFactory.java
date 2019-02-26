package com.org.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static Connection conn;
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");

			conn=DriverManager.getConnection("\"jdbc:oracle:thin:@localhost:1521:xe\", \"system\", \"system\"");
	return conn;
	
	}
}
