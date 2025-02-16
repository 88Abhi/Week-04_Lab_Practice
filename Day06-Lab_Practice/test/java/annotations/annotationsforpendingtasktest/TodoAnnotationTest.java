package annotations.annotationsforpendingtasktest;

import com.annotations.annotationforpendingtasks.Development;
import com.annotations.annotationforpendingtasks.Todo;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Class to test custom annotation
class TodoAnnotationTest {
	// Method to test the Todo annotation
	@Test
	void testTodoAnnotation() throws Exception {
		// Get all methods from the Development class
		Method[] methods = Development.class.getDeclaredMethods();

		boolean loginFeature = false;
		boolean dbOptimizationTaskFound = false;

		for (Method method : methods) {
			// Check if the method has the @Todo annotation
			if (method.isAnnotationPresent(Todo.class)) {
				Todo annotation = method.getAnnotation(Todo.class);

				// Validate the annotation values
				if (method.getName().equals("loginFeature")) {
					assertEquals("Implement login authentication", annotation.task(), "Signup feature task mismatch");
					assertEquals("Abhishek Jat", annotation.assignedTo(), "Signup feature assigned person mismatch");
					assertEquals("HIGH", annotation.priority(), "Signup feature priority mismatch");
					loginFeature = true;
				}
				else if (method.getName().equals("databaseOptimization")) {
					assertEquals("Optimize database queries", annotation.task(), "Database optimization task mismatch");
					assertEquals("Abhishek", annotation.assignedTo(), "Database optimization assigned person mismatch");
					assertEquals("MEDIUM", annotation.priority(), "Database optimization priority mismatch");
					dbOptimizationTaskFound = true;
				}
			}
		}

		// Ensure both annotations are found
		assertTrue(loginFeature, "Method 'loginFeature' is missing ");
		assertTrue(dbOptimizationTaskFound, "Method 'databaseOptimization' is missing");

	}
}
