package junit.exceptionhandlingtest;

import com.junit.exceptionhandling.ExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Class to test exceptions
public class ExceptionHandlingTest {
	// Creating an object of the class for testing.
	private final ExceptionHandling exceptionHandling = new ExceptionHandling();

	// Creating a method to test the division function
	@Test
	void testValidDivision() {
		// Checking a valid division case where result should be an integer.
		assertEquals(2, exceptionHandling.divide(8, 4));

		// Confirming a division where result is truncated (integer division).
		assertEquals(2, exceptionHandling.divide(7, 3));
	}

	// Creating a method to test exception
	@Test
	void testDivisionByZero() {
		// Ensuring that an ArithmeticException is thrown when dividing by zero.
		Exception exception = assertThrows(ArithmeticException.class, () -> exceptionHandling.divide(40, 0));

		// Checking if the exception message is as expected.
		assertEquals("Cannot divide by zero.", exception.getMessage());
	}
}
