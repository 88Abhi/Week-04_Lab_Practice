package com.trywithresources;

import java.io.*;

// Class to use try with resources to close the object automatically
class TryWithResources {
	// Method to read the first line of a file using try-with-resources
	public static void readFirstLine(String fileName) {
		// Using try-with-resources to automatically close the reader
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			// Reading and printing the first line of the file
			String firstLine = reader.readLine();
			System.out.println(firstLine);
		}
		catch (FileNotFoundException e) {
			// Handling IOException
			System.out.println("Error reading file");
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		// Calling the method to read the first line of the file
		readFirstLine("info.txt");
	}
}
