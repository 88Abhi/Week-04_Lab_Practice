package annotations.annotationforfieldvalidationtest;

import com.annotations.annotationforfieldvalidation.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Class to test the custom annotation
class MaxLengthTest {
	// Method to test the Validation of username
	@Test
	void testValidUsername() {
		// Should create a user without exceptions
		assertDoesNotThrow(() -> new User("Abhishek"));
	}

	// Method to test invalid username
	@Test
	void testInvalidUsername() {
		// Should throw IllegalArgumentException due to exceeding max length
		Exception exception = assertThrows(IllegalArgumentException.class,
			   () -> new User("Abhishekjat"));

		assertEquals("Username exceeds max length of 10 characters", exception.getMessage());
	}
}
