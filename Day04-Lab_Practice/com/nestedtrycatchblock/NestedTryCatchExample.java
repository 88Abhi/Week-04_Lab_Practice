package com.nestedtrycatchblock;

import java.util.Scanner;

// Class to demonstrate nested try catch with example
class NestedTryCatchExample {
	// Method to perform array access and division using nested try-catch
	public static void performArrayDivision(int[] numbers, int index, int divisor) {
		// Outer try block to handle array index access
		try {
			// Inner try for accessing the array element at the given index
			try {
				int selectedNumber = numbers[index];

				// Nested try for performing division operation
				try {
					int result = selectedNumber / divisor;

					// Printing the division result
					System.out.println("Result of division: " + result);
				}
				catch (ArithmeticException e) {
					// Handling division by zero exception
					System.out.println("Cannot divide by zero!");
				}
			}
			catch (ArrayIndexOutOfBoundsException e) {
				// Handling invalid index exception
				System.out.println("Invalid array index!");
			}
		}
		catch (Exception e) {
			// Handling any unexpected exceptions
			System.out.println("An unexpected error occurred!");
		}
	}

	public static void main(String[] args) {
		// Creating a Scanner object for user input
		Scanner sc = new Scanner(System.in);

		// Defining an integer array with default values
		int[] numbers = {10, 20, 30, 40, 50};

		// Taking index input from the user
		System.out.print("Enter index: ");
		int index = sc.nextInt();

		// Taking divisor input from the user
		System.out.print("Enter divisor: ");
		int divisor = sc.nextInt();

		// Calling the method to perform division operation
		performArrayDivision(numbers, index, divisor);

		// Closing the Scanner object
		sc.close();
	}
}
