package com.godigital.task.model;

import java.sql.Date;

public class DailyAttendance {
	
	private Date todaysDate;
	private String timing;
	private Integer employeeId;
	public Date getTodaysDate() {
		return todaysDate;
	}
	public void setTodaysDate(Date todaysDate) {
		this.todaysDate = todaysDate;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public DailyAttendance(Date todaysDate, String timing, Integer employeeId) {
		super();
		this.todaysDate = todaysDate;
		this.timing = timing;
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "DailyAttendance [todaysDate=" + todaysDate + ", timing=" + timing + ", employeeId=" + employeeId + "]";
	}
	public DailyAttendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
