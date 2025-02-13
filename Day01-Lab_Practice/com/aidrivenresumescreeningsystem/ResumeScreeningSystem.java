package com.aidrivenresumescreeningsystem;

import java.util.List;

// Defining a utility class to handle resume screening operations
public class ResumeScreeningSystem {
	// Implementing a generic method to process resumes dynamically
	public static <T extends JobRole> Resume<T> processResume(String applicantName, T jobRole) {
		return new Resume<>(applicantName, jobRole);
	}

	// Implementing a wildcard method to screen multiple job roles dynamically
	public static void screenMultipleResumes(List<? extends JobRole> jobRoles) {
		for (JobRole jobRole : jobRoles) {
			System.out.println("Screening Role: " + jobRole.jobTitle);
			System.out.println(jobRole.requiredSkills());
			System.out.println("----------------------------");
		}
	}
}