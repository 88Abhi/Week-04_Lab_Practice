package com.checkedexceptions;

import java.io.*;

// Class to read file and handle exception if occurs
public class FilerReader {
	// Method to read a file and handle IOException
	public static void readFile(String fileName) {
		// Creating a File object for the given file name
		File file = new File(fileName);

		// Using try-catch to handle IOException
		try {
			// Creating FileReader and BufferedReader to read the file
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;

			// Read file line by line
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			// Closing the BufferedReader
			bufferedReader.close();
		}
		// Catching IOException and displaying an error message
		catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		// Calling the method to read the file
		readFile("data.txt");
	}
}
