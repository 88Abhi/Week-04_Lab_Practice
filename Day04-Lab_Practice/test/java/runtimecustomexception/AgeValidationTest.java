package runtimecustomexception;

import com.customexception.InvalidAgeException;
import org.junit.jupiter.api.Test;

import static com.customexception.AgeValidation.validateAge;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Class to test user age
class AgeValidationTest {
	// Method to test the user's age
	@Test
	public void testOfAgeValidation() throws InvalidAgeException {
		// Creating the age and test
		int age = 18;
		assertTrue(validateAge(age), "Age is under 18");
	}
}