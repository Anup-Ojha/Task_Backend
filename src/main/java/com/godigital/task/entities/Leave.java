//package com.godigital.task.entities;
//
//import java.sql.Date;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Leave {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private Integer leaveId;
//	@Column(length=50)
//	private String leaveType;
//	private Date toDate;
//	private Date fromDate;
//
//	@Column(length=100)
//	private String leaveNote;
//	
//	@Column(length=20)
//	private String leaveStatus;
//
//	public Leave() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Leave(Integer leaveId, String leaveType, Date toDate, Date fromDate, String leaveNote, String leaveStatus) {
//		super();
//		this.leaveId = leaveId;
//		this.leaveType = leaveType;
//		this.toDate = toDate;
//		this.fromDate = fromDate;
//		this.leaveNote = leaveNote;
//		this.leaveStatus = leaveStatus;
//	}
//
//	public Integer getLeaveId() {
//		return leaveId;
//	}
//
//	public void setLeaveId(Integer leaveId) {
//		this.leaveId = leaveId;
//	}
//
//	public String getLeaveType() {
//		return leaveType;
//	}
//
//	public void setLeaveType(String leaveType) {
//		this.leaveType = leaveType;
//	}
//
//	public Date getToDate() {
//		return toDate;
//	}
//
//	public void setToDate(Date toDate) {
//		this.toDate = toDate;
//	}
//
//	public Date getFromDate() {
//		return fromDate;
//	}
//
//	public void setFromDate(Date fromDate) {
//		this.fromDate = fromDate;
//	}
//
//	public String getLeaveNote() {
//		return leaveNote;
//	}
//
//	public void setLeaveNote(String leaveNote) {
//		this.leaveNote = leaveNote;
//	}
//
//	public String getLeaveStatus() {
//		return leaveStatus;
//	}
//
//	public void setLeaveStatus(String leaveStatus) {
//		this.leaveStatus = leaveStatus;
//	}
//
//}
