package com.godigital.task.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityTestingControllers {
	
	@GetMapping("/access")
	public String mytestingrequest() {
		return "Hello anup you pass";
	}
	
}
