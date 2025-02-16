package exceptionprapogationinmethods;

import com.exceptionpropagationinmethods.ExceptionPropagationExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

// CLass to test the propagation o exception
class ExceptionPropagationInMethodTest {
	// Method to test the exception propagation
	@Test
	public void testOfExceptionPropagation() {

		// Create a variable and store the number
		int number1 = 7;
		int number2 = 0;

		assertThrows(Exception.class, () -> {
			ExceptionPropagationExample.method2(number1, number2);
		});
	}
}