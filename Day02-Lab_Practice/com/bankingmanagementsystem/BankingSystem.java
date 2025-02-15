package com.bankingmanagementsystem;

import java.util.*;

// Class representing a banking system
public class BankingSystem {
	// HashMap to store customer accounts
	private Map<String, Double> customerAccounts = new HashMap<>();

	// TreeMap to store customers sorted by their balance
	private Map<Double, String> customersSortedByBalance = new TreeMap<>();

	// Queue to process withdrawal requests
	private Queue<Map.Entry<String, Double>> withdrawalRequests = new LinkedList<>();

	// Method to add a customer account with an initial balance.
	public void addCustomerAccount(String accountNumber, double initialBalance) {
		// Add account to the customerAccounts HashMap
		customerAccounts.put(accountNumber, initialBalance);

		// Add customer to the TreeMap sorted by balance
		customersSortedByBalance.put(initialBalance, accountNumber);
	}

	// Method to processes a withdrawal request by adding it to the withdrawal queue.
	public void addWithdrawalRequest(String accountNumber, double amount) {
		withdrawalRequests.offer(new AbstractMap.SimpleEntry<>(accountNumber, amount));
	}

	// Method to processes all withdrawal requests in the queue.
	public void processWithdrawals() {
		while (!withdrawalRequests.isEmpty()) {
			// Dequeue a withdrawal request
			Map.Entry<String, Double> request = withdrawalRequests.poll();

			// Retrieve the account number and withdrawal amount
			String accountNumber = request.getKey();
			double amount = request.getValue();

			// Check if the account has enough balance to process the withdrawal
			if (customerAccounts.containsKey(accountNumber)) {
				double currentBalance = customerAccounts.get(accountNumber);

				// If sufficient balance, process the withdrawal
				if (currentBalance >= amount) {
					currentBalance -= amount;
					customerAccounts.put(accountNumber, currentBalance);
					System.out.println("Withdrawal successful from account: " + accountNumber + " | Amount: " + amount);
				}
				else {
					System.out.println("Insufficient balance for account: " + accountNumber);
				}
			}
			else {
				System.out.println("Account not found: " + accountNumber);
			}
		}
	}

	// Displays all customer accounts sorted by balance using TreeMap.
	public void displayCustomersSortedByBalance() {
		System.out.println("\nCustomers Sorted by Balance (TreeMap):");
		for (Map.Entry<Double, String> entry : customersSortedByBalance.entrySet()) {
			String accountNumber = entry.getValue();
			double balance = entry.getKey();
			System.out.println("Account: " + accountNumber + ", Balance: " + balance);
		}
	}

	// Displays the balance of a specific customer account
	public void displayCustomerBalance(String accountNumber) {
		if (customerAccounts.containsKey(accountNumber)) {
			System.out.println("\nAccount: " + accountNumber + ", Balance: " + customerAccounts.get(accountNumber));
		}
		else {
			System.out.println("\nAccount not found: " + accountNumber);
		}
	}

	// Retrieves the balance of a specific customer account for testing purposes.
	public double getCustomerBalance(String accountNumber) {
		return customerAccounts.getOrDefault(accountNumber, -1.0);
	}
}
