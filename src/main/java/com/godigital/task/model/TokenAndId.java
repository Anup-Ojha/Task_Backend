package com.godigital.task.model;

public class TokenAndId {
	private Integer id;
	private String token;
	public TokenAndId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TokenAndId(Integer id, String token) {
		super();
		this.id = id;
		this.token = token;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "TokenAndId [id=" + id + ", token=" + token + "]";
	}
}
