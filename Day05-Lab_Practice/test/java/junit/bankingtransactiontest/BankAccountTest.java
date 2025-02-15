package junit.bankingtransactiontest;

import com.junit.bankingtransaction.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Class to test bank account operations
public class BankAccountTest {
	// Create object of BankAccount for testing.
	private BankAccount account;

	// Method to give initial balance to account
	@BeforeEach
	void setUp() {
		// Initializing the bank account with initial balance
		account = new BankAccount(100.0);
	}

	// Method to deposit the amount in the account
	@Test
	void testDepositValidAmount() {
		// Depositing 500 should increase balance
		account.deposit(500.0);
		assertEquals(600.0, account.getBalance());
	}

	// Method to withdraw the amount from the account
	@Test
	void testWithdrawValidAmount() {
		// Withdrawing 400 should reduce balance
		account.withdraw(50);

		// Checking weather getting same as expected or not
		assertEquals(50.0, account.getBalance());
	}

	// Method to withdraw insufficient amount from the account
	@Test
	void testWithdrawInsufficientFunds() {
		// Trying to withdraw more than the balance should throw an exception.
		Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(300.0));

		// Testing weather exception message is same or not
		assertEquals("Insufficient funds.", exception.getMessage());
	}

	// Method to deposit negative amount
	@Test
	void testNegativeDeposit() {
		// Depositing a negative amount should throw an exception.
		assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
	}
}
