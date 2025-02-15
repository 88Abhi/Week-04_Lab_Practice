package com.setinterfaceproblems.checkiftwosetsareequal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckSetsEqualityMain {
	public static void main(String[] args) {
		// Create two sets for comparison
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

		// Check if the two sets are equal
		boolean result = CheckSetsEquality.areSetsEqual(set1, set2);
		System.out.println("Set 1 is: " + set1);
		System.out.println("Set 2 is: " + set2);
		System.out.println("Are sets equal? " + result);
	}
}
