<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<style>
      .error {
         color: #ff0000;
      }

      .errorblock {
         color: #000;
         background-color: #ffEEEE;
         border: 3px solid #ff0000;
         padding: 8px;
         margin: 16px;
      }
</style>
<body>
<div style="height = 100px; width = 100%">
<h2 style="align: center">Menu Page</h2>
</div>
<div>

</div>

<form:form action="registered" method="POST" modelAttribute="user"> 
	<table>
		<tr>
			<td>
				<form:label path="firstName">First Name: </form:label>
				<form:input path="firstName"></form:input>
				
			</td>
			<td>
				<form:label path="lastName">Last Name: </form:label>
				<form:input path="lastName"></form:input>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="userName">Username: </form:label>
				<form:input path="userName"></form:input>
				
			</td>
			<td>
				<form:label path="password">Password: </form:label>
				<form:input path="password"></form:input>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="email">Email: </form:label>
				<form:input path="email"></form:input>
				
			</td>
			<td>
				<form:label path="phone">Phone Number: </form:label>
				<form:input path="phone"></form:input>
			</td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit"></td>
		</tr>
	</table>
</form:form>
</body>
</html>