package annotations.suppressuncheckedwarningstest;

import com.annotations.suppressuncheckedwarnings.SuppressWarningsExample;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Class to test the Arraylist's compilation warning
class SuppressWarningsExampleTest {
	// Method to test the SuppressWarnings
	@Test
	void testSuppressWarningsExample() {
		// Redirect System.out to capture printed output
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outputStream));

		// Execute the main method of SuppressWarningsExample
		SuppressWarningsExample.main(new String[]{});

		// Restore System.out to its original state
		System.setOut(originalOut);

		// Get the printed output as a string
		String output = outputStream.toString().trim();

		// Assert that the expected output "Hello" is printed
		assertEquals("Hello", output);
	}
}
