package com.mapinterfaceproblems.mergetwomaps;

import java.util.HashMap;
import java.util.Map;

// Class to merge two maps by summing values of common keys.
public class MergeMaps {
	// Method to merge two HashMaps.
	public static HashMap<String, Integer> merge(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
		// Creating a new HashMap to store the merged result
		HashMap<String, Integer> mergedMap = new HashMap<>(map1);

		// Iterating through each entry in the second map
		for (Map.Entry<String, Integer> entry : map2.entrySet()) {

			// Extracting key and value
			String key = entry.getKey();
			Integer value = entry.getValue();

			// If key exists in mergedMap, add the value
			mergedMap.put(key, mergedMap.getOrDefault(key, 0) + value);
		}

		// Returning the merged HashMap
		return mergedMap;
	}
}