package com.annotations.annotationforfieldvalidation;

// Defining the main class to test the annotation functionality
public class MaxLengthExample {
	public static void main(String[] args) {
		// Creating a valid User object
		User user1 = new User("Abhishek");
		System.out.println("Valid username is: " + user1.getUsername());

		// Attempting to create an invalid User object
		try {
			User user2 = new User("AbhishekJat");
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
