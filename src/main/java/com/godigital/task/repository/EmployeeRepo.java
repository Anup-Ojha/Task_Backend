package com.godigital.task.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.godigital.task.entities.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
	
	public Employee findByUsername(String username);
	
	public Employee findByEmployeeId(Integer employeeId);

}
