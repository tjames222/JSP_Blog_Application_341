package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/user";
		String user = "root";
		String password = "root";
		
		Connection c = null;
		Statement stmt = null;
		int rowsAffected = 0;
		
		try {
			c = DriverManager.getConnection(dbURL, user, password);
			System.out.println("Connection successful ");
			
			stmt = c.createStatement();
			
			rowsAffected = stmt.executeUpdate("insert into user.user");
			
			System.out.println("Rows affected " + rowsAffected);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error with database communication");
			e.printStackTrace();
		} finally {
			
			stmt.close();
			
			c.close();
		}
	}
}