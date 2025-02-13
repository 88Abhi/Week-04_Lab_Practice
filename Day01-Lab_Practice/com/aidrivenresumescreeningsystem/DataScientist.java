package com.aidrivenresumescreeningsystem;

// Defining a class for the Data Scientist role extending JobRole
public class DataScientist extends JobRole {
	// Constructor to initialize the Data Scientist role
	public DataScientist() {
		super("Data Scientist");
	}

	// Implementing the method to specify required skills
	@Override
	public String requiredSkills() {
		return "Skills: Python, Machine Learning, Data Analysis, Deep Learning";
	}
}