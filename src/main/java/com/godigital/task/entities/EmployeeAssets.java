package com.godigital.task.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeAssets {
	
	@Id
	private Integer employeeId;
	
	@Override
	public String toString() {
		return "EmployeeAssets [employeeId=" + employeeId + ", assetName=" + assetName + ", assetType=" + assetType
				+ "]";
	}

	public EmployeeAssets() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeAssets(Integer employeeId, String assetName, String assetType) {
		super();
		this.employeeId = employeeId;
		this.assetName = assetName;
		this.assetType = assetType;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	private String assetName;
	
	private String assetType;
	
	
}
