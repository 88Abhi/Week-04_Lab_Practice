package com.throwvsthrows;

// Class to calculate interest and handle exception if any
class InterestCalculator {
	// Method to calculate simple interest, propagating exceptions
	public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
		// Checking if amount or rate is negative
		if (amount < 0 || rate < 0) {
			throw new IllegalArgumentException("Amount or rate cannot be negative");
		}

		// Calculating simple interest using the formula
		return (amount * rate * years) / 100;
	}

	public static void main(String[] args) {
		try {
			// Calling the method to calculate interest with valid inputs
			double interest = calculateInterest(10000, 5, 2);

			// Printing the calculated interest if no exception occurs
			System.out.println("Calculated Interest: " + interest);

			// Calling the method with invalid input to trigger exception
			double tempInterest = calculateInterest(-5000, 5, 2);
		}
		catch (IllegalArgumentException e) {
			// Handling propagated exception in main method
			System.out.println("Invalid input: Amount and rate must be positive");
		}
	}
}
