package com.godigital.task.entities;

import java.sql.Date;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Leaves{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String leaveType;
	
	private Date tillDate;
	private Date fromDate;
	
	@Column(length=250)
	private String note;
	private String status;
	
	@ManyToOne
	@JsonBackReference
	private Employee employee;

	@Override
	public String toString() {
		return "Leaves [id=" + id + ", leaveType=" + leaveType + ", tillDate=" + tillDate + ", fromDate=" + fromDate
				+ ", note=" + note + ", status=" + status + ", employee=" + employee + "]";
	}

	public Leaves() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Leaves(int id, String leaveType, Date tillDate, Date fromDate, String note, String status,
			Employee employee) {
		super();
		this.id = id;
		this.leaveType = leaveType;
		this.tillDate = tillDate;
		this.fromDate = fromDate;
		this.note = note;
		this.status = status;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public Date getTillDate() {
		return tillDate;
	}

	public void setTillDate(Date tillDate) {
		this.tillDate = tillDate;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
