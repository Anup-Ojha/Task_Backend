package com.godigital.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.godigital.task.JWT.JWTService;
import com.godigital.task.entities.AccountDetail;
import com.godigital.task.entities.Employee;
import com.godigital.task.repository.BankRepo;
import com.godigital.task.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	private JWTService jwtService;
	
	@Autowired
	private AuthenticationManager authManager; 
	
	@Autowired
	private BankRepo bankRepo;
	
	
	
	@Autowired
	public BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

	public Employee registerEmployee(Employee emp) {
		emp.setPassword(encoder.encode(emp.getPassword()));
//		AccountDetail ac=new AccountDetail();
//		ac.setEmployee(emp);
//		this.bankRepo.save(ac);
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

	public String verify(Employee emp) {
		Authentication authorization=authManager.authenticate(new UsernamePasswordAuthenticationToken(emp.getUsername(), emp.getPassword()));	
		System.out.println(authorization);
		if(authorization.isAuthenticated()) {
			return jwtService.generateToken(emp.getUsername());
		}
		else {
			return "Fail";
		}
	}
}
