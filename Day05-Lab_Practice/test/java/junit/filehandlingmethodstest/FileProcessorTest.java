package junit.filehandlingmethodstest;

import com.junit.filehandlingmethods.FileProcessor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

// Class test the read write operation of file
public class FileProcessorTest {
	private final FileProcessor fileProcessor = new FileProcessor();
	private final String testFilename = "sample.txt";

	// Method to test write operation of file
	@Test
	void testWriteToFile() throws IOException {
		// Creating a variable and store the content
		String content = "Hello, I am Abhishek Jat this is JUnit! testing";

		// writing content in file
		fileProcessor.writeToFile(testFilename, content);

		// Checking if the file was created successfully.
		File file = new File(testFilename);
		assertTrue(file.exists());
	}

	// Method to test the file reader
	@Test
	void testReadFromFile() throws IOException {
		String content = "Hello, World!";
		fileProcessor.writeToFile(testFilename, content);

		// Reading the file and ensuring the content matches.
		String readContent = fileProcessor.readFromFile(testFilename);
		assertEquals(content, readContent);
	}

	@Test
	void testReadFromNonExistentFile() {
		// Attempting to read from a non-existent file should throw an IOException.
		assertThrows(IOException.class, () -> fileProcessor.readFromFile("notexistpath.txt"));
	}

	@AfterEach
	void cleanUp() {
		// Cleaning up the test file after each test.
		new File(testFilename).delete();
	}
}
