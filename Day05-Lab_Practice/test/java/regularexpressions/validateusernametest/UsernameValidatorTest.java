package regularexpressions.validateusernametest;

import com.regularexpressions.validateusername.UsernameValidator;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Class to validate the username
public class UsernameValidatorTest {
	// Method to test the username validation
	@Test
	public void testOfValidateUsername() {
		// Defining test usernames for the testing
		String[] testUsernames = {"user_123", "123user", "us", "Valid_1", "TooLongUsername123"};

		// Defining the expected result to check output
		boolean expectedResult[] = {true, false, false, true, false};

		// Creating Instance to make call the validate method
		UsernameValidator usernameValidator = new UsernameValidator();

		// Creating a list to store the valid username
		List<String> validUserName = new ArrayList<>();

		// Create a list to store the invalid username
		List<String> invalidUserName = new ArrayList<>();

		// Iterate over testUsername and validate the username
		for (int i = 0; i < testUsernames.length; i++) {
			// Create a variable to store the valid username result
			boolean status = UsernameValidator.isValidUsername(testUsernames[i]);
			if (status) {
				validUserName.add(testUsernames[i]);
			}
			else {
				invalidUserName.add(testUsernames[i]);
			}

			// Testing weather the actual result is same as expected or not
			assertEquals(expectedResult[i], status);
		}

		System.out.println("Validation works Fine");
		System.out.println("Valid names are : " + validUserName);
		System.out.println("Invalid names are : " + invalidUserName);
	}
}