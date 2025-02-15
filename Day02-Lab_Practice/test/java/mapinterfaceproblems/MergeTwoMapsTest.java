package mapinterfaceproblems;

import com.mapinterfaceproblems.mergetwomaps.MergeMaps;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoMapsTest {
	@Test
	public void testMergeMaps() {
		// Creating first map with key-value pairs
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);

		// Creating second map with key-value pairs
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("B", 3);
		map2.put("C", 4);

		// Expected output after merging
		HashMap<String, Integer> expectedMap = new HashMap<>();
		expectedMap.put("A", 1);
		expectedMap.put("B", 5);
		expectedMap.put("C", 4);

		// Calling mergeMaps() and asserting equality
		Map<String, Integer> actualMap = MergeMaps.merge(map1, map2);
		assertEquals(expectedMap, actualMap, "Merged map does not match expected result");
	}
}
