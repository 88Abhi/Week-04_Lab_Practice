package com.setinterfaceproblems.convertsettosortedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Class to convert a HashSet into a sorted list in ascending order.
public class SetToSortedList {
	// Converts a set of integers into a sorted list in ascending order.
	public static List<Integer> convertToSortedList(Set<Integer> set) {
		// Create a new list from the set
		List<Integer> sortedList = new ArrayList<>(set);

		// Sort the list in ascending order
		Collections.sort(sortedList);

		// Return the sorted list
		return sortedList;
	}
}
