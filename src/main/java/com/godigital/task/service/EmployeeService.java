package com.godigital.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.godigital.task.entities.Employee;
import com.godigital.task.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	public BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

	public Employee registerEmployee(Employee emp) {
		emp.setPassword(encoder.encode(emp.getPassword()));
		return empRepo.save(emp);
	}

	private String encode(String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployeeList() {
		return (List<Employee>) empRepo.findAll();
	}

	public Optional<Employee> getEmployeeById(Integer id) {
		
		return empRepo.findById(id);
	}
}
