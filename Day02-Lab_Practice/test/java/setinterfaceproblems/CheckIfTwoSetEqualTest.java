package setinterfaceproblems;

import com.setinterfaceproblems.checkiftwosetsareequal.CheckSetsEquality;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfTwoSetEqualTest {
	@Test
	public void testAreSetsEqual() {
		// Create two sets with the same elements in different orders
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 1, 2));

		// Expected result: true (since sets are unordered and contain the same elements)
		Assertions.assertTrue(CheckSetsEquality.areSetsEqual(set1, set2), "Sets should be equal");

		// Create a different set
		Set<Integer> set3 = new HashSet<>(Arrays.asList(11, 2, 3));

		// Expected result: false (different element)
		assertFalse(CheckSetsEquality.areSetsEqual(set1, set3), "Sets should not be equal");

		// Test with empty sets
		assertTrue(CheckSetsEquality.areSetsEqual(new HashSet<>(), new HashSet<>()), "Empty sets should be equal");

		// Test with one empty set
		assertFalse(CheckSetsEquality.areSetsEqual(set1, new HashSet<>()), "Non-empty set should not be equal to an empty set");
	}
}
