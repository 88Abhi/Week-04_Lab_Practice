package annotations.customannotationstest;

import com.annotations.customannotation.TaskInfo;
import com.annotations.customannotation.TaskManager;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Class to test the custom annotation
class AnnotationExampleTest {
	// Method to test the TaskInfo Annotation
	@Test
	void testTaskInfoAnnotation() throws Exception {
		// Get the method reference
		Method method = TaskManager.class.getMethod("completeTask");

		// Check if annotation is present
		assertTrue(method.isAnnotationPresent(TaskInfo.class));

		// Get the annotation
		TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

		// Validate annotation values
		assertEquals("High", taskInfo.priority());
		assertEquals("Abhishek", taskInfo.assignedTo());
		System.out.println("Test cases passed");
	}
}
