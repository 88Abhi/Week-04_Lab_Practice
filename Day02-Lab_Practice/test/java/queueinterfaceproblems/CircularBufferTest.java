package queueinterfaceproblems;

import com.queueinterfaceproblems.circularbuffersimulation.CircularBuffer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CircularBufferTest {
	@Test
	public void testCircularBufferOperations() {
		// Creating a circular buffer with a fixed capacity of 3
		CircularBuffer cb = new CircularBuffer(3);
		cb.insert(1);
		cb.insert(2);
		cb.insert(3);

		int[] actualBuffer1 = cb.getBuffer();
		int[] expectedBuffer1 = {1, 2, 3};

		// Comparing the actual buffer state with the expected buffer state
		assertArrayEquals(expectedBuffer1, actualBuffer1, "Initial buffer does not match!");

		cb.insert(4);

		// Retrieving the updated state of the buffer as an array
		int[] actualBuffer2 = cb.getBuffer();
		int[] expectedBuffer2 = {2, 3, 4};

		// Comparing the actual buffer state with the expected buffer state after override
		assertArrayEquals(expectedBuffer2, actualBuffer2, "Buffer override behavior unsuccessful");
	}
}
