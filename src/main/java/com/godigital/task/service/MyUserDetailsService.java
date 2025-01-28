package com.godigital.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.godigital.task.entities.Employee;
import com.godigital.task.repository.EmployeeRepo;
import com.godigital.task.security.UserPrincipal;

@Configuration
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Employee user= empRepo.findByUserName(userName); 
		
		if(user == null)
			System.out.println( "Username Not Found");
		
		return new UserPrincipal(user);
	}

}
