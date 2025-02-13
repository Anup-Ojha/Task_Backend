package com.godigital.task.service;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.godigital.task.controllers.EmployeeControllers;
import com.godigital.task.entities.Employee;
import com.godigital.task.entities.Leaves;
import com.godigital.task.exception.ResourceNotFound;
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
    
    public List<Map<String,Integer>> getAllLeavesTypeCount(Integer empId){
    	return leaveRepository.countLeavesType(empId);
    }
    
    public List<Map<String,Integer>> getAllWeeksCount(Integer empId){
    	return leaveRepository.weeksCount(empId);
    }
    
    public List<Map<String,Integer>> getWholeYearFilterData(Integer empId,Date startDate,Date endDate){
    	return leaveRepository.filterWholeYearData(empId,startDate,endDate);
    }
    
    public void deleteEmployeeLeave(Integer id) {
    	leaveRepository.deleteById(id); 
    }

	public ResponseEntity<Leaves> updateLeavesDetails(Integer id,Leaves updateRequest) {
		Leaves l=leaveRepository.findById(id).orElseThrow(()->new RuntimeException("leave not found"));
		updateRequest.setId(id);
		 leaveRepository.save(updateRequest);
		 return ResponseEntity.ok(updateRequest);
	}
}

