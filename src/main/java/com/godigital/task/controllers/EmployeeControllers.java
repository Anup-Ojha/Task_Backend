package com.godigital.task.controllers;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.godigital.task.entities.Employee;

import com.godigital.task.service.EmployeeService;

import jakarta.persistence.EntityNotFoundException;

@RestController
@CrossOrigin
public class EmployeeControllers {
	
	@Autowired
	private EmployeeService empService; 
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return (List<Employee>) empService.getAllEmployeeList();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {
		return empService.getEmployeeById(id);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
	    try {
	        empService.deleteEmployeeById(id);
	        return ResponseEntity.noContent().build(); 
	    } catch (EntityNotFoundException e) { 
	        return ResponseEntity.notFound().build(); 
	    } catch (Exception e) { 
	        return ResponseEntity.internalServerError().build(); 
	    }
	}
	
	
	
}
