package com.godigital.task.entities;



import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class DailyAttendanceLogs {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer employeeId;

    @Column(nullable = false, updatable = false)
    private Date date;

    @Column(nullable = false, updatable = false)
    private String timeStamp;
    
    @Column(nullable=false,updatable=false)
    private Integer value;

	public DailyAttendanceLogs(Integer id, Integer employeeId, Date date, String timeStamp, Integer value) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.date = date;
		this.timeStamp = timeStamp;
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}



	

	@Override
	public String toString() {
		return "DailyAttendanceLogs [id=" + id + ", employeeId=" + employeeId + ", date=" + date + ", timeStamp="
				+ timeStamp + ", value=" + value + "]";
	}

	public DailyAttendanceLogs() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    

}
