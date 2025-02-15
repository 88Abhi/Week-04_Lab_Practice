package setinterfaceproblems;

import com.setinterfaceproblems.findsubsets.FindSubsets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindSubsetsTest {
	@Test
	public void testIsSubset() {
		// Taken set1 and set2 for testing
		Set<Integer> set1 = new HashSet<>(Set.of(7, 8));
		Set<Integer> set2 = new HashSet<>(Set.of(7, 8, 9, 6));

		// Verify if set1 is a subset of set2
		Assertions.assertTrue(FindSubsets.isSubset(set1, set2), "set1 should be a subset of set2");

		// Case where set1 is not a subset
		Set<Integer> set3 = new HashSet<>(Set.of(18, 2));
		assertFalse(FindSubsets.isSubset(set3, set2), "set3 should not be a subset of set2");
		System.out.println("All tests passed!");
	}
}
