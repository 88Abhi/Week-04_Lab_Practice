package com.listinterfaceproblems.reversealist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Class to reverse list using different data structures
public class ReverseListMain {
	public static void main(String[] args) {
		// Test and print ReverseArrayList
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		// Call the reverse function to reverse list
		List<Integer> reversedArrayList = ReverseArrayList.reverse(arrayList);
		System.out.println("Original ArrayList: " + arrayList);
		System.out.println("Reversed ArrayList: " + reversedArrayList);

		// Test and print ReverseLinkedList
		List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

		// Call the reverse function to reverse list
		List<Integer> reversedLinkedList = ReverseLinkedList.reverse(linkedList);
		System.out.println("Original LinkedList: " + arrayList);
		System.out.println("Reversed LinkedList: " + reversedLinkedList);

	}
}
