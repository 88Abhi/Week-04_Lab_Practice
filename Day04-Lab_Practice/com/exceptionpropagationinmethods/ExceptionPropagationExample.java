package com.exceptionpropagationinmethods;

// Class to demonstrate exception propagation
class ExceptionPropagationExample {
	// Method1: Throws an ArithmeticException
	public static void method1() {
		// Performing division by zero, which throws ArithmeticException
		int result = 10 / 0;

		// Printing the result
		System.out.println("Result: " + result);
	}

	// Method2: Calls method1(), allowing exception to propagate
	public static void method2() {
		// Calling method1(), which throws an exception
		method1();
	}

	public static void main(String[] args) {
		try {
			// Calling method2(), which calls method1() and propagates the exception
			method2();
		}
		catch (ArithmeticException e) {
			// Handling the propagated exception in main()
			System.out.println("Handled exception in main");
		}
	}
}
