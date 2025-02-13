package com.saveandretrieveanobject;

import java.io.*;

// Class representing an Employee, implementing Serializable
public class Employee implements Serializable {
	// Instance variables to store employee details
	private int id;
	private String name;
	private String department;
	private double salary;

	// Constructor to initialize Employee object with given values
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	// Method to display Employee details
	public void displayEmployee() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + salary);
		System.out.println("------------------------------");
	}
}
