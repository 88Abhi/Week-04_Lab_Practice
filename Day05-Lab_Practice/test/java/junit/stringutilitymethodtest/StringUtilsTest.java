package junit.stringutilitymethodtest;

import com.junit.stringutilitymethod.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
	// Creating an instance of StringUtils for testing methods.
	private final StringUtils stringUtils = new StringUtils();

	// Creating test for reverse method
	@Test
	void testReverse() {
		// testing weather the reverse method correctly reverses a string.
		assertEquals("Abhishek", stringUtils.reverse("kehsihbA"));

		// Ensuring an empty string remains unchanged after reversal.
		assertEquals("", stringUtils.reverse(""));

		// testing weather reversing a null string returns null.
		assertNull(stringUtils.reverse(null));
	}

	// Creating test for IsPalindrome method
	@Test
	void testIsPalindrome() {
		// testing isPalindrome method correctly checking a string palindrome
		assertTrue(stringUtils.isPalindrome("nitin"));

		// Testing an empty string, which should also be considered a palindrome.
		assertTrue(stringUtils.isPalindrome(""));

		// Checking that a non-palindromic word is identified correctly.
		assertFalse(stringUtils.isPalindrome("Abhishek"));
	}

	// Creating test for toUppercase method
	@Test
	void testToUpperCase() {
		// Testing weather the  given string correctly converted to uppercase or not.
		assertEquals("ABHISHEK", stringUtils.toUpperCase("abhishek"));

		// Testing an already uppercase string remains same.
		assertEquals("JAT", stringUtils.toUpperCase("JAT"));

		// testing that a null input returns null.
		assertNull(stringUtils.toUpperCase(null));
	}
}
