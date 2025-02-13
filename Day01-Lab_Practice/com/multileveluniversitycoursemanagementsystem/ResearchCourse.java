package com.multileveluniversitycoursemanagementsystem;

// Defining a subclass for Research-Based Courses, extending CourseType
class ResearchCourse extends CourseType {
	// Declaring a private variable for research topic
	private String researchTopic;

	// Constructor to initialize the research-based course
	public ResearchCourse(String courseName, String researchTopic) {
		super(courseName);
		this.researchTopic = researchTopic;
	}

	// Implementing the method to return details
	@Override
	public String getCourseDetails() {
		return "Research Course: " + courseName + ", Research Topic: " + researchTopic;
	}
}
