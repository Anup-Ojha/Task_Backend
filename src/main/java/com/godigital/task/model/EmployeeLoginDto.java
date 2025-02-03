package com.godigital.task.model;

public class EmployeeLoginDto {
	private String username;
	private  String password;
	@Override
	public String toString() {
		return "EmployeeLoginDto [username=" + username + ", password=" + password + "]";
	}
	public EmployeeLoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeLoginDto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
