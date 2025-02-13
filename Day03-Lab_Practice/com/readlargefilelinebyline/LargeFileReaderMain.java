package com.readlargefilelinebyline;

// Class to read a large file line by line and filter lines containing "error"
public class LargeFileReaderMain {
	public static void main(String[] args) {
		// Define the path of the large text file
		String filePath = "source.txt";

		// Create an instance of FileProcessor
		LargeFileReader fileProcessor = new LargeFileReader();

		// Call the method to process the file
		fileProcessor.processFile(filePath);
	}
}
