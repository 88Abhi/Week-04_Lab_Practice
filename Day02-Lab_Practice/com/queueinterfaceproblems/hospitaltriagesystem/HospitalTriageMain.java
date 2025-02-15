package com.queueinterfaceproblems.hospitaltriagesystem;

import java.util.Arrays;
import java.util.List;

// Class to create patient and arrange them in order
public class HospitalTriageMain {
	public static void main(String[] args) {
		// Create a list of patients with severity levels
		List<Patient> patients = Arrays.asList(new Patient("John", 3), new Patient("Alice", 5), new Patient("Bob", 2));

		// Process patients in order of severity
		List<String> treatmentOrder = HospitalTriage.processPatients(patients);

		// Print the order of treated patients
		System.out.println("Treatment Order: " + treatmentOrder);
	}
}
