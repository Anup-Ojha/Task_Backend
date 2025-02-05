package com.godigital.task.repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.godigital.task.entities.DailyAttendanceLogs;
import com.godigital.task.model.DailyAttendaceDto;


@Repository
public interface DailyAttendanceRepo extends JpaRepository<DailyAttendanceLogs, Integer> {
    boolean existsByEmployeeIdAndDate(Integer employeeId, LocalDate date);
    List<DailyAttendanceLogs> findByEmployeeId(Integer employeeId);
    
    @Query("SELECT dl.timeStamp as timeStamp, dl.date as date FROM DailyAttendanceLogs dl WHERE dl.employeeId = :employeeId")
    public List<Object> findAllCalendarLeavesData(@Param("employeeId") Integer employeeId);

    
  
}
