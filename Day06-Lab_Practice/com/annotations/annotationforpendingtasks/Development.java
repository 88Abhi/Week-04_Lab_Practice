package com.annotations.annotationforpendingtasks;

// Defining a class that uses the @Todo annotation
public class Development {
	// Applying the @Todo annotation to a pending feature
	@Todo(task = "Implement login authentication", assignedTo = "Abhishek Jat", priority = "HIGH")
	public void loginFeature() {
		System.out.println("Login feature is under development");
	}

	// Applying the @Todo annotation to another pending feature
	@Todo(task = "Optimize database queries", assignedTo = "Abhishek", priority = "MEDIUM")
	public void databaseOptimization() {
		System.out.println("Database optimization is under development");
	}
}

