package regularexpressions.extractprogramminglanguagenamesfromtextest;

import com.regularexpressions.extractprogramminglanguagenamesfromtext.ProgrammingLanguageExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgrammingLanguageExtractorTest {
	// Method to test extracted languages
	@Test
	void testExtractLanguages() {
		// Input text containing programming languages
		String text = "I Abhishek Jat code in Java, Python, and C, but I want to learn Swift and Go.";

		// Expected output list
		List<String> expected = List.of("Java", "Python", "C", "Swift", "Go");

		// Actual result from the method
		List<String> actual = ProgrammingLanguageExtractor.extractLanguages(text);

		// Checking if the extracted list matches the expected list
		assertEquals(expected, actual, "Extracted programming languages should match the expected ones.");
		System.out.println("All tests passed! successfully extracted programming languages from the text.");
	}
}
