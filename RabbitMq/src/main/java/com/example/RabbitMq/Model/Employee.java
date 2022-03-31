package com.example.RabbitMq.Model;

//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Employee.class)
public class Employee {

	private int empRollNo;
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

	@Override
	public String toString() {
		return "Employee [empRollNo=" + empRollNo + ", empName=" + empName + ", empRole=" + empRole + "]";
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	
	

}
