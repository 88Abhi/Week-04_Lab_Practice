package reflection.invokeprivatemethodtest;

import com.reflection.invokeprivatemethod.Calculator;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

// Class to test private method invoker
class PrivateMethodInvokerTest {
	// Method to test the private method invocation
	@Test
	void testPrivateMethodInvocation() {
		try {
			// Creating a Calculator object
			Calculator calculator = new Calculator();

			// Accessing and invoking the private method "multiply"
			Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
			multiplyMethod.setAccessible(true);
			int result = (int) multiplyMethod.invoke(calculator, 5, 4);

			// Testing the expected result with actual result
			assertEquals(20, result, "Multiplication should return 20");

			System.out.println("All test Case successfully passed");

		}
		catch (Exception e) {
			fail("Reflection failed to invoke the private method");
		}
	}
}
