package com.mapinterfaceproblems.wordfrequencycounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Class to count the frequency of each word in a text file
public class WordFrequencyCounter {
	// Method to count word occurrences from a given text file.
	public static Map<String, Integer> countWordFrequency(String filePath) throws IOException {
		Map<String, Integer> wordCountMap = new HashMap<>();

		// Creating a BufferedReader to read the file
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line;

		// Reading the file line by line
		while ((line = reader.readLine()) != null) {
			String[] words = line.split("\\s+");

			// Iterating through each word in the line
			for (String word : words) {
				wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
			}
		}

		// Closing the reader to free resources
		reader.close();

		return wordCountMap;
	}
}