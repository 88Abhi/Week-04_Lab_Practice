package annotations.deprecatedtest;

import com.annotations.deprecated.LegacyAPI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Class to test the deprecated notation
public class DeprecatedExampleTest {
	// Method to test Deprecated method
    @Test
    public void testOfDeprecatedMethod() {
	   // Create an object to make use of the deprecated method
	   LegacyAPI object  = new LegacyAPI();

	   // Call the deprecated method
	   String result = object.oldFeature();

	   // Assert that the method returns the expected result
	   assertTrue(result.equals("This is an old feature. Do not use it."));
    }
}
