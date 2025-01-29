package com.godigital.task.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.godigital.task.entities.Leaves;
import com.godigital.task.service.LeaveService;

@RestController
public class LeaveController {
	
//	@Autowired
//	private LeaveService leaveService;
//
//	@GetMapping("/employee/leaves/{employee_id}")
//	public List<Leaves> findByEmployeeId(@PathVariable Integer id){
//		return 
//	}
}
