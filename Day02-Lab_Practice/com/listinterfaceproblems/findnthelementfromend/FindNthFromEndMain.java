package com.listinterfaceproblems.findnthelementfromend;

import java.util.Arrays;
import java.util.LinkedList;

// Class to print the nth element from last
public class FindNthFromEndMain {
	public static void main(String[] args) {
		// Create a LinkedList of characters
		LinkedList<Character> list = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));

		// Test and print the findNthFromEnd method
		char result = FindNthFromEnd.findNthFromEnd(list, 4);
		System.out.println("Original List: " + list);
		System.out.println("4th element from the end: " + result);
	}
}
