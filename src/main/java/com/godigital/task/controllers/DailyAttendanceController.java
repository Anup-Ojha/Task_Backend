package com.godigital.task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.godigital.task.service.DailyAttendanceService;

@RestController
@RequestMapping("/employee/attendance")
public class DailyAttendanceController {
    @Autowired
    private DailyAttendanceService attendanceService;

    @PostMapping("/mark")
    public ResponseEntity<String> markAttendance(@RequestParam Integer employeeId) {
        String response = attendanceService.markAttendance(employeeId);
        return ResponseEntity.ok(response);
    }
}

