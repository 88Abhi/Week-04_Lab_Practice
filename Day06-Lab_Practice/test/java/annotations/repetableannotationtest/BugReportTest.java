package annotations.repetableannotationtest;

import com.annotations.repeatableannotation.BugReport;
import com.annotations.repeatableannotation.BugReports;
import com.annotations.repeatableannotation.Software;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Class to test the repeatable annotations
public class BugReportTest {
	// Method to test the BugReport Annotation
	@Test
	void testBugReportAnnotations() throws Exception {
		// Get the method reference
		Method method = Software.class.getMethod("applicationFeature");

		// Ensure the annotation exists
		assertTrue(method.isAnnotationPresent(BugReports.class));

		// Retrieve annotation
		BugReports bugReports = method.getAnnotation(BugReports.class);
		BugReport[] bugs = bugReports.value();

		// Verify the number of bug reports
		assertEquals(2, bugs.length);

		// Verify first bug report
		assertEquals("Fix memory leak issue", bugs[0].description());

		// Verify second bug report
		assertEquals("Resolve UI crash on load", bugs[1].description());
	}
}
