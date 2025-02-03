package com.godigital.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.godigital.task.JWT.JWTService;
import com.godigital.task.entities.AccountDetail;
import com.godigital.task.entities.Employee;
import com.godigital.task.model.EmpById;
import com.godigital.task.model.EmployeeLoginDto;
import com.godigital.task.model.LoginResponse;
import com.godigital.task.model.TokenAndId;
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
	public BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

	public Employee registerEmployee(Employee emp) {
		emp.setPassword(encoder.encode(emp.getPassword()));
//		AccountDetail ac=new AccountDetail();
//		ac.setEmployee(emp);
//		this.bankRepo.save(ac);
		return empRepo.save(emp);
	}

	public List<Employee> getAllEmployeeList() {
		return (List<Employee>) empRepo.findAll();
	}

	public Employee getEmployeeById(Integer id) {
		return empRepo.findByEmployeeId(id);
	}
	
	public void deleteEmployeeById(Integer employeeId) {
	    empRepo.deleteById(employeeId);
	}
	

	public LoginResponse verify(EmployeeLoginDto emp) { 
        Authentication authentication = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(emp.getUsername(), emp.getPassword())
        );

        if (authentication.isAuthenticated()) {
            SecurityContextHolder.getContext().setAuthentication(authentication);
            Employee employee = empRepo.findByUsername(emp.getUsername()); 
            String token = jwtService.generateToken(emp.getUsername());

            return new LoginResponse(token, employee); 
        } else {
            return null;
        }
    }
}

