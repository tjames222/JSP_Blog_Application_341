<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<h3>Please Enter Login Information:</h3>
	
	<form method="POST" action="postFeed">
		<table>
			<tr>
				<td><label for="username">Username:</label></td>
				<td><input type="text" id="username"></td>
			</tr>
			<tr>
				<td><label for="password">Password:</label></td>
				<td><input type="password" id="password"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Submit"/></td>
			</tr>
		</table>
	</form>
	<form method="POST" action="register">
	<input type="submit" name="register" value="Register"/>
	</form>

</body>
</html>