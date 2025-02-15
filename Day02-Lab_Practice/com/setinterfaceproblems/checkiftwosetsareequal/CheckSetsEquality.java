package com.setinterfaceproblems.checkiftwosetsareequal;

import java.util.Set;

// Class to check if two sets are equal
public class CheckSetsEquality {
	// Compares two sets and determines if they contain the same elements
	public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
		// Return true if both sets are equal
		return set1.equals(set2);
	}
}
