package com.insurancepolicymanagementsystem;

import java.time.LocalDate;

// Represents an insurance policy with essential attributes.
class InsurancePolicy implements Comparable<InsurancePolicy> {
	// Declaring a private variable to store policy details
	private String policyNumber;
	private String policyholderName;
	private String coverageType;
	private double premiumAmount;

	// Declaring a private variable to store the expiry date of the policy
	private LocalDate expiryDate;

	// Constructor to initialize an InsurancePolicy object.
	public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
		// Assigning the provided policy deatils to the class variable
		this.policyNumber = policyNumber;
		this.policyholderName = policyholderName;
		this.expiryDate = expiryDate;
		this.coverageType = coverageType;
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

	// Returns the coverage type of the insurance policy.
	public String getCoverageType() {
		return coverageType;
	}

	// Compare policies based on expiry date for TreeSet sorting.
	@Override
	public int compareTo(InsurancePolicy other) {
		return this.expiryDate.compareTo(other.expiryDate);
	}

	// Converts policy details into a readable string format.
	@Override
	public String toString() {
		return "Policy No: " + policyNumber + ", Holder: " + policyholderName + ", Expiry: " + expiryDate + ", Type: " + coverageType + ", Premium: $" + premiumAmount;
	}
}
