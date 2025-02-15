package bankingmanagementsystem;

import com.bankingmanagementsystem.BankingSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Defining the test class for the Banking System
public class BankingSystemTest {
	// Declaring a private instance of BankingSystem
	private BankingSystem bankingSystem;

	// Method to set up test data before each test execution
	@BeforeEach
	void setUp() {
		// Initializing the BankingSystem instance
		bankingSystem = new BankingSystem();

		// Adding customer accounts with initial balances
		bankingSystem.addCustomerAccount("A01", 10000.00);
		bankingSystem.addCustomerAccount("B02", 15000.00);
		bankingSystem.addCustomerAccount("C03", 5000.00);
		bankingSystem.addCustomerAccount("D04", 5500.00);
	}

	// Test case to verify if a customer account is added correctly
	@Test
	void testAddCustomerAccount() {
		// Adding a new customer account
		bankingSystem.addCustomerAccount("E05", 3000.00);

		// Verifying if the balance of the newly added account is correct
		assertEquals(3000.00, bankingSystem.getCustomerBalance("E05"));
	}

	// Test case to verify a successful withdrawal
	@Test
	void testWithdrawSuccessful() {
		// Adding a withdrawal request for an account
		bankingSystem.addWithdrawalRequest("A01", 1000.00);

		// Processing the withdrawal requests
		bankingSystem.processWithdrawals();

		// Verifying if the updated balance reflects the withdrawal
		assertEquals(9000.00, bankingSystem.getCustomerBalance("A01"));
	}

	// Test case to verify behavior when withdrawal amount exceeds balance
	@Test
	void testWithdrawInsufficientBalance() {
		// Adding a withdrawal request greater than available balance
		bankingSystem.addWithdrawalRequest("B02", 2000.00);

		bankingSystem.processWithdrawals();

		// Verifying that the balance remains unchanged due to insufficient funds
		assertEquals(13000.00, bankingSystem.getCustomerBalance("B02"));
	}

	// Test case to verify multiple withdrawals at once
	@Test
	void testMultipleWithdrawals() {
		// Adding multiple withdrawal requests for different accounts
		bankingSystem.addWithdrawalRequest("C03", 500.00);
		bankingSystem.addWithdrawalRequest("D04", 500.00);

		bankingSystem.processWithdrawals();

		// Verifying the updated balances after withdrawals
		assertEquals(4500.00, bankingSystem.getCustomerBalance("C03"));
		assertEquals(5000.00, bankingSystem.getCustomerBalance("D04"));
	}

	// Test case to verify retrieval of customer account balances
	@Test
	void testDisplayCustomerBalance() {

		// Verifying if the balance of accounts remains as initialized
		assertEquals(10000.00, bankingSystem.getCustomerBalance("A01"));
		assertEquals(15000.00, bankingSystem.getCustomerBalance("B02"));
	}
}
