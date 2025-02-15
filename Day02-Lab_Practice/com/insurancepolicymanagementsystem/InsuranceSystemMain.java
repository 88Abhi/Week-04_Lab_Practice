package com.insurancepolicymanagementsystem;

import java.time.LocalDate;

// InsuranceSystemMain class to test the Insurance Policy Management System.
public class InsuranceSystemMain {
	public static void main(String[] args) {
		InsurancePolicyManager manager = new InsurancePolicyManager();

		// Adding sample policies
		manager.addPolicy(new InsurancePolicy("P001", "Abhishek", LocalDate.of(2025, 5, 15), "Health", 1200));
		manager.addPolicy(new InsurancePolicy("P002", "Ankit", LocalDate.of(2024, 3, 10), "Auto", 1500));
		manager.addPolicy(new InsurancePolicy("P003", "Amit", LocalDate.of(2024, 2, 25), "Home", 1800));
		manager.addPolicy(new InsurancePolicy("P004", "Ajeet", LocalDate.of(2024, 4, 5), "Health", 1100));
		manager.addPolicy(new InsurancePolicy("P003", "Amit", LocalDate.of(2024, 4, 5), "Health", 1100));

		// Displaying policies
		manager.displayAllPolicies();
		manager.displayExpiringPolicies();
		manager.displayPoliciesByCoverage("Health");
		manager.displayDuplicatePolicies();

		// Performance comparison
		manager.comparePerformance();
	}
}
