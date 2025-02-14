package com.finallyblockexecution;

import java.util.Scanner;

// Class to perform integer division
class DivisionOperation {
	// Method to perform division and handle exceptions
	public static void performDivision(int numerator, int denominator) {
		try {
			// Performing division and storing the result
			int result = numerator / denominator;

			// Printing the result of the division
			System.out.println("Result: " + result);
		}
		catch (ArithmeticException e) {
			// Handling exception when denominator is zero
			System.out.println("Error: Cannot divide by zero!");
		}
		finally {
			// Ensuring this block executes in all cases
			System.out.println("Operation completed");
		}
	}

	public static void main(String[] args) {
		// Creating a Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		// Prompting the user to enter the numerator
		System.out.print("Enter numerator: ");
		int numerator = sc.nextInt();

		// Prompting the user to enter the denominator
		System.out.print("Enter denominator: ");
		int denominator = sc.nextInt();

		// Calling the method to perform division
		DivisionOperation.performDivision(numerator, denominator);

		// Closing the Scanner object
		sc.close();
	}
}
