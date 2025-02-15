package com.bankingmanagementsystem;

// BankingSystemMain class to test the BankingSystem.
public class BankingSystemMain {
	public static void main(String[] args) {
		// Creating an instance of BankingSystem
		BankingSystem bankingSystem = new BankingSystem();

		// Adding customer accounts
		bankingSystem.addCustomerAccount("A123", 1000.00);
		bankingSystem.addCustomerAccount("B456", 1500.00);
		bankingSystem.addCustomerAccount("C789", 2000.00);
		bankingSystem.addCustomerAccount("D101", 500.00);

		// Displaying customers sorted by balance
		bankingSystem.displayCustomersSortedByBalance();

		// Adding withdrawal requests
		bankingSystem.addWithdrawalRequest("A123", 200.00);
		bankingSystem.addWithdrawalRequest("B456", 1600.00); // Insufficient balance
		bankingSystem.addWithdrawalRequest("C789", 500.00);
		bankingSystem.addWithdrawalRequest("D101", 100.00);

		// Processing withdrawal requests
		bankingSystem.processWithdrawals();

		// Displaying customer balances after withdrawals
		bankingSystem.displayCustomerBalance("A123");
		bankingSystem.displayCustomerBalance("B456");
		bankingSystem.displayCustomerBalance("C789");
		bankingSystem.displayCustomerBalance("D101");
	}
}
