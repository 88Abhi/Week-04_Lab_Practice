package junit.passwordstrengthvalidatortest;

import com.junit.passwordstrengthvalidator.PasswordValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Class to test the strength of the password
public class PasswordValidatorTest {
	private final PasswordValidator validator = new PasswordValidator();

	// Method to validate the password
	@Test
	void testValidPassword() {
		// Testing weather on given password working correctly or not
		assertTrue(validator.isValidPassword("Abhishek123"));
	}

	// Method to test short length password
	@Test
	void testShortPassword() {
		// Testing weather short password accepted or not
		assertFalse(validator.isValidPassword("Abhi123"));
	}

	// Method to test the uppercase in password
	@Test
	void testPasswordWithoutUppercase() {
		// Checking weather given password contains a one Uppercase letter
		assertFalse(validator.isValidPassword("abhi123"));
	}

	// Method to test password without digit
	@Test
	void testPasswordWithoutDigit() {
		// Testing password contains at least one number or not
		assertFalse(validator.isValidPassword("abhijatt"));
	}
}
