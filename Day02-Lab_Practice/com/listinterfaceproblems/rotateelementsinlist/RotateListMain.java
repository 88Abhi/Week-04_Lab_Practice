package com.listinterfaceproblems.rotateelementsinlist;

import java.util.Arrays;
import java.util.List;

// Class to rotate elements from given positions
public class RotateListMain {
	public static void main(String[] args) {
		// Test and print the rotate method
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		// Call the method to rotate elements
		List<Integer> rotatedList = RotateList.rotate(list, 2);
		System.out.println("Original List: " + list);
		System.out.println("Rotated List by 2 positions: " + rotatedList);
	}
}
