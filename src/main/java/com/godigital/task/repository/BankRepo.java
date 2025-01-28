package com.godigital.task.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.godigital.task.entities.AccountDetail;
@Repository
public interface BankRepo extends CrudRepository<AccountDetail, String>{
	

}
