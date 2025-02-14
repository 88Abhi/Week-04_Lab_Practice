package com.banktransactionsystem;

import java.util.Scanner;

// BankTransactionSystem class to handle user input and transactions
public class BankTransactionSystem {
	public static void main(String[] args) {
		// Creating Scanner object for user input
		Scanner sc = new Scanner(System.in);

		// Creating a BankAccount object with an initial balance
		BankAccount account = new BankAccount(5000);

		// Taking withdrawal amount from user
		System.out.print("Enter withdrawal amount: ");
		double amount = sc.nextDouble();

		try {
			// Attempting to withdraw the specified amount
			account.withdraw(amount);
		}
		catch (InsufficientBalanceException e) {
			// Handling insufficient balance exception
			System.out.println(e.getMessage());
		}
		catch (IllegalArgumentException e) {
			// Handling negative amount exception
			System.out.println(e.getMessage());
		}

		// Closing the Scanner object
		sc.close();
	}
}
