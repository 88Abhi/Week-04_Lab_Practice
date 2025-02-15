package com.setinterfaceproblems.unionandintersectionoftwosets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Class to check the union and intersection of sets
public class UnionIntersectionSetsMain {
	public static void main(String[] args) {
		// Create two sets for union and intersection
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

		// Compute union and intersection
		Map<String, Set<Integer>> result = UnionIntersectionSets.computeUnionIntersection(set1, set2);

		// Print the results
		System.out.println("Set 1 is: " + set1);
		System.out.println("Set 2 is: " + set2);
		System.out.println("Union: " + result.get("Union"));
		System.out.println("Intersection: " + result.get("Intersection"));
	}
}
