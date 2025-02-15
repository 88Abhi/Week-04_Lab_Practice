package listinterfaceproblems;

import com.listinterfaceproblems.reversealist.ReverseArrayList;
import com.listinterfaceproblems.reversealist.ReverseLinkedList;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Defining the test class for reversing a list
public class ReverseList {
	// Test method to verify the correctness of reversing an ArrayList
	@Test
	public void testOfReversedArrayList() {
		// Creating an ArrayList with predefined integer values
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 24, 35, 45, 57));

		// Creating a copy of the original list and manually reversing it
		List<Integer> expectedReversedArrayList = new ArrayList<>(arrayList);
		Collections.reverse(expectedReversedArrayList);

		// Calling the reverse method from ReverseArrayList class to get the reversed list
		List<Integer> actualReversedArrayList = ReverseArrayList.reverse(arrayList);

		// Asserting that the manually reversed list matches the actual reversed list
		assertEquals(expectedReversedArrayList, actualReversedArrayList);
	}

	// Test method to verify the correctness of reversing a LinkedList
	@Test
	public void testOfReversedLinkedList() {
		// Creating a LinkedList with predefined integer values
		List<Integer> linkedList = new LinkedList<>(Arrays.asList(71, 12, 43, 48, 15));

		// Creating a copy of the original list and manually reversing it
		List<Integer> expectedReversedLinkedList = new ArrayList<>(linkedList);
		Collections.reverse(expectedReversedLinkedList);

		// Calling the reverse method from ReverseLinkedList class to get the reversed list
		List<Integer> actualReversedLinkedList = ReverseLinkedList.reverse(linkedList);

		// Asserting that the manually reversed list matches the actual reversed list
		assertEquals(expectedReversedLinkedList, actualReversedLinkedList);
	}
}
