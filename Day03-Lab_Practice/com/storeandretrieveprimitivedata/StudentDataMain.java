package com.storeandretrieveprimitivedata;

// Class to execute storing and retrieving student details
public class StudentDataMain {
	public static void main(String[] args) {
		// Define the binary file path
		String filePath = "studentData.txt";

		// Store student details in the binary file
		StudentDataHandler.storeStudentData(filePath, 101, "Abhishek", 8.9);

		// Retrieve student details from the binary file
		StudentDataHandler.retrieveStudentData(filePath);
	}
}
