package com.customexception;

import java.util.InputMismatchException;
import java.util.Scanner;

class AgeValidation {
	// Method to take user input and validate age
	public static void checkUserAge() {
		// Creating a Scanner object for user input
		try (Scanner sc = new Scanner(System.in)) {
			// Asking the user for age input
			System.out.print("Enter age: ");
			int age = sc.nextInt();

			// Calling the method to validate age
			validateAge(age);

			// Printing access granted message if no exception occurs
			System.out.println("Access granted!");
		}
		catch (InvalidAgeException e) {
			// Handling custom exception when age is below 18
			System.out.println("Age must be 18 or above.");
		}
		catch (InputMismatchException e) {
			// Handling non-numeric input
			System.out.println("Invalid input! Please enter a valid age.");
		}
	}

	// Method to validate age and throw custom exception if below 18
	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above.");
		}
	}

	public static void main(String[] args) {
		// Calling the method to validate age
		checkUserAge();
	}
}
