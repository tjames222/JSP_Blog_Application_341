<br><br>

<div class="rightBlock">
	<button onclick="goBack()" class="back">BACK</button>

	<script>
	function goBack() {
	  window.history.back();
	}
	</script>
</div>
<div class="leftBlock">
	<form method="POST" action="submitPost">
		<table>
			<tr>
				<td>
					<label for="title" class="formText">TITLE</label><br>
					<input type="text" name="title" class="formInput">
				</td>	
			</tr>
			<tr>			
				<td>
					<label for="content" class="formText">ENTER POST TEXT</label><br>
					<textarea  class="textArea" name = "content"></textarea>
			    </td>
		    </tr>
		    <br>
		    <tr>		    
				<td><input type="submit" name="savepost" value="SAVE POST" class="button"/></td>
			</tr>
		</table>
	</form>
</div>

<br/>