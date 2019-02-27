package com.org.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
	
private static Connection conn;
public static Connection getConnection() throws ClassNotFoundException, SQLException {
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orcl11g");
	
	return conn;
	
}

}
