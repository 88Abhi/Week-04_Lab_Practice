package regularexpressions.validatesocialsecuritynumbertest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static com.regularexpressions.validatesocialsecuritynumber.SSNValidator.isValidSSN;

public class SSNValidatorTest {
	// Create a method to check the valid security number format
	@Test
	public void testOfValidSecurityFormat() {
		// Defining test cases with both valid and invalid SSNs
		String[] ssns = {"123-45-6789", "987-65-4321", "123456789", "123-456-789", "0134-244-9880"};

		// Creating the expected result
		boolean excpected[] = {true, true, false, false, false};

		// Creating a list for valid security number format
		List<String> validNumber = new ArrayList<>();

		// Iterate through the ssns and check weather security number format is valid
		for (int i = 0; i < ssns.length; i++) {
			boolean isValidSSNStatus = isValidSSN(ssns[i]);
			if (isValidSSNStatus) validNumber.add(ssns[i]);
			Assertions.assertEquals(excpected[i], isValidSSNStatus);
		}
		System.out.println("Valid number are : " + validNumber);
	}
}
