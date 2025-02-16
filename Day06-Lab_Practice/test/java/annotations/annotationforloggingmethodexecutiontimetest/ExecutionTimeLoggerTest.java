package annotations.annotationforloggingmethodexecutiontimetest;

import com.annotations.annotationforloggingmethodexecutiontime.LogExecutionTime;
import com.annotations.annotationforloggingmethodexecutiontime.PerformanceTest;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Class to test custom annotation
class ExecutionTimeLoggerTest {
	// Method to test the execution time of methods
	@Test
	void testLogExecutionTimeAnnotation() throws Exception {
		// Get the method from the PerformanceTest class
		Method method = PerformanceTest.class.getMethod("complexCalculation");

		// Check if the method has the @LogExecutionTime annotation
		assertTrue(method.isAnnotationPresent(LogExecutionTime.class),
			   "Method 'complexCalculation' should be annotated with @LogExecutionTime");
	}

	@Test
	void testExecutionTimeMeasurement() throws Exception {
		// Get the method object
		Method method = PerformanceTest.class.getMethod("complexCalculation");

		// Check if the annotation is present before executing the method
		if (method.isAnnotationPresent(LogExecutionTime.class)) {
			PerformanceTest performanceTest = new PerformanceTest();

			// Measure execution time
			long startTime = System.nanoTime();
			method.invoke(performanceTest);
			long endTime = System.nanoTime();

			// Calculate execution time in milliseconds
			long executionTime = (endTime - startTime) / 1000000;

			// Assert that execution time is reasonable (e.g., should be greater than 0ms)
			assertTrue(executionTime > 0, "Execution time should be greater than zero");
			System.out.println("Measured Execution Time: " + executionTime + " ms");
		}
	}
}
