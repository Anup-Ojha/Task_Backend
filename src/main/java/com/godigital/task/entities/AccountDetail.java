package com.godigital.task.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AccountDetail {
	
	@Id
	@Column(length=50,unique=true)
	private String accountNumber;
	
	@Column(length=50)
	private String bankName;
	@Column(length=50)
	private String ifciCode;
	@Column(length=50)
	private String branch;
	@Column(length=50)
	private String accountName;
	
	@ManyToOne
	@JsonBackReference
	private Employee employee;
	
	public AccountDetail(String accountNumber, String bankName, String ifciCode, String branch, String accountName,
			Employee employee) {
		super();
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.ifciCode = ifciCode;
		this.branch = branch;
		this.accountName = accountName;
		this.employee = employee;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getIfciCode() {
		return ifciCode;
	}


	public void setIfciCode(String ifciCode) {
		this.ifciCode = ifciCode;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public AccountDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
