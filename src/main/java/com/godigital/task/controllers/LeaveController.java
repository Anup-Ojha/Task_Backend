package com.godigital.task.controllers;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.godigital.task.entities.Employee;
import com.godigital.task.entities.Leaves;
import com.godigital.task.repository.EmployeeRepo;
import com.godigital.task.repository.LeavesRepo;
import com.godigital.task.service.LeaveService;

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

@RestController
@RequestMapping("/leaves")
@CrossOrigin("http://localhost:8080")
public class LeaveController {

    @Autowired
    private LeaveService leavesService;

    @Autowired
    private EmployeeRepo employeeRepository;

    @PostMapping("/add")
    public void addLeave(@RequestBody Leaves leaveRequest) {
        if (leaveRequest.getEmployee() == null || leaveRequest.getEmployee().getEmployeeId() == null) {
            System.out.println("Employee ID is required");
        }

        // Fetch Employee from database
        Employee employee = employeeRepository.findById(leaveRequest.getEmployee().getEmployeeId())
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        leaveRequest.setEmployee(employee);

        leavesService.saveLeave(leaveRequest);
    }
    
    @GetMapping("/{id}")
    public List<Leaves> getAllLeaves(@PathVariable Integer id){
    	return leavesService.getAllLeavesById(id);
    }
    
    @GetMapping("/count/{id}")
    public List<Map<String,Integer>> getAllLeavesTypeCount(@PathVariable Integer id){
    	return leavesService.getAllLeavesTypeCount(id);
    }
    
    
    @GetMapping("/weeks/{id}")
    public List<Map<String,Integer>> getAllWeeksCount(@PathVariable Integer id){
    	return leavesService.getAllWeeksCount(id);
    }
    
    @GetMapping("/filterDateData/{startDate}/{endDate}/{id}")
    public List<Map<String,Integer>> getEholeYearData(@PathVariable Date startDate,@PathVariable Date endDate,@PathVariable Integer id){
    	return leavesService.getWholeYearFilterData(id,startDate,endDate);
    }
    
   
}
