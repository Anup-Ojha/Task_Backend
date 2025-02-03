package com.godigital.task.model;

public class EmpById {
	private Integer employeeId;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public EmpById() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpById(Integer employeeId) {
		super();
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "EmpById [employeeId=" + employeeId + "]";
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
}
