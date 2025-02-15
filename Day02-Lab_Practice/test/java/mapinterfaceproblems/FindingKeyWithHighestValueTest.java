package mapinterfaceproblems;

import com.mapinterfaceproblems.findthekeywithhighestvalue.MaxValueKeyFinder;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Defining the test class to find the key with the highest value
public class FindingKeyWithHighestValueTest {
	// Test method to verify that the key with the highest value is correctly identified
	@Test
	public void testFindingKeyWithHighestValue() {
		// Creating a HashMap to store key-value pairs
		HashMap<String, Integer> input = new HashMap<>();

		// Adding key-value pairs to the HashMap
		input.put("A", 1);
		input.put("B", 2);
		input.put("C", 3);
		int maximumValue = 3;
		String expectedKey = "C";

		// Calling the method to find the key associated with the highest value
		String actualKey = MaxValueKeyFinder.findMaxKey(input);

		// Asserting that the expected key matches the actual key returned by the method
		assertEquals(expectedKey, actualKey);
	}
}
