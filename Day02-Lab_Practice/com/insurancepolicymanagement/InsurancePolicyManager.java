package com.insurancepolicymanagement;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

// Manages insurance policies using HashMap, LinkedHashMap, and TreeMap.
class InsurancePolicyManager {
	// Declaring a HashMap to store policies with policy number as key
	private Map<String, InsurancePolicy> hashMap = new HashMap<>();

	// Declaring a LinkedHashMap to maintain insertion order
	private Map<String, InsurancePolicy> linkedHashMap = new LinkedHashMap<>();

	// Declaring a TreeMap to store policies sorted by expiry date
	private Map<LocalDate, InsurancePolicy> treeMap = new TreeMap<>();

	// Adds a policy to all maps ensuring proper storage and ordering.
	public void addPolicy(InsurancePolicy policy) {
		hashMap.put(policy.getPolicyNumber(), policy);
		linkedHashMap.put(policy.getPolicyNumber(), policy);
		treeMap.put(policy.getExpiryDate(), policy);
	}

	// Returns a list of expiring policies within the next 30 days
	public List<InsurancePolicy> getExpiringPolicies() {
		LocalDate today = LocalDate.now();
		List<InsurancePolicy> expiringPolicies = new ArrayList<>();

		for (Map.Entry<LocalDate, InsurancePolicy> entry : treeMap.entrySet()) {
			if (ChronoUnit.DAYS.between(today, entry.getKey()) <= 30) {
				expiringPolicies.add(entry.getValue());
			}
		}
		return expiringPolicies;
	}

	// Retrieves a policy by its policy number (for testing)
	public InsurancePolicy getPolicyByNumber(String policyNumber) {
		return hashMap.get(policyNumber);
	}

	// Retrieves and displays a policy by its policy number.
	public void retrievePolicyByNumber(String policyNumber) {
		System.out.println("\nRetrieving Policy by Policy Number: " + policyNumber);

		// Checking if the policy exists in the HashMap
		if (hashMap.containsKey(policyNumber)) {
			System.out.println(hashMap.get(policyNumber));
		}
		else {
			System.out.println("Policy not found.");
		}
	}

	// Lists all policies expiring within the next 30 days.
	public void listExpiringPolicies() {
		System.out.println("\nPolicies Expiring in the Next 30 Days:");

		// Getting the current date
		LocalDate today = LocalDate.now();

		// Iterating through the TreeMap to find policies expiring within 30 days
		for (Map.Entry<LocalDate, InsurancePolicy> entry : treeMap.entrySet()) {
			// Checking if the expiry date is within the next 30 days
			if (ChronoUnit.DAYS.between(today, entry.getKey()) <= 30) {
				System.out.println(entry.getValue());
			}
		}
	}

	// Lists all policies belonging to a specific policyholder.
	public void listPoliciesByPolicyholder(String policyholderName) {
		System.out.println("\nPolicies for Policyholder: " + policyholderName);

		// Iterating through the HashMap to find policies matching the policyholder's name
		for (InsurancePolicy policy : hashMap.values()) {
			// Checking if the policyholder name matches the given name
			if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
				System.out.println(policy);
			}
		}
	}

	// Removes all expired policies from all maps.
	public void removeExpiredPolicies() {
		System.out.println("\nRemoving Expired Policies:");

		// Getting the current date
		LocalDate today = LocalDate.now();

		// Creating a list to store expired policy numbers
		List<String> expiredPolicyNumbers = new ArrayList<>();

		// Iterating through the TreeMap to find expired policies
		for (Map.Entry<LocalDate, InsurancePolicy> entry : treeMap.entrySet()) {
			// Checking if the policy has already expired
			if (entry.getKey().isBefore(today)) {
				expiredPolicyNumbers.add(entry.getValue().getPolicyNumber());
			}
		}

		// Removing expired policies from all maps
		for (String policyNumber : expiredPolicyNumbers) {
			hashMap.remove(policyNumber);
			linkedHashMap.remove(policyNumber);
			treeMap.entrySet().removeIf(entry -> entry.getValue().getPolicyNumber().equals(policyNumber));

			// Printing the removed policy number
			System.out.println("Removed Policy No: " + policyNumber);
		}
	}

	// Displays all stored policies in insertion order using LinkedHashMap.
	public void displayAllPolicies() {
		System.out.println("\nAll Policies (Insertion Order):");

		// Iterating through the LinkedHashMap to maintain insertion order
		for (InsurancePolicy policy : linkedHashMap.values()) {
			System.out.println(policy);
		}
	}
}