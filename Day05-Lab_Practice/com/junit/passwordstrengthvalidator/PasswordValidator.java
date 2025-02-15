package com.junit.passwordstrengthvalidator;

// Class to validate the password strength
public class PasswordValidator {
	// Checks if the password meets the required strength criteria.
	public boolean isValidPassword(String password) {
		if (password == null || password.length() < 8) {
			return false;
		}
		boolean hasUpperCase = false, hasDigit = false;

		for (char ch : password.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				hasUpperCase = true;
			}
			else if (Character.isDigit(ch)) {
				hasDigit = true;
			}
		}

		// Must contain at least one uppercase letter and one digit.
		return hasUpperCase && hasDigit;
	}
}
