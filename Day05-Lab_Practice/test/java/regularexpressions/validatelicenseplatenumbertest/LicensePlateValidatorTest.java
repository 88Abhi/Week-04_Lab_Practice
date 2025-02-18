package regularexpressions.validatelicenseplatenumbertest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static com.regularexpressions.validatelicenseplateumber.LicensePlateValidator.isValidLicensePlate;

// Class to test the regex expression for LicensePlate
public class LicensePlateValidatorTest {
	// Method to test the number
	@Test
	public void testOfValidateNumber() {
		// Defining test cases with both valid and invalid LicenseNumber
		String[] licenseNumber = {"AB1234", "A12345", "XY5678", "Z91234", "ab1234", "CD12"};

		// Creating the expected result
		boolean excpected[] = {true, false, true, false, false, false};

		// Creating a list for valid security number format
		List<String> validLicenseNumber = new ArrayList<>();

		// Iterate through the licenseNumber and check weather security number format is valid
		for (int i = 0; i < licenseNumber.length; i++) {
			boolean isValidlicenseNumbertatus = isValidLicensePlate(licenseNumber[i]);
			if (isValidlicenseNumbertatus) validLicenseNumber.add(licenseNumber[i]);
			Assertions.assertEquals(excpected[i], isValidlicenseNumbertatus);
		}
		System.out.println("Valid number are : " + validLicenseNumber);
	}
}
