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
			<h2 class="h2">${title}</h2>
	</div>
</div>
<br/>

<div class="leftBlock">
	<div style="display: block; text-align: left">
		<p>${content}</p>
	</div>
</div>