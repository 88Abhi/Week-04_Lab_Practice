package junit.performancetimeouttest;

import com.junit.performancetimeout.PerformanceTimeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

// Class to test the performance of task
public class PerformanceTest {
	// Method to test the task performance
	@Test
	// Setting a max execution time.
	@Timeout(value = 2)
	void testLongRunningTask() {
		// Creating object of PerformanceTimeout
		PerformanceTimeout obj = new PerformanceTimeout();

		// This test should fail because the method takes longer than 2 seconds.
		obj.longRunningTask();
	}
}
