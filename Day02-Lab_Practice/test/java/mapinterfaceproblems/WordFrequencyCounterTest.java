package mapinterfaceproblems;

import com.mapinterfaceproblems.wordfrequencycounter.WordFrequencyCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordFrequencyCounterTest {
	@Test
	public void testCountWordFrequency() throws IOException {
		// Input string with duplicate words
		String input = "Abhishek Jat, Amit, Jat, Abhishek Jat !";

		// Expected word frequency map
		Map<String, Integer> expected = Map.of(
			   "Abhishek", 2,
			   "Jat", 3,
			   "Amit", 1
		);

		// Call the method and compare with expected result
		Assertions.assertEquals(expected, WordFrequencyCounter.countWordFrequency(input), "Word frequency count mismatch");
	}

}
