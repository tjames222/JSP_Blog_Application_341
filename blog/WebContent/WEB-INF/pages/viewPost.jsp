<div class="rightBlock">
	<button onclick="goBack()" class="back">BACK</button>

	<script>
	function goBack() {
	  window.history.back();
	}
	</script>
</div>

<div class="leftBlock">
	<div style="display: block; text-align: left">
		<h2 class="h2">${post.title}</h2>
	</div>
</div>
<br/>

<div class="leftBlock">
	<div style="display: block; text-align: left">
		<p>${post.content}</p>
	</div>
</div>