package listinterfaceproblems;

import java.util.Arrays;
import java.util.LinkedList;
import com.listinterfaceproblems.findnthelementfromend.FindNthFromEnd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNthFromEndMainTest {
	@Test
	public void testFindnthElementfromEnd() {
		// Create a LinkedList of characters
		LinkedList<Character> list = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));

		// Create expected variable and store the expected output
		Character expected = 'C';

		// Create actual variable and store the actual output
		Character actual = FindNthFromEnd.findNthFromEnd(list, 3);

		// Compare the expected and actual output
		assertEquals(expected, actual, "Test Case Failed");

	}
}
