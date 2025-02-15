package com.listinterfaceproblems.findfrequencyofelements;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Class to calculate frequency of elements
public class FindFrequencyMain {
	public static void main(String[] args) {
		// Test and print the findFrequency method
		List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

		// Call the method to find frequencies
		Map<String, Integer> frequencyMap = FindFrequency.findFrequency(list);
		System.out.println("Original List: " + list);
		System.out.println("Frequency Map: " + frequencyMap);
	}
}
