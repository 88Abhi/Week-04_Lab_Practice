package com.multileveluniversitycoursemanagementsystem;

// Defining a subclass for Exam-Based Courses, extending CourseType
class ExamCourse extends CourseType {
	// Declaring a private variable for exam weightage
	private int examWeightage;

	// Constructor to initialize the exam course
	public ExamCourse(String courseName, int examWeightage) {
		super(courseName);
		this.examWeightage = examWeightage;
	}

	// Implementing the method to return details
	@Override
	public String getCourseDetails() {
		return "Exam Course: " + courseName + ", Exam Weightage: " + examWeightage + "%";
	}
}
