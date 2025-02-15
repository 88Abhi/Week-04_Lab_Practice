package com.queueinterfaceproblems.generatebinarynumbersusingqueue;

import java.util.List;

// Class to print the binary numbers
public class BinaryNumbersQueueMain {
	public static void main(String[] args) {
		// Number of binary numbers to generate
		int n = 7;

		// Generate binary numbers
		List<String> binaryNumbers = BinaryNumbersQueue.generateBinaryNumbers(n);

		// Print the generated binary numbers
		System.out.println("Binary Numbers upto 7: " + binaryNumbers);
	}
}
