package com.listinterfaceproblems.rotateelementsinlist;

import java.util.ArrayList;
import java.util.List;

// Class to rotate the elements of a list
public class RotateList {
	// Rotates the elements of the list by the given number of positions.
	public static List<Integer> rotate(List<Integer> list, int positions) {
		// Check if the list is empty
		if (list.isEmpty() || positions == 0) {
			return list;
		}

		positions = positions % list.size();

		// Create a new list to store the rotated elements
		List<Integer> rotatedList = new ArrayList<>();

		// Add the elements after the rotation point
		rotatedList.addAll(list.subList(positions, list.size()));

		// Add the elements before the rotation point
		rotatedList.addAll(list.subList(0, positions));

		// Return the rotated list
		return rotatedList;
	}
}
