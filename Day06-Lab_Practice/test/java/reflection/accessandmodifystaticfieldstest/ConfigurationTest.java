package reflection.accessandmodifystaticfieldstest;

import com.reflection.accessandmodifystaticfields.Configuration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Class to test the access and modification of static field
class ConfigurationTest {
	// Method to test the Api key
	@Test
	void testDisplayApiKey() {
		// Set up the expected value for the API key
		String expectedApiKey = "INITIAL_SECRET_KEY";

		// Capture the output from the System.out print statement
		java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
		System.setOut(new java.io.PrintStream(outputStream));

		// Calling the displayApiKey method
		Configuration.displayApiKey();

		// Then: Verify that the output matches the expected API key
		String actualOutput = outputStream.toString().trim();
		assertEquals("Current API Key: " + expectedApiKey, actualOutput, "The API key should be displayed correctly.");
	}
}
