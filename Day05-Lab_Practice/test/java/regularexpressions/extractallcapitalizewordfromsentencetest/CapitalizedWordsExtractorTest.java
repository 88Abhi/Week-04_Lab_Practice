package regularexpressions.extractallcapitalizewordfromsentencetest;

import com.regularexpressions.extractallcapitalizedwordsfromsentence.CapitalizedWordsExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CapitalizedWordsExtractorTest {
	// Method to test the extraction of capitalized words from a given text
	@Test
	void testExtractCapitalizedWords() {
		// Input text containing capitalized words
		String text = "my Name is Abhishek Jat and what's your name";

		// Expected extracted capitalized words
		List<String> expected = List.of("Name", "Abhishek", "Jat");

		// Actual result from the method
		List<String> actual = CapitalizedWordsExtractor.extractCapitalizedWords(text);

		// Checking if extracted words match the expected list
		assertEquals(expected, actual, "Extracted capitalized words should match expected ones.");
	}
}
