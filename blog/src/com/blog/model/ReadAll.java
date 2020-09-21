package com.blog.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadAll {

	String dbURL = "jdbc:mysql://localhost:3306/user";
	String user = "root";
	String password = "root";

	Connection c = null;
	Statement stmt = null;
	ResultSet rs;
	{
		try
		{
				c = DriverManager.getConnection(dbURL, user, password);
				System.out.println("Connection successful ");
				
				stmt = c.createStatement();
				
				rs = stmt.executeQuery("select * from user.user");
				
				while(rs.next()) {
					System.out.println("id = " + rs.getInt("id") + "user = " + rs.getString("user") + "password = " + rs.getString("password"));
				}
				
		}catch(SQLException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Error with database communication");
			e.printStackTrace();
		}finally
		{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
