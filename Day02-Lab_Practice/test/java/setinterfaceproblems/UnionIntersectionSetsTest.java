package setinterfaceproblems;

import com.setinterfaceproblems.unionandintersectionoftwosets.UnionIntersectionSets;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnionIntersectionSetsTest {
	@Test
	public void testComputeUnionIntersection() {
		// Given two sets with both common and unique elements
		Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));

		// All elements from both sets
		Set<Integer> expectedUnion = new HashSet<>(Set.of(1, 2, 3, 4, 5));

		// Only common elements
		Set<Integer> expectedIntersection = new HashSet<>(Set.of(3));

		// Call the method under test
		Map<String, Set<Integer>> actualResult = UnionIntersectionSets.computeUnionIntersection(set1, set2);

		// Assertions to verify the results
		assertEquals(expectedUnion, actualResult.get("Union"), "Union computation is incorrect!");
		assertEquals(expectedIntersection, actualResult.get("Intersection"), "Intersection computation is incorrect!");
		System.out.println("All test Cases Passed!");
	}
}
