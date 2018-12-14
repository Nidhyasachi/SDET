package com.training.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
    //connection related variables
	static Connection connection;
	public PreparedStatement ps, ps1, ps2; //no limit on defining the variables
	public ResultSet rs, rs1; //no limit on defining the variables
	
	public static Connection getMySqlConnection () {
		
				try {
					Class.forName("com.mysql.jdbc.Driver");
					connection = DriverManager.getConnection("jdbc:mysql://localhost/sdetdec", "root", "Hexaware@123");
					return connection;
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		return null;
		
	}
		
	public Connection getOracleConnection () {
		return null;}
	
}
