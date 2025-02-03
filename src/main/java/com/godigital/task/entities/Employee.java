package com.godigital.task.entities;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "employeeId")

@Entity
public class Employee {
   
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

	@Column(length = 50)
    private String firstName;
 
    @Column(length = 50)
    private String lastName;
    
    @Column(name="dateOfBirth")
    private Date dateOfBirth;
    
    @Column(name="hireDate")
    private Date hireDate;
    
    @Column(name="managerId")
    private String managerId;
    
    @Column(name="salary")
    private Double salary;
    
    @Column(unique=true)
    private String username;
    private String password;
    
    @OneToMany(mappedBy="employee",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<AccountDetail> accountDetails;
    
    @OneToMany(mappedBy="employee",cascade= CascadeType.ALL)
    @JsonManagedReference
    private List<Department> departmentDetails;
    
    @OneToMany(mappedBy="employee",cascade= CascadeType.ALL)
    @JsonManagedReference
    private List<Leaves> leavesDetails;

    @OneToMany(mappedBy="employee",cascade= CascadeType.ALL)
    @JsonManagedReference
    private List<EmployeeAssets> assetsDetails;
    
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Date getHireDate() {
		return hireDate;
	}


	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}


	public String getManagerId() {
		return managerId;
	}


	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<AccountDetail> getAccountDetails() {
		return accountDetails;
	}


	public void setAccountDetails(List<AccountDetail> accountDetails) {
		this.accountDetails = accountDetails;
	}


	public List<Department> getDepartmentDetails() {
		return departmentDetails;
	}


	public void setDepartmentDetails(List<Department> departmentDetails) {
		this.departmentDetails = departmentDetails;
	}


	public List<Leaves> getLeavesDetails() {
		return leavesDetails;
	}


	public void setLeavesDetails(List<Leaves> leavesDetails) {
		this.leavesDetails = leavesDetails;
	}


	public List<EmployeeAssets> getAssetsDetails() {
		return assetsDetails;
	}


	public void setAssetsDetails(List<EmployeeAssets> assetsDetails) {
		this.assetsDetails = assetsDetails;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", hireDate=" + hireDate + ", managerId=" + managerId + ", salary="
				+ salary + ", username=" + username + ", password=" + password + ", accountDetails=" + accountDetails
				+ ", departmentDetails=" + departmentDetails + ", leavesDetails=" + leavesDetails + ", assetsDetails="
				+ assetsDetails + "]";
	}


	public Employee(Integer employeeId, String firstName, String lastName, Date dateOfBirth, Date hireDate,
			String managerId, Double salary, String username, String password, List<AccountDetail> accountDetails,
			List<Department> departmentDetails, List<Leaves> leavesDetails, List<EmployeeAssets> assetsDetails) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.hireDate = hireDate;
		this.managerId = managerId;
		this.salary = salary;
		this.username = username;
		this.password = password;
		this.accountDetails = accountDetails;
		this.departmentDetails = departmentDetails;
		this.leavesDetails = leavesDetails;
		this.assetsDetails = assetsDetails;
	}


}
