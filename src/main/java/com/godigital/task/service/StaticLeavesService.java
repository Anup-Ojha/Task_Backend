package com.godigital.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godigital.task.entities.StaticLeaves;
import com.godigital.task.repository.StaticLeavesRepo;

@Service
public class StaticLeavesService {
	 @Autowired
	 private StaticLeavesRepo staticLeavesRepo;

	    public List<StaticLeaves> getAllLeaveRecords() {
	        return staticLeavesRepo.findAll();
	    }

	    public Integer getTotalLeaveCount() {
	        return staticLeavesRepo.getTotalLeaveCount();
	    }
}
