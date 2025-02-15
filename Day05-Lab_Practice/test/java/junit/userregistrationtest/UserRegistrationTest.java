package junit.userregistrationtest;

import com.junit.userregistration.UserRegistration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Class to test the user registration based on its information
public class UserRegistrationTest {
	// Creating final instance of the user registration class
	private final UserRegistration registration = new UserRegistration();

	// Method to test the process of registration of a valid user
	@Test
	void testValidRegistration() {
		// Testing weather the given mail is valid or not
		assertTrue(registration.registerUser("Abhishek Jat", "abhishekjat@example.com", "Abhi123"));
	}

	// Method to test invalid email format
	@Test
	void testInvalidEmail() {
		//Testing on Invalid mail and check weather we get the expected exception or not
		assertThrows(IllegalArgumentException.class, () -> registration.registerUser("abhi", "invalid-email", "sample123"));
	}

	// Method to test the short password given by user
	@Test
	void testShortPassword() {
		//testing weather method works as expected on short password
		assertThrows(IllegalArgumentException.class, () -> registration.registerUser("Abhishek", "abhi@example.com", "123"));
	}
}
