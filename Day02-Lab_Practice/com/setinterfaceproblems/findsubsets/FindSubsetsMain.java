package com.setinterfaceproblems.findsubsets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Class to check the set is subset of another set
public class FindSubsetsMain {
	public static void main(String[] args) {
		// Create two sets for subset checking
		Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

		// Check if set1 is a subset of set2
		boolean result = FindSubsets.isSubset(set1, set2);

		// Print the result
		System.out.println("Set 1 is: " + set1);
		System.out.println("Set 2 is: " + set2);
		System.out.println("Is set1 a subset of set2 - " + result);
	}
}
