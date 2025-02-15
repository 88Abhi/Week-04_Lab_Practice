package com.queueinterfaceproblems.generatebinarynumbersusingqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Class to generate the first N binary numbers using a queue.
public class BinaryNumbersQueue {
	// Generates the first N binary numbers.
	public static List<String> generateBinaryNumbers(int n) {
		Queue<String> queue = new LinkedList<>();

		// Create a list to store the results
		List<String> binaryNumbers = new ArrayList<>();

		// Add the first binary number
		queue.add("1");

		// Generate binary numbers up to N
		for (int i = 0; i < n; i++) {
			// Remove the front element from the queue
			String current = queue.remove();
			binaryNumbers.add(current);

			// Generate the next two binary numbers
			queue.add(current + "0");
			queue.add(current + "1");
		}

		// Return the generated binary numbers
		return binaryNumbers;
	}
}