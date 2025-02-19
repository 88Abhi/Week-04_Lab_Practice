package reflection.retrieveannotationsruntimetest;

import com.reflection.retrieveannotationsatruntime.Author;
import org.junit.jupiter.api.Test;
import java.lang.annotation.Annotation;

import static org.junit.jupiter.api.Assertions.*;

// Class to test the annotation retriever
class AnnotationRetrieverTest {
	// Method to test the Author Annotation
	@Test
	void testBookClassHasAuthorAnnotation() throws Exception {
		// Retrieving the Class object for Book
		Class<?> bookClass = Class.forName("com.reflection.retrieveannotationsatruntime.Book");

		// Checking if @Author annotation is present
		boolean isAnnotationPresent = bookClass.isAnnotationPresent(Author.class);

		// Verify the annotation exists
		assertTrue(isAnnotationPresent, "Book class should have @Author annotation");
	}

	// Method to test the annotation retrieval
	@Test
	void testAuthorAnnotationRetrieval() throws Exception {
		Class<?> bookClass = Class.forName("com.reflection.retrieveannotationsatruntime.Book");

		// Retrieving the annotation
		Annotation annotation = bookClass.getAnnotation(Author.class);

		// Verify correct author name
		assertNotNull(annotation, "Annotation should not be null");
		Author author = (Author) annotation;
		assertEquals("Abhishek Jat", author.name(), "Author name should match the annotation value");
	}
}
