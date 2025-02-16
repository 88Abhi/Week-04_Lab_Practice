package com.annotations.customserializationannotation;

// Defining the main class to test the JSON serialization
public class JsonSerializationExample {
	public static void main(String[] args) {
		// Creating a User object
		User user = new User("abhishek", "abhishekjat@example.com");

		// Serializing the object to JSON
		String jsonOutput = user.toJson();

		// Printing the JSON representation
		System.out.println(jsonOutput);
	}
}
