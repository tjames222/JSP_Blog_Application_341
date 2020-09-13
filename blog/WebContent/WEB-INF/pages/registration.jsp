<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<br><br><br>
<div class="regBlock">
	<form:form action="registered" method="POST" modelAttribute="user"> 
		<table>
			<tr>
				<td>
					<form:label path="firstName" class="formText">FIRST NAME </form:label><br>
					<form:input path="firstName" class="formInput"></form:input>
					
				</td>
				<td>
					<form:label path="lastName" class="formText">LAST NAME </form:label><br>
					<form:input path="lastName" class="formInput"></form:input>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="userName" class="formText">USERNAME </form:label><br>
					<form:input path="userName" class="formInput"></form:input>
					
				</td>
				<td>
					<form:label path="password" class="formText">PASSWORD </form:label><br>
					<form:input path="password" class="formInput"></form:input>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="email" class="formText">EMAIL </form:label><br>
					<form:input path="email" class="formInput"></form:input>
					
				</td>
				<td>
					<form:label path="phone" class="formText">PHONE NUMBER </form:label><br>
					<form:input path="phone" class="formInput"></form:input>
				</td>
			</tr>	
		</table>
		<input type="submit" value="REGISTER" class="button">
	</form:form>
</div>
<div class="regBlock">
	<div style="display: block; text-align: center">
		<h2 class="formText">OR GO BACK TO</h2><br>
		<a href="login" class="buttonSpecial">LOGIN</a>
	</div>
</div>
