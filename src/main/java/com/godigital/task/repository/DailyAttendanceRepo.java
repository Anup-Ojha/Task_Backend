package com.godigital.task.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.godigital.task.entities.DailyAttendanceLogs;

@Repository
public interface DailyAttendanceRepo extends JpaRepository<DailyAttendanceLogs, Long> {
    boolean existsByEmployeeIdAndDate(Integer employeeId, LocalDate date);
}
