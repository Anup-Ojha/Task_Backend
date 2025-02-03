package com.godigital.task.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class DailyAttendanceLogs {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer employeeId;

    @Column(nullable = false, updatable = false)
    private LocalDate date;

    @Column(nullable = false, updatable = false)
    private String timeStamp;
    
    @PrePersist
    protected void onCreate() {
        this.date = LocalDate.now();
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public DailyAttendanceLogs(Integer id, Integer employeeId, LocalDate date, String timeStamp) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.date = date;
		this.timeStamp = timeStamp;
	}

	public DailyAttendanceLogs() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DailyAttendanceLogs [id=" + id + ", employeeId=" + employeeId + ", date=" + date + ", timeStamp="
				+ timeStamp + "]";
	}
    
    

}
