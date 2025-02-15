package com.mapinterfaceproblems.invertamap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Class to invert a given map from Key-Value to Value-List<Key>.
public class InvertMap {
	// Method to invert the given map.
	public static HashMap<Integer, List<String>> invert(HashMap<String, Integer> originalMap) {
		HashMap<Integer, List<String>> invertedMap = new HashMap<>();

		// Iterating through each entry in the original map
		for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
			// Extracting key and value from the original map
			String key = entry.getKey();
			Integer value = entry.getValue();

			// Checking if the value is already present in the new map
			if (!invertedMap.containsKey(value)) {
				invertedMap.put(value, new ArrayList<>());
			}

			invertedMap.get(value).add(key);
		}

		// Returning the inverted map
		return invertedMap;
	}
}

