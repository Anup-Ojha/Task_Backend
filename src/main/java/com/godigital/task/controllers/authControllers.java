package com.godigital.task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.godigital.task.entities.Employee;
import com.godigital.task.model.EmployeeLoginDto;
import com.godigital.task.model.JwtResponse;
import com.godigital.task.model.LoginResponse;
import com.godigital.task.service.EmployeeService;

@RestController
public class authControllers {
	
	@Autowired
	private EmployeeService empService;
	
	Employee empData;
	

	@PostMapping("/login")
	public ResponseEntity<LoginResponse> login(@RequestBody EmployeeLoginDto emp) {
	    LoginResponse loginResponse = empService.verify(emp); // Get LoginResponse
	    if (loginResponse != null) {
	        return ResponseEntity.ok(loginResponse); // Return LoginResponse
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	    }
	}
	
	@PostMapping("/register")
	public Employee setEmployee(@RequestBody Employee Emp) {
		return empService.registerEmployee(Emp);
	}

}
