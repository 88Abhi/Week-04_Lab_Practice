package com.listinterfaceproblems.removeduplicateswhilepreservingorder;

import java.util.Arrays;
import java.util.List;

// Class to Check to removal of duplicates
public class RemoveDuplicatesMain {
	public static void main(String[] args) {
		// Test the removeDuplicates method
		List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);

		// Call the method to remove duplicates in list
		List<Integer> listWithoutDuplicates = RemoveDuplicates.removeDuplicates(list);
		System.out.println("List with duplicates: " + list);
		System.out.println("List without duplicates: " + listWithoutDuplicates);
	}
}

