package com.efficientfilecopy;

import java.io.*;

// Class to copy a file using Buffered Streams
public class BufferedFileCopy {
	// Method to copy a file using BufferedInputStream and BufferedOutputStream
	public static void copyFileWithBuffer(String sourceFilePath, String destinationFilePath) {
		// Declare BufferedStream to read and write from the file
		BufferedInputStream bufferedInputStream = null;
		BufferedOutputStream bufferedOutputStream = null;

		// Define the buffer size as 4 KB
		final int BUFFER_SIZE = 4096;
		long startTime, endTime, duration;

		try {
			// Create a File object for the source file
			File sourceFile = new File(sourceFilePath);

			// Check if the source file exists before proceeding
			if (!sourceFile.exists()) {
				System.out.println("Error: Source file does not exist.");
				return;
			}

			// Create a File object for the destination file
			File destinationFile = new File(destinationFilePath);

			// Check if the destination file exists
			if (!destinationFile.exists()) {
				boolean isCreated = destinationFile.createNewFile();

				// Print message if file creation fails
				if (!isCreated) {
					System.out.println("Error: Unable to create destination file.");
					return;
				}
			}

			// Initialize FileStream to read and write the file
			FileInputStream fileInputStream = new FileInputStream(sourceFile);
			FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);

			// Wrap FileStream inside BufferedStream for efficient reading and writing
			bufferedInputStream = new BufferedInputStream(fileInputStream, BUFFER_SIZE);
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream, BUFFER_SIZE);

			// Declare a byte array buffer of size 4 KB
			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;

			// Record the start time
			startTime = System.nanoTime();

			// Read the file in chunks of 4 KB and write to the destination file
			while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
				bufferedOutputStream.write(buffer, 0, bytesRead);
			}

			// Record the end time after the file copy
			endTime = System.nanoTime();

			// Calculate the total execution time in milliseconds
			duration = (endTime - startTime) / 1000000;
			System.out.println("Buffered file copy completed in " + duration + " ms.");
		}
		catch (IOException e) {
			// Handle general input/output exceptions
			System.out.println("Error occurred during file operation: " + e.getMessage());
		}
		finally {
			try {
				// Close BufferedInputStream if it was opened
				if (bufferedInputStream != null) {
					bufferedInputStream.close();
				}

				// Close BufferedOutputStream if it was opened
				if (bufferedOutputStream != null) {
					bufferedOutputStream.close();
				}
			}
			catch (IOException e) {
				// Handle errors while closing the streams
				System.out.println("Error while closing the file: " + e.getMessage());
			}
		}
	}
}
