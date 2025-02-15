package setinterfaceproblems;

import com.setinterfaceproblems.convertsettosortedlist.SetToSortedList;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetToSortedListTest {
	@Test
	public void testConvertToSortedList() {
		// Given set of integers
		Set<Integer> inputSet = new HashSet<>(Arrays.asList(4, 5, 2, 7, 6, 9));

		// Expected sorted list
		List<Integer> expectedList = Arrays.asList(2, 4, 5, 6, 7, 9);

		// Convert set to sorted list
		List<Integer> actualList = SetToSortedList.convertToSortedList(inputSet);

		// Validate sorted order
		assertEquals(expectedList, actualList, "Sorting failed!");
		System.out.println("Set to sorted list conversion successful!");
	}
}