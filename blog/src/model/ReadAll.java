String dbURL = "jdbc:mysql://localhost:3306/user";
		String user = "root";
		String password = "root";
		
		Connection c = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			c = DriverManager.getConnection(dbURL, user, password);
			System.out.println("Connection successful ");
			
			stmt = c.createStatement();
			
			rs = stmt.executeQuery("select * from user.user");
			
			while(rs.next()) {
				System.out.println("id = " + rs.getInt("id") + "user" = rs.getString("user") + "password = " + rs.getString("password")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error with database communication");
			e.printStackTrace();
		} finally {
			rs.close();
			
			stmt.close();
			
			c.close();
		}
		
		

	}

}
