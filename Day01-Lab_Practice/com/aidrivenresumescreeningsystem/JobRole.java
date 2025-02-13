package com.aidrivenresumescreeningsystem;

// Defining an abstract class to represent a Job Role
abstract class JobRole {
	protected String jobTitle;

	// Constructor to initialize the job role with a title
	public JobRole(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	// Abstract method to describe required skills
	public abstract String requiredSkills();
}
