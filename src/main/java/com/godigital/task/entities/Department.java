package com.godigital.task.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer departmentId;
	
	private String departmentName;
	
	@ManyToOne
	@JsonBackReference
	private Employee employee;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department(Integer departmentId, String departmentName, Employee employee) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employee="
				+ employee + "]";
	}


}
