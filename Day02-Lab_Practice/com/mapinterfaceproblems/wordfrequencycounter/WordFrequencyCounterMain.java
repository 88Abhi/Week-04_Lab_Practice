package com.mapinterfaceproblems.wordfrequencycounter;

import java.io.IOException;
import java.util.Map;

// Class to test the WordFrequencyCounter.
public class WordFrequencyCounterMain {
	public static void main(String[] args) {
		// Defining the path of the text file
		String filePath = "sample.txt";

		try {
			// Calling the countWordFrequency method and storing the result in a HashMap
			Map<String, Integer> wordFrequency = WordFrequencyCounter.countWordFrequency(filePath);

			// Printing the word frequency map
			System.out.println("Count of each word in file: " + wordFrequency);

		}
		catch (IOException e) {
			// Handling exceptions if file reading fails
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}

