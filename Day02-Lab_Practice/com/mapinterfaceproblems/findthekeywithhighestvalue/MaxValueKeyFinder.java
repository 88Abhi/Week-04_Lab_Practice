package com.mapinterfaceproblems.findthekeywithhighestvalue;

import java.util.HashMap;
import java.util.Map;

// Class to find the key with the maximum value in a HashMap.
public class MaxValueKeyFinder {
	// Method to find the key with the highest value.
	public static String findMaxKey(HashMap<String, Integer> dataMap) {
		String maxKey = null;
		int maxValue = Integer.MIN_VALUE;

		// Iterating through each entry in the map
		for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
			if (entry.getValue() > maxValue) {
				// Updating maxKey and maxValue if a larger value is found
				maxValue = entry.getValue();
				maxKey = entry.getKey();
			}
		}

		// Returning the key with the highest value
		return maxKey;
	}
}