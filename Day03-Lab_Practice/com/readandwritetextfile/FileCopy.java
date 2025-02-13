package com.readandwritetextfile;

import java.io.*;

// Class to read from a text file and write into another file
public class FileCopy {
	// Method to read the contents of a file and write into another file
	public static void copyTextFile(String sourceFilePath, String destinationFilePath) {
		// Declare FileInputStream to read from the source file
		FileInputStream fileInputStream = null;

		// Declare FileOutputStream to write into the destination file
		FileOutputStream fileOutputStream = null;

		try {
			// Create a File object for the source file
			File sourceFile = new File(sourceFilePath);

			// Check if the source file exists
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

			// Initialize FileInputStream to read from the source file
			fileInputStream = new FileInputStream(sourceFile);

			// Initialize FileOutputStream to write into the destination file
			fileOutputStream = new FileOutputStream(destinationFile);
			int byteData;

			// Read the source file byte by byte and write to the destination file
			while ((byteData = fileInputStream.read()) != -1) {
				fileOutputStream.write(byteData);
			}
			System.out.println("File copied successfully!");
		}
		catch (IOException e) {
			// Handle general input/output exceptions
			System.out.println("Error occurred during file operation: " + e.getMessage());
		}
		finally {
			try {
				// Close FileInputStream if it was opened
				if (fileInputStream != null) {
					fileInputStream.close();
				}

				// Close FileOutputStream if it was opened
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			}
			catch (IOException e) {
				// Handle errors while closing the streams
				System.out.println("Error while closing the file: " + e.getMessage());
			}
		}
	}
}