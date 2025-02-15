package listinterfaceproblems;

import com.listinterfaceproblems.findfrequencyofelements.FindFrequency;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Defining the test class for finding frequency of elements
public class FindFrequencyMainTest {
	// Test method to verify the correctness of the findFrequency method
	@Test
	public void testOfFindfrequencyofelements() {
		// Creating a HashMap to store the expected frequency count
		Map<String, Integer> expectedMap = new HashMap<>();
		List<String> inputList = List.of("A", "B", "A", "C", "A", "D", "B");

		// Iterating through the input list to populate the expected frequency map
		for (String str : inputList) {
			expectedMap.put(str, expectedMap.getOrDefault(str, 0) + 1);
		}

		// Calling the findFrequency method from FindFrequency class to get the result
		Map<String, Integer> resultMap = FindFrequency.findFrequency(inputList);

		// Asserting that the expected and actual frequency maps are equal
		Assertions.assertEquals(expectedMap, resultMap, "Map should be equal to pass the test");
	}
}
