<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<br><br>
<div class="regBlock">
	<form action="search" method="POST">
		<table>
			<tr>
				<td>
					<label for="title" class="formText">SEARCH </label><br>
					<input name="title" class="formInput"></input>
					<input type="submit" value="SEARCH" class="button">	
				</td>
			</tr>
		</table>
	</form>		
</div>

<hr class="line">

<div class="regBlock">
	<br><br>
	<div class="regBlock">
		<a href="create" class="buttonLong">CREATE NEW POST</a>
	</div>
	<br><br>
</div>

<hr class="line">	

<div class="regBlock">
	<div style="display: block; text-align: left">
		<p class="formText">ARTICLES</p>
	</div>
</div>

<div class="regBlock">
	<ul class="none">	
	<c:forEach items="${postlist}" var="post">				
			<li><a href="view" id="${post.title}" class="special">${post.title}</a></li><br>
			<li><p>${post.content}</p></li><br>
	</c:forEach>
	</ul>	
</div>
<br>

<div style="background-color: black; color: white; text-align: center">
	<br><h2 class="h2" >Don't have an account with us?</h2>
	<div class="regBlock">		
		<a href="register" class="buttonLong">REGISTER NOW</a>
	</div>
</div>


