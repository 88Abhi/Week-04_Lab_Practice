package com.uncheckedexception;

import java.util.*;

// Class to handle the Runtime Exceptions
class DivisionOperation {
	// Method to perform division and handle exceptions
	public static void performDivision() {
		// Creating a Scanner object for user input
		Scanner sc = new Scanner(System.in);

		// Using try-catch to handle exceptions
		try {
			// Asking the user for two numbers
			System.out.print("Enter numerator: ");
			int numerator = sc.nextInt();

			System.out.print("Enter denominator: ");
			int denominator = sc.nextInt();

			// Performing division
			int result = numerator / denominator;

			// Printing the result
			System.out.println("Result: " + result);
		}
		catch (ArithmeticException e) {
			// Handling division by zero
			System.out.println("Cannot divide by zero!");
		}
		catch (InputMismatchException e) {
			// Handling non-numeric input
			System.out.println("Invalid input! Please enter numbers only.");
		}
		finally {
			// Closing the Scanner object
			sc.close();
		}
	}

	public static void main(String[] args) {
		// Calling the method to perform division
		performDivision();
	}
}
