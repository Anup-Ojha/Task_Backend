package com.godigital.task.controllers;


import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.godigital.task.entities.DailyAttendanceLogs;
import com.godigital.task.model.DailyAttendaceDto;
import com.godigital.task.model.DailyAttendance;
import com.godigital.task.service.DailyAttendanceService;



@RestController
@CrossOrigin
public class DailyAttendanceController {
	
    @Autowired
    private DailyAttendanceService attendanceService;

    @PostMapping("/attendance/mark")
    public void markAttendance(@RequestBody DailyAttendanceLogs data) {
        attendanceService.markAttendance(data);
    }
    

	@GetMapping("/attendance/{employeeId}")
    public List<DailyAttendanceLogs> getAllAttendaceById(@PathVariable Integer employeeId){
    	return attendanceService.getAllAttendaceByEmployeeId(employeeId);
    }
	
	@GetMapping("/attendance/calendar/{employeeId}")
    public List<Object> getAllByTimeStampAndDate(@PathVariable Integer employeeId){
    	return attendanceService.getAllCalanderData(employeeId);
    }
    
}

