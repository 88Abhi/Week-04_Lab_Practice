package listinterfaceproblems;

import com.listinterfaceproblems.removeduplicateswhilepreservingorder.RemoveDuplicates;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Defining the test class for removing duplicates while preserving order
public class RemoveDuplicatesTest {
	// Test method to verify the correctness of the removeDuplicates method
	@Test
	public void testRemoveDuplicates() {
		// Defining the input list containing duplicate elements
		List<Integer> userInput = List.of(4, 7, 8, 7, 5, 9, 7, 4, 5, 7);
		List<Integer> expectedResult = List.of(4, 7, 8, 5, 9);

		// Calling the removeDuplicates method from RemoveDuplicates class to get the result
		List<Integer> actualResult = RemoveDuplicates.removeDuplicates(userInput);

		// Asserting that the actual result matches the expected result
		assertTrue(actualResult.equals(expectedResult));
	}
}
