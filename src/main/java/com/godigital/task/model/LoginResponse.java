package com.godigital.task.model;

import com.godigital.task.entities.Employee;

public class LoginResponse {
	 private String token;
	    private Employee employee;

	    public LoginResponse(String token, Employee employee) {
	        this.token = token;
	        this.employee = employee;
	    }

	    // Getters for token and employee
	    public String getToken() {
	        return token;
	    }

	    public Employee getEmployee() {
	        return employee;
	    }
}
