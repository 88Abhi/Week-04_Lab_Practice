package com.setinterfaceproblems.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

// Class to compute the symmetric difference
public class SymmetricDifference {
	// Computes the symmetric difference of two sets.
	public static Set<Integer> computeSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> symmetricDifference = new HashSet<>(set1);

		// Add all elements from set2
		symmetricDifference.addAll(set2);

		// Remove the intersection from the symmetric difference set
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		symmetricDifference.removeAll(intersection);

		// Return the symmetric difference set
		return symmetricDifference;
	}
}
