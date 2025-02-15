package com.queueinterfaceproblems.hospitaltriagesystem;

// Class to represent a patient with a name and severity level.
public class Patient implements Comparable<Patient> {
	public String name;
	public int severity;

	// Constructor to initialize patient details
	public Patient(String name, int severity) {
		this.name = name;
		this.severity = severity;
	}

	// Compare patients based on severity for priority queue ordering
	@Override
	public int compareTo(Patient other) {
		return Integer.compare(this.severity, other.severity);
	}
}