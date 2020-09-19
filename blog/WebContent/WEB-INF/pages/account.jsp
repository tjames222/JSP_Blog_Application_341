

<br><br><br>
<div class="regBlock">
	<br><br>
	<div class="regBlock">
		<a href="create" class="buttonLong">CREATE NEW POST</a>
	</div>
	<br><br>
</div>

<hr class="line">

 <!--  This will need to be updated later after we add sessions to allow for data to update correctly for individual users -->
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
					<form:input type="password" path="password" class="formInput"></form:input>
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
		<input type="submit" value="UPDATE" class="button">
	</form:form>
</div>



