package com.mapinterfaceproblems.findthekeywithhighestvalue;

import java.util.HashMap;

// Class to test the MaxValueKeyFinder functionality.
public class MaxValueKeyFinderMain {
	public static void main(String[] args) {
		// Creating a sample HashMap with String keys and Integer values
		HashMap<String, Integer> dataMap = new HashMap<>();
		dataMap.put("A", 10);
		dataMap.put("B", 20);
		dataMap.put("C", 15);

		// Calling the findMaxKey method to get the key with the highest value
		String maxKey = MaxValueKeyFinder.findMaxKey(dataMap);

		// Printing the key with the highest value
		System.out.println("Original Map: " + dataMap);
		System.out.println("Key with highest value: " + maxKey);
	}
}

