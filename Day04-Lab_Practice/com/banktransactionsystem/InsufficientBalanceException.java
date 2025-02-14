package com.banktransactionsystem;

// Custom exception class for insufficient balance
class InsufficientBalanceException extends Exception {
	// Constructor with a message
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
