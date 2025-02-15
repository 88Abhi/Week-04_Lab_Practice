package com.junit.parameterized;

// Class to check the number is even or not
public class EvenNumberChecker {
	//  Create a method to Checks whether a number is even.
	public boolean isEven(int number) {
		return (number & 1) == 0;
	}
}
