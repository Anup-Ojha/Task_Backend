package com.godigital.task.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godigital.task.entities.DailyAttendanceLogs;
import com.godigital.task.repository.DailyAttendanceRepo;

@Service
public class DailyAttendanceService {
  @Autowired
  private DailyAttendanceRepo attendanceRepository;
  public String markAttendance(Integer employeeId) {
      LocalDate today = LocalDate.now();

      if (attendanceRepository.existsByEmployeeIdAndDate(employeeId, today)) {
          return "Attendance already marked for today!";
      }

      DailyAttendanceLogs attendance = new DailyAttendanceLogs();
      attendance.setEmployeeId(employeeId);
      attendanceRepository.save(attendance);

      return "Attendance recorded successfully!";
  }


}


