package com.setinterfaceproblems.symmetricdifference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Class to check the set difference
public class SymmetricDifferenceMain {
	public static void main(String[] args) {
		// Create two sets for symmetric difference computation
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

		// Compute the symmetric difference
		Set<Integer> result = SymmetricDifference.computeSymmetricDifference(set1, set2);

		// Print the result
		System.out.println("Set 1 is: " + set1);
		System.out.println("Set 2 is: " + set2);
		System.out.println("Symmetric Difference: " + result);
	}
}
