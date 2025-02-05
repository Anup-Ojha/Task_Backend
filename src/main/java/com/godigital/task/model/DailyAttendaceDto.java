package com.godigital.task.model;

import java.sql.Date;

public class DailyAttendaceDto {
	
	private Date date;
	private String timeStamp;
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
	public DailyAttendaceDto(Date date, String timeStamp) {
		super();
		this.date = date;
		this.timeStamp = timeStamp;
	}
	@Override
	public String toString() {
		return "DailyAttendaceDto [date=" + date + ", timeStamp=" + timeStamp + "]";
	}
	public DailyAttendaceDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
