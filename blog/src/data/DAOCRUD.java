package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Optional;

import business.DAO;


public class DAOCRUD implements DAO
{

	String dbURL = "jdbc:mysql://localhost:3306/sampledb";
	String username = "root";
	String password = "secret";
	Connection conn;
	{
	try 
		{
		conn = DriverManager.getConnection(dbURL, username, password); 
		} 
	catch (SQLException ex) 
		{
			ex.printStackTrace();
		}			
	}
		
final void Create() throws SQLException
	{
	String sql = "INSERT INTO Users (id, user, password) VALUES (?, ?, ?)";
	PreparedStatement statement = conn.prepareStatement(sql);
	statement.setString(1, "00001");
	statement.setString(2, "password");
	statement.setString(3, "jsmith");
	int rowsInserted = statement.executeUpdate();
	if (rowsInserted > 0) 
		{
			System.out.println("A new user was inserted successfully!");
		}	
	}
final void Read() throws SQLException
	{
		String sql = "SELECT * FROM Users"; 
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		int count = 0;
		while (result.next())
			{
				String name = result.getString(2);
				String id = result.getString(3);
				String user = result.getString("user");
				String password = result.getString("password");
				String output = "User #%d: %s - %s - %s - %s";
				System.out.println(String.format(output, ++count, user, id, password));
			}
	}

final void Update() throws SQLException
	{
		String sql = "UPDATE Users SET id=?, user=?, password=? WHERE user=?"; 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, "00002");
		statement.setString(2, "jsmith");
		statement.setString(3, "Passw@rd");
		statement.setString(4, "jsmithe"); 
		int rowsUpdated = statement.executeUpdate();
		if (rowsUpdated > 0) 
			{
				System.out.println("An existing user was updated successfully!");
			}
	}

final void Delete() throws SQLException
	{
	String sql = "DELETE FROM Users WHERE username=?"; 
	PreparedStatement statement = conn.prepareStatement(sql);
	statement.setString(1, "jsmith");
	int rowsDeleted = statement.executeUpdate();
	if (rowsDeleted > 0) 
		{
    		System.out.println("A user was deleted successfully!");
		}
	}
}
		