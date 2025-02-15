package com.insurancepolicymanagement;

import java.time.LocalDate;

// InsuranceSystemMain class to test the Insurance Policy Management System.
public class InsuranceSystemMain {
	public static void main(String[] args) {
		// Creating an instance of InsurancePolicyManager to manage policies
		InsurancePolicyManager manager = new InsurancePolicyManager();

		// Adding sample policies to the system
		manager.addPolicy(new InsurancePolicy("P001", "Abhishek", LocalDate.of(2025, 5, 15), 1200));
		manager.addPolicy(new InsurancePolicy("P002", "Ankit", LocalDate.of(2024, 3, 10), 1500));
		manager.addPolicy(new InsurancePolicy("P003", "Vinay", LocalDate.of(2024, 2, 25), 1800));
		manager.addPolicy(new InsurancePolicy("P004", "Amit", LocalDate.of(2024, 4, 5), 1100));

		// Displaying all policies
		manager.displayAllPolicies();

		// Retrieving a policy by policy number
		manager.retrievePolicyByNumber("P002");

		// Listing policies expiring within the next 30 days
		manager.listExpiringPolicies();

		// Listing policies for a specific policyholder
		manager.listPoliciesByPolicyholder("Abhishek");

		// Removing expired policies
		manager.removeExpiredPolicies();

		// Displaying all policies after removing expired ones
		manager.displayAllPolicies();
	}
}