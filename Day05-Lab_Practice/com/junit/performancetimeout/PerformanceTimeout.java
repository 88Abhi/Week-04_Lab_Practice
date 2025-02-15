package com.junit.performancetimeout;

// Class to test the performance
public class PerformanceTimeout {
	// Method to run task for 3 second
	public void longRunningTask() {
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			// Properly handling the exception.
			Thread.currentThread().interrupt();
		}
	}
}
