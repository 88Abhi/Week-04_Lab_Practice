package regularexpressions.censorbadwordsinsentencetest;

import com.regularexpressions.censorbadwordsinsentence.CensorWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CensorWordsTest {
	// Method to test the bad word removal
	@Test
	void testCensorBadWords() {
		// Input text with bad words
		String text = "This is a damn bad example with some stupid words.";
		String[] badWords = {"damn", "stupid"};
		String expected = "This is a **** bad example with some **** words.";

		// Actual result from the method
		String actual = CensorWords.censorBadWords(text, badWords);

		// Checking if the censored text matches the expected output
		assertEquals(expected, actual, "The bad words should be replaced with ****.");

		// Input text with mixed-case bad words
		text = "This is a DAMN bad example with some StuPid words.";

		// Actual result from the method
		actual = CensorWords.censorBadWords(text, badWords);
		assertEquals(expected, actual, "The function should be case insensitive.");
		System.out.println("Censor Words Test passed. All assertions are true.");
	}
}