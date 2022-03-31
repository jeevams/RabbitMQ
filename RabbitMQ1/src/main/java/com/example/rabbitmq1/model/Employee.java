package com.example.rabbitmq1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Employee.class)

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  empRollNo;
	private String empName;
	private String empRole;
	public int getEmpRollNo() {
		return empRollNo;
	}
	public void setEmpRollNo(int empRollNo) {
		this.empRollNo = empRollNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	@Override
	public String toString() {
		return "Employee [empRollNo=" + empRollNo + ", empName=" + empName + ", empRole=" + empRole + "]";
	}

	
	
	

}
