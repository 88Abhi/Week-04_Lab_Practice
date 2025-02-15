package com.listinterfaceproblems.removeduplicateswhilepreservingorder;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// Class to remove duplicate elements from a list
public class RemoveDuplicates {
	// Removes duplicate elements from the list while maintaining the order
	public static List<Integer> removeDuplicates(List<Integer> list) {
		// Create a LinkedHashSet to remove duplicates
		Set<Integer> set = new LinkedHashSet<>();

		// Add all elements from the list into the set
		set.addAll(list);

		// Convert the set back to a list and return the result
		return new ArrayList<>(set);
	}
}
