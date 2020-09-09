package com.blog.data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import com.blog.business.DAO;


public class DAOPOSTCRUD implements DAO {

	String dbURL = "jdbc:mysql://localhost:3306/sampledb";
	String username = "root";
	String password = "secret";
	Connection conn;
	{
		try {
			conn = DriverManager.getConnection(dbURL, username, password);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	final void Create() throws SQLException {
		String sql = "INSERT INTO BlogPosts (id, postname, body, dateposted) VALUES (?, ?, ?, ?)";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, "00001");
		statement.setString(2, "firstpost");
		statement.setString(3, "posttext");
		statement.setString(4, "04/17/2020");
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new blog post was inserted successfully!");
		}
	}

	final void Read() throws SQLException {
		String sql = "SELECT * FROM BlogPosts";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		int count = 0;
		while (result.next()) {
			String id = result.getString(1);
			String postname = result.getString(3);
			String body = result.getString("body");
			String dateposted = result.getString("dateposted");
			String output = "BlogPosts #%d: %s - %s - %s - %s";
			System.out.println(String.format(output, ++count, id, postname, body, dateposted));
		}
	}

	final void Update() throws SQLException {
		String sql = "UPDATE BlogPosts SET id=?, postname=?, body=?, dateposted=? WHERE id=?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, "00002");
		statement.setString(2, "blogpost2");
		statement.setString(3, "bodytext");
		statement.setString(4, "05/30/2020");
		int rowsUpdated = statement.executeUpdate();
		if (rowsUpdated > 0) {
			System.out.println("An existing blog post was updated successfully!");
		}
	}

	final void Delete() throws SQLException {
		String sql = "DELETE FROM BlogPosts WHERE postname=?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, "");
		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
			System.out.println("A blog post was deleted successfully!");
		}
	}

}
		