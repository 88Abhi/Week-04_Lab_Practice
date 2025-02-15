package com.mapinterfaceproblems.groupobjectsbyproperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Class to test EmployeeGrouping functionality.
public class Main {
	public static void main(String[] args) {
		// Creating a list to store Employee objects
		List<Employee> employees = new ArrayList<>();

		// Adding Employee objects to the list
		employees.add(new Employee("Alice", "HR"));
		employees.add(new Employee("Bob", "IT"));
		employees.add(new Employee("Carol", "HR"));

		// Calling the groupByDepartment method to group employees
		Map<String, List<Employee>> groupedEmployees = EmployeeGrouping.groupByDepartment(employees);

		// Printing the grouped employees department-wise
		System.out.println("Initial List: " + employees);
		System.out.println("After Grouping: " + groupedEmployees);
	}
}

