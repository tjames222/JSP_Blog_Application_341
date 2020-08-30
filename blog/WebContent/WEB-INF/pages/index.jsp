<div class="formWrapper">
			<div class="regBlock">
				<div style="display: block; text-align: left">
		<h2>ABOUT US</h2>
	</div>
</div>
<a href="about.jsp">
	<img library="images" name="about.jpg" styleClass="cropped"/>
</a>
<br />
<div class="regBlock">
	<div style="display: block">
		<ul class="postList">
 					<ui:repeat value="#{postCreationController.posts}" var="post" size="1">
       			<li>
           			<button value="#{post.postTitle}" outcome="viewPost.xhtml?id=#{post.id}" styleClass="large"></button>
       			</li>
						</ui:repeat>
		</ul>
	</div>
	<div style="display: block">
			<button value="SEE LATEST POSTS" outcome="postFeed.xhtml" styleClass="large"></button>
		</div>
	</div>
</div>