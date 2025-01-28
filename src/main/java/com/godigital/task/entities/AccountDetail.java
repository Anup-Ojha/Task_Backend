package com.godigital.task.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class AccountDetail {
	
	@Id
	@Column(length=50)
	private String accountNumber;
	
	@Column(length=50)
	private String bankName;
	@Column(length=50)
	private String ifciCode;
	@Column(length=50)
	private String branch;
	@Column(length=50)
	private String accountName;
	

	public AccountDetail(String accountNumber, String bankName, String ifciCode, String branch, String accountName) {
		super();
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.ifciCode = ifciCode;
		this.branch = branch;
		this.accountName = accountName;
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
