package com.customexception;

//Defining a custom exception for invalid age
class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}