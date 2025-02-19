package reflection.methodexecutiontimingtest;

import com.reflection.methodexecutiontiming.MethodTimer;
import com.reflection.methodexecutiontiming.TestClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

// Class to test method execution timer
class MethodTimerTest {
	// Method to test the quick method execution
	@Test
	void testQuickMethodExecutionTime() {
		TestClass testInstance = new TestClass();

		// Using System's current time to check the expected output manually
		long startTime = System.nanoTime();
		MethodTimer.executeWithTiming(testInstance, "quickMethod");
		long endTime = System.nanoTime();
		double executionTime = (endTime - startTime) / 1000000.0;

		// The execution time should be less than a reasonable threshold
		assertTrue(executionTime < 10, "Execution time of quickMethod should be less than 10ms.");
	}

	// Method to test the slow execution time
	@Test
	void testSlowMethodExecutionTime() {
		// An instance of TestClass
		TestClass testInstance = new TestClass();

		// Measure execution time for slowMethod
		long startTime = System.nanoTime();
		MethodTimer.executeWithTiming(testInstance, "slowMethod");
		long endTime = System.nanoTime();
		double executionTime = (endTime - startTime) / 1000000.0;

		// The execution time should be greater than a reasonable threshold
		assertTrue(executionTime > 500, "Execution time of slowMethod should be greater than 500ms.");
	}

	// Method to test the invalid method
	@Test
	void testInvalidMethod() {
		// An instance of TestClass
		TestClass testInstance = new TestClass();

		// Attempting to execute a non-existent method
		// Expect an error message or exception handling from MethodTimer
		try {
			MethodTimer.executeWithTiming(testInstance, "nonExistentMethod");
			fail("MethodTimer should throw an error for non-existent methods.");
		}
		catch (Exception e) {
			assertTrue(e.getMessage().contains("Error"), "Expected an error message when calling a non-existent method.");
		}
	}
}
