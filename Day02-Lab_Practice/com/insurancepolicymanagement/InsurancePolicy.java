package com.insurancepolicymanagement;

import java.time.LocalDate;

// Represents an insurance policy with essential attributes.
class InsurancePolicy implements Comparable<InsurancePolicy> {
	// Declaring a private variable to store the unique policy details
	private String policyNumber;
	private String policyholderName;
	private LocalDate expiryDate;
	private double premiumAmount;

	// Constructor to initialize an InsurancePolicy object.
	public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate, double premiumAmount) {
		// Assigning the provided policy details to the class variable
		this.policyNumber = policyNumber;
		this.policyholderName = policyholderName;
		this.expiryDate = expiryDate;
		this.premiumAmount = premiumAmount;
	}

	// Returns the policy number of the insurance policy.
	public String getPolicyNumber() {
		return policyNumber;
	}

	// Returns the expiry date of the insurance policy.
	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	// Returns the policyholder name of the insurance policy.
	public String getPolicyholderName() {
		return policyholderName;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	// Compare policies based on expiry date for TreeMap sorting.
	@Override
	public int compareTo(InsurancePolicy other) {
		return this.expiryDate.compareTo(other.expiryDate);
	}

	// Converts policy details into a readable string format.
	@Override
	public String toString() {
		return "Policy No: " + policyNumber + ", Holder: " + policyholderName + ", Expiry: " + expiryDate + ", Premium: " + premiumAmount;
	}
}
