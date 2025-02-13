package com.efficientfilecopy;

// Class to test file copy performance
public class FileCopyMain {
	public static void main(String[] args) {
		// Define the source file path
		String sourceFile = "source.txt";

		// Define the destination file path for buffered copy
		String bufferedDestination = "buffered_copy.txt";

		// Define the destination file path for unbuffered copy
		String unbufferedDestination = "unbuffered_copy.txt";

		// Perform file copy using Buffered Streams
		BufferedFileCopy.copyFileWithBuffer(sourceFile, bufferedDestination);

		// Perform file copy using Unbuffered Streams
		UnbufferedFileCopy.copyFileWithoutBuffer(sourceFile, unbufferedDestination);
	}
}
