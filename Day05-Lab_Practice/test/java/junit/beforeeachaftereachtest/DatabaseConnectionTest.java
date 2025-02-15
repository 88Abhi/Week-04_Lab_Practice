package junit.beforeeachaftereachtest;

import com.junit.beforeeachandaftereach.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Class to test the beforeEach and afterEach notations
public class DatabaseConnectionTest {
	private DatabaseConnection databaseConnection;

	// This method runs before each test case.
	@BeforeEach
	void setUp() {
		// Ensuring a fresh database connection is created before each test.
		databaseConnection = new DatabaseConnection();
		databaseConnection.connect();
	}

	// This method runs after each test case.
	@AfterEach
	void tearDown() {
		// Ensuring the database connection is closed after each test.
		databaseConnection.disconnect();
	}

	// This method test the database connection
	@Test
	void testDatabaseConnection() {
		// Ensuring the connection is active after setUp().
		assertTrue(databaseConnection.checkConnected());
	}

	// This method test the lost connection of database
	@Test
	void testDatabaseConnectionLost() {
		// Remove the connection
		databaseConnection.setConnected(false);

		// Checking weather connection is disconnect or not
		assertFalse(databaseConnection.checkConnected());
	}

}
