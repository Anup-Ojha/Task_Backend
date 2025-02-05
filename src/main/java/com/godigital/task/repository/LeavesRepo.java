package com.godigital.task.repository;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.godigital.task.entities.Leaves;


@Repository
public interface LeavesRepo extends CrudRepository<Leaves, Integer>{
	 List<Leaves> findByEmployeeEmployeeId(Integer employeeId);
	
	 @Query("SELECT l.leaveType AS type, COUNT(l.id) AS COUNT FROM Leaves l WHERE l.employee.id=:eId GROUP BY l.leaveType")
	 List<Map<String,Integer>> countLeavesType(@Param("eId") Integer eId);
	 
	 @Query("SELECT dayname(l.fromDate) as day,count(l.fromDate) as count from Leaves l where l.employee.id=:eId group by dayname(l.fromDate)")
	 List<Map<String,Integer>> weeksCount(@Param("eId") Integer eId);
	 
	 @Query("select monthname(l.fromDate) as month,count(l.fromDate) as count from Leaves l where l.employee.id=:eId and l.fromDate between :startDate and :endDate group by monthname(l.fromDate)")
	 List<Map<String,Integer>> filterWholeYearData(@Param("eId") Integer eId,@Param("startDate") Date startDate,@Param("endDate") Date endDate);
}
