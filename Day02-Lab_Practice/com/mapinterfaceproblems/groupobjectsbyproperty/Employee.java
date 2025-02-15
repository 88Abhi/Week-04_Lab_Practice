package com.mapinterfaceproblems.groupobjectsbyproperty;

// Class representing an Employee in an organization.
public class Employee {
	// Variable to store the name of the employee details
	private String name;
	private String department;

	// Constructor to initialize the Employee object with name and department.
	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}

	// Method to get the department of the employee.
	public String getDepartment() {
		return department;
	}

	// Method to return the employee name when printed.
	public String toString() {
		return name;
	}
}
