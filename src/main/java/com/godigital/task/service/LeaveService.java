package com.godigital.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godigital.task.controllers.EmployeeControllers;
import com.godigital.task.entities.Employee;
import com.godigital.task.entities.Leaves;
import com.godigital.task.repository.EmployeeRepo;
import com.godigital.task.repository.LeavesRepo;

@Service
public class LeaveService {

    @Autowired
    private LeavesRepo leaveRepository;

    public Leaves saveLeave(Leaves leave) {
        return leaveRepository.save(leave);
    }
    
    public List<Leaves> getAllLeavesById(Integer Id){
    	return leaveRepository.findByEmployeeEmployeeId(Id);
    }
}

