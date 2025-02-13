package com.multileveluniversitycoursemanagementsystem;

// Defining a subclass for Assignment-Based Courses, extending CourseType
class AssignmentCourse extends CourseType {
	// Declaring a private variable for number of assignments
	private int assignmentCount;

	// Constructor to initialize the assignment-based course
	public AssignmentCourse(String courseName, int assignmentCount) {
		super(courseName);
		this.assignmentCount = assignmentCount;
	}

	// Implementing the method to return details
	@Override
	public String getCourseDetails() {
		return "Assignment Course: " + courseName + ", Number of Assignments: " + assignmentCount;
	}
}