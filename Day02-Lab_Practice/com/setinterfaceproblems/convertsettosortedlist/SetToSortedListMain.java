package com.setinterfaceproblems.convertsettosortedlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Class to print sorted list
public class SetToSortedListMain {
	public static void main(String[] args) {
		// Create a HashSet of integers
		Set<Integer> set = new HashSet<>(Arrays.asList(50, 35, 19, 100, 82));

		// Convert the set to a sorted list
		List<Integer> sortedList = SetToSortedList.convertToSortedList(set);

		// Print the sorted list
		System.out.println("Unsorted Hashset: " + set);
		System.out.println("Sorted List: " + sortedList);
	}
}
