package insurancepolicymanagementsystem;

import static org.junit.jupiter.api.Assertions.*;
import com.insurancepolicymanagementsystem.InsurancePolicy;
import com.insurancepolicymanagementsystem.InsurancePolicyManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

public class InsurancePolicyManagerTest {
	private InsurancePolicyManager manager;

	// Setup method executed before each test.
	@BeforeEach
	void setUp() {
		manager = new InsurancePolicyManager();
	}

	// Ensures that a policy is correctly added and retrieved.
	@Test
	void testAddPolicy() {
		// Creating a new policy
		InsurancePolicy policy = new InsurancePolicy("H001", "Ankit", LocalDate.of(2025, 2, 15), "Health", 10000.0);
		manager.addPolicy(policy);

		// Fetching all policies and verifying the count
		List<InsurancePolicy> allPolicies = manager.getAllPolicies();
		assertEquals(1, allPolicies.size());

		// Checking if the added policy has the correct policy number
		assertEquals("H001", allPolicies.get(0).getPolicyNumber());
	}
}
