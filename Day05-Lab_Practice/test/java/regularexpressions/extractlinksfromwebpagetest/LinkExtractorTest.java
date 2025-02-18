package regularexpressions.extractlinksfromwebpagetest;

import com.regularexpressions.extractlinksfromwebpage.LinkExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkExtractorTest {
	// Method to test Extracted links
	@Test
	void testExtractLinks() {
		// Input text containing URLs
		String text = "Check https://www.abhishek.com and http://jat.org for resources.";

		// Expected output list
		List<String> expected = List.of("https://www.abhishek.com", "http://jat.org");

		// Actual result from the method
		List<String> actual = LinkExtractor.extractLinks(text);

		// Checking if the extracted list matches the expected list
		assertEquals(expected, actual, "Extracted URLs not matching the expected ones.");
		System.out.println("Test passed successfully.");
	}
}
