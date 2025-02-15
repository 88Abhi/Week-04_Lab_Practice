package com.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

// Manages insurance policies using HashSet, LinkedHashSet, and TreeSet.
class InsurancePolicyManager {
	private Set<InsurancePolicy> hashSet = new HashSet<>();
	private Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
	private Set<InsurancePolicy> treeSet = new TreeSet<>();

	// Adds a policy to all sets ensuring uniqueness.
	public void addPolicy(InsurancePolicy policy) {
		hashSet.add(policy);
		linkedHashSet.add(policy);
		treeSet.add(policy);
	}

	// Displays all unique policies from HashSet.
	public void displayAllPolicies() {
		System.out.println("\nAll Unique Policies:");
		for (InsurancePolicy policy : hashSet) {
			System.out.println(policy);
		}
	}

	// Retrieves and displays policies expiring within the next 30 days.
	public void displayExpiringPolicies() {
		System.out.println("\nPolicies Expiring in the Next 30 Days:");
		LocalDate today = LocalDate.now();
		for (InsurancePolicy policy : treeSet) {
			if (ChronoUnit.DAYS.between(today, policy.getExpiryDate()) <= 30) {
				System.out.println(policy);
			}
		}
	}

	// Retrieves and displays policies based on a specific coverage type.
	public void displayPoliciesByCoverage(String coverageType) {
		System.out.println("\nPolicies with Coverage Type: " + coverageType);
		for (InsurancePolicy policy : hashSet) {
			if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
				System.out.println(policy);
			}
		}
	}

	//  Returns all policies in a list (for test verification)
	public List<InsurancePolicy> getAllPolicies() {
		return new ArrayList<>(hashSet);
	}

	// Finds and displays duplicate policies based on policy number.
	public void displayDuplicatePolicies() {
		System.out.println("\nDuplicate Policies:");
		Map<String, Integer> policyCount = new HashMap<>();
		for (InsurancePolicy policy : hashSet) {
			policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
		}
		for (Map.Entry<String, Integer> entry : policyCount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Policy Number: " + entry.getKey());
			}
		}
	}

	// Compares the performance of different set types.
	public void comparePerformance() {
		System.out.println("\nPerformance Comparison:");

		// Measuring add operation time for hashset
		long startTime = System.nanoTime();
		hashSet.add(new InsurancePolicy("P100", "TestUser", LocalDate.now(), "TestType", 1000));
		long hashSetTime = System.nanoTime() - startTime;

		// Measuring add operation time for linkedhashset
		startTime = System.nanoTime();
		linkedHashSet.add(new InsurancePolicy("P101", "TestUser", LocalDate.now(), "TestType", 1000));
		long linkedHashSetTime = System.nanoTime() - startTime;

		// Measuring add operation time for treeset
		startTime = System.nanoTime();
		treeSet.add(new InsurancePolicy("P102", "TestUser", LocalDate.now(), "TestType", 1000));
		long treeSetTime = System.nanoTime() - startTime;

		System.out.println("HashSet Add Time: " + hashSetTime + " ns");
		System.out.println("LinkedHashSet Add Time: " + linkedHashSetTime + " ns");
		System.out.println("TreeSet Add Time: " + treeSetTime + " ns");
	}
}