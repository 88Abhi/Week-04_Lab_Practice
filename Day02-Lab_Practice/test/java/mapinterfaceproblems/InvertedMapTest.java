package mapinterfaceproblems;

import com.mapinterfaceproblems.invertamap.InvertMap;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvertedMapTest {
	@Test
	public void testInvertedMap() {
		// Creating a HashMap to store key-value pairs
		HashMap<String, Integer> input = new HashMap<>();

		input.put("A", 1);
		input.put("B", 2);
		input.put("C", 1);

		// Calling the method to invert the map
		HashMap<Integer, List<String>> actualMap = InvertMap.invert(input);

		// Creating an expected result map to compare with the actual output
		Map<Integer, List<String>> resultMap = new HashMap<>();

		// Mapping value 1 to a list containing keys "A" and "C"
		resultMap.put(1, List.of("A", "C"));

		// Mapping value 2 to a list containing key "B"
		resultMap.put(2, List.of("B"));

		// Checking if the actual inverted map matches the expected map
		assertTrue(actualMap.equals(resultMap));
	}
}
