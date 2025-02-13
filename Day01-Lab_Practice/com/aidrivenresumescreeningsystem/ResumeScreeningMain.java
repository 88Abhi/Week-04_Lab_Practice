package com.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

// ResumeScreeningMain class to execute AI-Driven Resume Screening System
public class ResumeScreeningMain {
	public static void main(String[] args) {
		// Creating instances of different job roles
		SoftwareEngineer softwareEngineer = new SoftwareEngineer();
		DataScientist dataScientist = new DataScientist();
		ProductManager productManager = new ProductManager();

		// Processing resumes using the utility method
		Resume<SoftwareEngineer> resume1 = ResumeScreeningSystem.processResume("Abhishek", softwareEngineer);
		Resume<DataScientist> resume2 = ResumeScreeningSystem.processResume("Amit", dataScientist);
		Resume<ProductManager> resume3 = ResumeScreeningSystem.processResume("Ajeet", productManager);

		// Displaying resume details individually
		System.out.println("Resume Details:");
		System.out.println(resume1.getResumeDetails());
		System.out.println(resume2.getResumeDetails());
		System.out.println(resume3.getResumeDetails());

		// Storing all job roles in a list using wildcards
		List<JobRole> jobRoles = new ArrayList<>();
		jobRoles.add(softwareEngineer);
		jobRoles.add(dataScientist);
		jobRoles.add(productManager);

		// Displaying screening results for multiple job roles
		System.out.println("\nScreening Multiple Resumes:");
		ResumeScreeningSystem.screenMultipleResumes(jobRoles);
	}
}
