package com.blog.model;

import javax.validation.constraints.NotNull;

public class Post {

	@NotNull
	private String title;
	
	@NotNull
	private String authorID;
	
	@NotNull
	private String content;

	public Post() {
		title = "";
		content = "";
	}

	public Post(@NotNull String title, @NotNull String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorID() {
		return authorID;
	}

	public void setAuthorID(String authorID) {
		this.authorID = authorID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Post [title=" + title + ", authorID=" + authorID + ", content=" + content + "]";
	}
}
