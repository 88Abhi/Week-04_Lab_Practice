package regularexpressions.extractallmailaddressfromtexttest;

import com.regularexpressions.extractallemailaddressesfromtext.EmailExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Class to test EmailExtractor regex
class EmailExtractorTest {
	// Method to test Extracted emails
	@Test
	void testExtractEmails() {
		// Input text containing email addresses
		String text = "Contact me at abhishekjat@example.com and info@abhishek.org. " +
			   "You can also reach out at abhishek123@domain.net.";

		// Expected extracted email list
		List<String> expected = List.of("abhishekjat@example.com", "info@abhishek.org", "abhishek123@domain.net");

		// Actual result from the method
		List<String> actual = EmailExtractor.extractEmails(text);

		// Checking if extracted emails match the expected list
		assertEquals(expected, actual, "Extracted emails should match expected ones.");

		System.out.println("Successfully extracted emails: are " + actual);
	}
}
