package listinterfaceproblems;

import com.listinterfaceproblems.rotateelementsinlist.RotateList;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Defining the test class for rotating elements in a list
public class RotateListTest {
	// Test method to verify the correctness of rotating a list
	@Test
	public void testofRotateList() {
		// Creating a list with predefined integer values
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		// Creating an expected list that represents the correct rotated order
		List<Integer> expectedList = new ArrayList<>();

		// Adding the last 2 elements to the expected list
		expectedList.addAll(list.subList(4, list.size()));

		// Adding the first 4 elements to the expected list
		expectedList.addAll(list.subList(0, 4));

		// Calling the rotate method from RotateList class to obtain the rotated list
		List<Integer> rotatedList = RotateList.rotate(list, 4);

		// Asserting that the expected rotated list matches the actual rotated list
		assertEquals(expectedList, rotatedList, "Rotated and expected list mismatched");
	}
}
