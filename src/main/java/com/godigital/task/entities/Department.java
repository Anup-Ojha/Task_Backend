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
	private Integer department_id;
	
	private String department_name;
	
	@ManyToOne
	@JsonBackReference
	private Employee employee;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", department_name=" + department_name + ", employee="
				+ employee + "]";
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public Department(Integer department_id, String department_name, Employee employee) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.employee = employee;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
