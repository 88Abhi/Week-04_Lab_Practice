package insurancepolicymanagement;

import static org.junit.jupiter.api.Assertions.*;
import com.insurancepolicymanagement.InsurancePolicy;
import com.insurancepolicymanagement.InsurancePolicyManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class InsurancePolicyManagerTest {
	private InsurancePolicyManager manager;
	@BeforeEach
	void setUp() {
		// Initializing the InsurancePolicyManager before each test
		manager = new InsurancePolicyManager();

		// Adding sample policies
		manager.addPolicy(new InsurancePolicy("P01", "Amit", LocalDate.of(2025, 5, 15), 1000));
		manager.addPolicy(new InsurancePolicy("P02", "Vinay", LocalDate.of(2024, 3, 10), 2500));
		manager.addPolicy(new InsurancePolicy("P03", "Abhishek", LocalDate.of(2024, 2, 25), 1140));
		manager.addPolicy(new InsurancePolicy("P04", "Ajeet", LocalDate.of(2024, 4, 5), 1500));
	}

	@Test
	void testAddPolicy() {
		// Adding a new policy and verifying if it is stored correctly
		manager.addPolicy(new InsurancePolicy("P05", "Deepak", LocalDate.of(2025, 8, 20), 2500));

		// Checking if the policy exists in the manager
		InsurancePolicy policy = manager.getPolicyByNumber("P05");
		assertNotNull(policy);
		assertEquals("Deepak", policy.getPolicyholderName());
		assertEquals(2500, policy.getPremiumAmount());
	}

	@Test
	void testRetrievePolicyByNumber() {
		// Retrieving a policy by policy number and checking details
		InsurancePolicy policy = manager.getPolicyByNumber("P02");
		assertNotNull(policy);
		assertEquals("Vinay", policy.getPolicyholderName());
		assertEquals(2500, policy.getPremiumAmount());
	}

	@Test
	void testRetrieveNonExistentPolicy() {
		// Attempting to retrieve a non-existing policy
		InsurancePolicy policy = manager.getPolicyByNumber("P07");
		assertNull(policy);
	}

	@Test
	void testListExpiringPolicies() {
		// Checking if expiring policies within 30 days are listed correctly
		int expiringPolicies = manager.getExpiringPolicies().size();
		assertTrue(expiringPolicies > 0, "There should be at least one expiring policy.");
	}

	@Test
	void testRemoveExpiredPolicies() {
		// Removing expired policies and checking if they are deleted
		manager.removeExpiredPolicies();

		// Policy PA03 (expired) should no longer exist
		assertNull(manager.getPolicyByNumber("P03"));

		// Policy PA02 (expired) should also be removed
		assertNull(manager.getPolicyByNumber("P02"));
	}
}
