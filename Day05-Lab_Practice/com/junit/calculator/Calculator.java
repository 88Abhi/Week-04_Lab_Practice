package com.junit.calculator;

public class Calculator {
	// Adds two integers and returns their sum.
	public int add(int a, int b) {
		return a + b;
	}

	// Subtracts the second number from the first number.
	public int subtract(int a, int b) {
		return a - b;
	}

	// Multiplies two numbers and returns the product.
	public int multiply(int a, int b) {
		return a * b;
	}

	// Divides the first number by the second number.
	public int divide(int a, int b) {
		// Division by zero is mathematically undefined
		if (b == 0) {
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		return a / b;
	}
}
