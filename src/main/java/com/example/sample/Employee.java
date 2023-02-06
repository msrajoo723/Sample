package com.example.sample;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private String salary;
	private String address;
	private String designation;
	public String department;
	public List<String> hobbies = new ArrayList<>();
	
	
	public Employee() {
		System.out.println("This is No Argument Constructor");
	}
		
	public Employee(String name, String salary, String address, String designation, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.designation = designation;
		this.department = department;
	}

	public void getMessage() {
		System.out.print("This is from FirstClass getMessage() method");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

}
