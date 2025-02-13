package com.multileveluniversitycoursemanagementsystem;

import java.util.List;

// Defining a utility class to handle course-related operations
class CourseManagement {
	// Implementing a method to display details of all courses dynamically using wildcards
	public static void displayAllCourses(List<? extends CourseType> courses) {
		for (CourseType course : courses) {
			System.out.println(course.getCourseDetails());
		}
	}
}


