package com.godigital.task.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EmployeeAssets {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer assetsIndex;
	

	private String assetName;
	
	private String assetType;
	
	@ManyToOne
	@JsonBackReference
	private Employee employee;

	public Integer getAssetsIndex() {
		return assetsIndex;
	}

	public void setAssetsIndex(Integer assetsIndex) {
		this.assetsIndex = assetsIndex;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeAssets [assetsIndex=" + assetsIndex + ", assetName=" + assetName + ", assetType=" + assetType
				+ ", employee=" + employee + "]";
	}

	public EmployeeAssets(Integer assetsIndex, String assetName, String assetType, Employee employee) {
		super();
		this.assetsIndex = assetsIndex;
		this.assetName = assetName;
		this.assetType = assetType;
		this.employee = employee;
	}

	public EmployeeAssets() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
