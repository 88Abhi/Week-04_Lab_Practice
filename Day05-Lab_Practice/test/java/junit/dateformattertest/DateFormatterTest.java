package junit.dateformattertest;

import com.junit.dateformatter.DateFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Class to test the conversion of date format from one to another
public class DateFormatterTest {
	// Creating a private final object of DateFormatter
	private final DateFormatter formatter = new DateFormatter();

	// Method to test the date format
	@Test
	void testValidDateFormat() {
		// Testing weather the date formated and matched with expected format
		assertEquals("25-02-2004", formatter.formatDate("2004-02-25"));
	}

	// Method to test invalid format
	@Test
	void testInvalidDateFormat() {
		// Testing if date format failed then get the expected exception or not
		assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("25-02-2004"));
	}
}
