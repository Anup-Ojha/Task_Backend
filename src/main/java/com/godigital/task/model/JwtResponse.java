package com.godigital.task.model;

public class JwtResponse {
	
	
	private String token;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
		return "JwtResponse [id=" + id + ", token=" + token + "]";
	}
	public JwtResponse(int id, String token) {
		super();
		this.id = id;
		this.token = token;
	}
	public JwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
