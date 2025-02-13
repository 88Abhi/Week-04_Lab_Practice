package com.aidrivenresumescreeningsystem;

// Defining a class for the Software Engineer role extending JobRole
public class SoftwareEngineer extends JobRole {
	// Constructor to initialize the Software Engineer role
	public SoftwareEngineer() {
		super("Software Engineer");
	}

	// Implementing the method to specify required skills
	@Override
	public String requiredSkills() {
		return "Skills: Java, C++, DSA, System Design, Problem Solving";
	}
}

