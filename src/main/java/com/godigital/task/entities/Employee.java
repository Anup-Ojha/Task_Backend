package com.godigital.task.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Employee {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Integer employee_id;
 



//	public Leave getLeaves() {
//		return leaves;
//	}
//
//
//	public void setLeaves(Leave leaves) {
//		this.leaves = leaves;
//	}


	public Employee(Integer employee_id, String firstName, String lastName, String userName, String password,
			Date hireDate, boolean probation, Double salary, Date birthDate, Integer managerId) {
		super();
		this.employee_id = employee_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.hireDate = hireDate;
		this.probation = probation;
		this.salary = salary;
		this.birthDate = birthDate;
		this.managerId = managerId;
	}


	@Column(length = 50)
    private String firstName;
 
    @Column(length = 50)
    private String lastName;
    private String userName;
    private String password;
    public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	private Date hireDate;
    private boolean probation;
    private Double salary;
  
    private Date birthDate;
 
    private Integer managerId;
 
//    
//    @ManyToOne
//    @JoinColumn(name="employee")
//    private AccountDetail accountDetails;
//    
//    @ManyToOne
//    @JoinColumn(name="")
//    private Leave leaves;

	public Integer getEmployeeId() {
		return employee_id;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employee_id = employeeId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getHireDate() {
		return hireDate;
	}


	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}


	public Boolean getProbation() {
		return probation;
	}


	public void setProbation(boolean probation) {
		this.probation = probation;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public Integer getManagerId() {
		return managerId;
	}


	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}




	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userName=" + userName + ", password=" + password + ", hireDate=" + hireDate + ", probation="
				+ probation + ", salary=" + salary + ", birthDate=" + birthDate + ", managerId=" + managerId + "]";
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

 

}
