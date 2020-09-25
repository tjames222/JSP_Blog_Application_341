<br><br>

<div class="rightBlock">
	<button onclick="goBack()" class="back">BACK</button>

	<script>
	function goBack() {
	  window.history.back();
	}
	</script>
</div>
<div class="leftBlock" ">
	<form method="POST" action="submitPost">
		<table>
			<tr>
				<td>
					<label for="postTitle" class="formText">TITLE</label><br>
					<input type="text" id="postTitle" class="formInput">
				</td>	
			</tr>
			<tr>			
				<td>
					<label for="postContent" class="formText">ENTER POST TEXT</label><br>
					<textarea  class="textArea" name = "postContet"></textarea>
			    </td>
		    </tr>
		    <br>
		    <tr>		    
				<td><input type="submit" name="submitpost" value="SAVE POST" class="button"/></td>
			</tr>
		</table>
	</form>
</div>

<br/>