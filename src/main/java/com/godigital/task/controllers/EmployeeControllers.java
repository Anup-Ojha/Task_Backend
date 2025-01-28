package com.godigital.task.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.xml.transform.ErrorListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.godigital.task.entities.AccountDetail;
import com.godigital.task.entities.AccountDetail;
import com.godigital.task.entities.Employee;
import com.godigital.task.repository.BankRepo;
import com.godigital.task.repository.BankRepo;
import com.godigital.task.repository.EmployeeRepo;
import com.godigital.task.service.EmployeeService;

@RestController
public class EmployeeControllers {
	
	@Autowired
	private EmployeeService empService; 
	
	
	@Autowired
	private BankRepo bankRepo;
	
	@PostMapping("/employee/add")
	public Employee setEmployee(@RequestBody Employee Emp) {
		return empService.registerEmployee(Emp);
	}
	
	@GetMapping("/employee/details")
	public List<Employee> getAllEmployee(){
		return (List<Employee>) empService.getAllEmployeeList();
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Integer id) {
		return empService.getEmployeeById(id);
	}

}
