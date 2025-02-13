package com.saveandretrieveanobject;

import java.util.ArrayList;
import java.util.List;

// Class to execute the employee serialization and deserialization process
public class EmployeeMain {
	public static void main(String[] args) {
		// Define the file path where the employee list will be saved
		String filePath = "employee.txt";

		// Create a list of Employee objects
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Abhishek", "IT", 75000));
		employeeList.add(new Employee(102, "Ajeet", "HR", 65000));
		employeeList.add(new Employee(103, "Amit", "MR", 72000));

		// Call the method to serialize and save employees to the file
		EmployeeSerialization.saveEmployeesToFile(employeeList, filePath);

		// Call the method to deserialize and retrieve employees from the file
		List<Employee> loadedEmployees = EmployeeSerialization.loadEmployeesFromFile(filePath);

		// Check if employees were successfully deserialized
		if (loadedEmployees != null) {
			System.out.println("\nDeserialized Employee List:");

			// Display each employee's details
			for (Employee emp : loadedEmployees) {
				emp.displayEmployee();
			}
		}
		else {
			// Print message if deserialization failed
			System.out.println("No employees found in the file.");
		}
	}
}
