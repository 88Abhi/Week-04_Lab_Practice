package com.banktransactionsystem;

// BankAccount class with withdraw functionality
class BankAccount {
	// Private balance variable for encapsulation
	private double balance;

	// Constructor to initialize balance
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	// Method to perform withdrawal
	public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
		// Checking if the amount is negative
		if (amount < 0) {
			throw new IllegalArgumentException("Invalid amount!");
		}

		// Checking if balance is sufficient for withdrawal
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance!");
		}

		// Deducting the amount from balance
		balance -= amount;

		// Printing the successful transaction message
		System.out.println("Withdrawal successful, new balance: " + balance);
	}

	// Method to get the current balance
	public double getBalance() {
		return balance;
	}
}

