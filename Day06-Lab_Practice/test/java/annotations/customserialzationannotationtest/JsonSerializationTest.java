package annotations.customserialzationannotationtest;

import com.annotations.customserializationannotation.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Class to test the json serialization
class JsonSerializationTest {
	// Method to test the JsonSerialization
	@Test
	void testJsonSerialization() {
		// Creating a test user
		User user = new User("abhishek", "abhishekjat@example.com");

		// Generating JSON output
		String jsonOutput = user.toJson().replaceAll("\\s+", "");

		// Expected JSON in a normalized format
		String expectedJson1 = "{user_name:abhishek,email_id:abhishekjat@example.com}";
		String expectedJson2 = "{email_id:abhishekjat@example.com,user_name:abhishek}";

		// Checking if JSON output matches either expected order
		assertTrue(jsonOutput.equals(expectedJson1) || jsonOutput.equals(expectedJson2),
			   "JSON Output does not match expected format: " + jsonOutput);
	}
}
