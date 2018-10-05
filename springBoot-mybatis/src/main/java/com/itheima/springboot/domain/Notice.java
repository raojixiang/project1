package com.itheima.springboot.domain;

public class Notice {
	
	private Long id;
	private String content;
	private String title;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Notice(Long id, String content, String title) {
		super();
		this.id = id;
		this.content = content;
		this.title = title;
	}
	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Notice [id=" + id + ", content=" + content + ", title=" + title + "]";
	}
	
	
	
	
	
}
