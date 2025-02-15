package com.mapinterfaceproblems.groupobjectsbyproperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Class to group employees by their department.
public class EmployeeGrouping {
	// Method to group employees by department using a HashMap.
	public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
		// Creating a HashMap to store department-wise employee lists
		Map<String, List<Employee>> departmentMap = new HashMap<>();

		// Iterating through each employee in the given list
		for (Employee emp : employees) {
			String dept = emp.getDepartment();

			// Checking if the department is already present in the map
			if (!departmentMap.containsKey(dept)) {
				departmentMap.put(dept, new ArrayList<>());
			}

			// Adding the current employee
			departmentMap.get(dept).add(emp);
		}

		// Returning the map
		return departmentMap;
	}
}
