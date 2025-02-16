package annotations.annotationtomarkimportantmethodstest;

import com.annotations.annotationtomarkimportantmethods.ImportantMethod;
import com.annotations.annotationtomarkimportantmethods.Project;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Class to test the Custom annotation
class ImportantMethodTest {
	// Method to test the importance of methods
	@Test
	void testImportantMethodAnnotation() throws Exception {
		// Get all methods from the Project class
		Method[] methods = Project.class.getDeclaredMethods();

		// Check if the methods have the @ImportantMethod annotation and validate the values
		boolean highPriorityFound = false;
		boolean mediumPriorityFound = false;

		for (Method method : methods) {
			// Check if the method has @ImportantMethod
			if (method.isAnnotationPresent(ImportantMethod.class)) {
				ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);

				// Validate the annotation values
				if (method.getName().equals("criticalTask")) {
					assertEquals("HIGH", annotation.level(), "Critical task should have HIGH priority");
					highPriorityFound = true;
				}
				else if (method.getName().equals("normalTask")) {
					assertEquals("MEDIUM", annotation.level(), "Normal task should have MEDIUM priority");
					mediumPriorityFound = true;
				}
			}
		}

		// Ensure both annotations are found
		assertTrue(highPriorityFound, "Method 'criticalTask' is missing ");
		assertTrue(mediumPriorityFound, "Method 'normalTask' is missing");
	}
}
