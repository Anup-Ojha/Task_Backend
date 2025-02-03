package com.godigital.task.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.godigital.task.entities.Leaves;


@Repository
public interface LeavesRepo extends CrudRepository<Leaves, Integer>{
	List<Leaves> findByEmployeeEmployeeId(Integer employeeId);
}
