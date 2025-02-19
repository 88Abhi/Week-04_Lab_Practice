package reflection.dynamicmethodinvocationtest;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

// Class to test the dynamic method invoker
class DynamicMethodInvokerTest {
	// Method to test the dynamic add method call
	@Test
	void testAddMethodInvocation() throws Exception {
		// Getting the Class object for MathOperations
		Class<?> mathClass = Class.forName("com.reflection.dynamicmethodinvocation.MathOperations");

		// Creating an instance dynamically
		Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

		// Retrieving and invoking the "add" method dynamically
		Method addMethod = mathClass.getMethod("add", int.class, int.class);
		Object result = addMethod.invoke(mathInstance, 5, 3);

		// Verifying the result
		assertEquals(8, result);
	}

	// Method to call subtraction method dynamically
	@Test
	void testSubtractMethodInvocation() throws Exception {
		Class<?> mathClass = Class.forName("com.reflection.dynamicmethodinvocation.MathOperations");
		Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

		Method subtractMethod = mathClass.getMethod("subtract", int.class, int.class);
		Object result = subtractMethod.invoke(mathInstance, 10, 4);

		assertEquals(6, result);
	}

	// Method to dynamically call multiply method
	@Test
	void testMultiplyMethodInvocation() throws Exception {
		Class<?> mathClass = Class.forName("com.reflection.dynamicmethodinvocation.MathOperations");
		Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

		Method multiplyMethod = mathClass.getMethod("multiply", int.class, int.class);
		Object result = multiplyMethod.invoke(mathInstance, 3, 7);

		assertEquals(21, result);
	}

	// Method to test the invalid method call
	@Test
	void testInvalidMethodInvocation() {
		Exception exception = assertThrows(Exception.class, () -> {
			Class<?> mathClass = Class.forName("com.reflection.dynamicmethodinvocation.MathOperations");
			Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

			// Trying to invoke a non-existing method
			Method invalidMethod = mathClass.getMethod("divide", int.class, int.class);
			invalidMethod.invoke(mathInstance, 10, 2);
		});
		assertTrue(exception.getMessage().contains("divide"));
	}
}
