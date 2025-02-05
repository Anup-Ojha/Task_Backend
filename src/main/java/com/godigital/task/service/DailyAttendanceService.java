package com.godigital.task.service;


import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godigital.task.entities.DailyAttendanceLogs;
import com.godigital.task.model.DailyAttendaceDto;
import com.godigital.task.model.DailyAttendance;
import com.godigital.task.repository.DailyAttendanceRepo;

@Service
public class DailyAttendanceService {
  @Autowired
  private DailyAttendanceRepo attendanceRepository;
    
  public String markAttendance(DailyAttendanceLogs data) {
      attendanceRepository.save(data);
      return "Attendance recorded successfully!";
  }
  
  public List<DailyAttendanceLogs> getAllAttendaceByEmployeeId(Integer employeeId){
	  return attendanceRepository.findByEmployeeId(employeeId);
  }
  
  public List<Object> getAllCalanderData(Integer employeeId){
	  return attendanceRepository.findAllCalendarLeavesData(employeeId);
  }
  


}


