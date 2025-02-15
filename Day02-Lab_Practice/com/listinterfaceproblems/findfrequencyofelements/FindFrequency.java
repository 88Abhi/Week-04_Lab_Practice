package com.listinterfaceproblems.findfrequencyofelements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Class to count the frequency of each element in a list of strings.
public class FindFrequency {
	// Counts the frequency of each element in a list
	public static Map<String, Integer> findFrequency(List<String> list) {
		Map<String, Integer> frequencyMap = new HashMap<>();

		// Loop through each element in the list
		for (String element : list) {
			// If the element is already in the map
			if (frequencyMap.containsKey(element)) {
				frequencyMap.put(element, frequencyMap.get(element) + 1);
			}
			else {
				// If the element is not in the map
				frequencyMap.put(element, 1);
			}
		}

		// Return the frequency map
		return frequencyMap;
	}
}
