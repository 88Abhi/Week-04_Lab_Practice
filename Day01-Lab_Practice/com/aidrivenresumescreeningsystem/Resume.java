package com.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

// Defining a generic class to process resumes for different job roles
public class Resume<T extends JobRole> {
	// Declaring a private variable to store the applicant's details
	private String applicantName;
	private T jobRole;
	List<T> jobRoles = new ArrayList<>();

	// Constructor to initialize the resume with applicant name and job role
	public Resume(String applicantName, T jobRole) {
		this.applicantName = applicantName;
		this.jobRole = jobRole;
	}

	// Setter method for jobrole
	public void addJobRole(T jobRole) {
		jobRoles.add(jobRole);
	}

	public List<T> getJobRolesList()
	{
		return jobRoles;
	}
	// Method to return resume details as a string
	public String getResumeDetails() {
		return "Applicant: " + applicantName + ", Applied for: " + jobRole.jobTitle + "\n" + jobRole.requiredSkills();
	}
}
