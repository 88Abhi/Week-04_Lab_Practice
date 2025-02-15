package com.listinterfaceproblems.reversealist;

import java.util.ArrayList;
import java.util.List;

// Class to reverse the elements of an ArrayList.
public class ReverseArrayList {
	// Reverses the elements of an ArrayList without using built-in reverse methods.
	public static List<Integer> reverse(List<Integer> list) {
		List<Integer> reversedList = new ArrayList<>();

		// Loop through the original list
		for (int i = list.size() - 1; i >= 0; i--) {
			reversedList.add(list.get(i));
		}

		// Return the reversed list
		return reversedList;
	}
}
