package com.app.model;

import java.util.ArrayList;
import java.util.List;

public class Employees {
	
	private Integer empNo;
	private String firstName;
	private String lastName;
	
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
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
	
	public Employees(Integer empNo, String firstName, String lastName) {
		super();
		this.empNo = empNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public static List<Employees> getEmployeesList(){
		List<Employees> employeeList = new ArrayList<Employees>();
		for(int i=0; i<10; i++) {
			employeeList.add(new Employees(i, "first_name"+i, "last_name"+i));
		}
		return employeeList;
	}
}
