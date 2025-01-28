package com.godigital.task.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StaticLeaves {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String leaveType;
	private String leaveDetails;
	private Integer numberOfLeaves;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getLeaveDetails() {
		return leaveDetails;
	}
	public void setLeaveDetails(String leaveDetails) {
		this.leaveDetails = leaveDetails;
	}
	public Integer getNumberOfLeaves() {
		return numberOfLeaves;
	}
	public void setNumberOfLeaves(Integer numberOfLeaves) {
		this.numberOfLeaves = numberOfLeaves;
	}
	@Override
	public String toString() {
		return "StaticLeaves [id=" + id + ", leaveType=" + leaveType + ", leaveDetails=" + leaveDetails
				+ ", numberOfLeaves=" + numberOfLeaves + "]";
	}
	public StaticLeaves(Integer id, String leaveType, String leaveDetails, Integer numberOfLeaves) {
		super();
		this.id = id;
		this.leaveType = leaveType;
		this.leaveDetails = leaveDetails;
		this.numberOfLeaves = numberOfLeaves;
	}
	public StaticLeaves() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
