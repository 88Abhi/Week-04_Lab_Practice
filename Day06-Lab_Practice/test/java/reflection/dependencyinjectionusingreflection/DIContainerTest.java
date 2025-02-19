package reflection.dependencyinjectionusingreflection;

import com.reflection.dependencyinjectionusingreflection.DIContainer;
import com.reflection.dependencyinjectionusingreflection.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Test class for Dependency Injection using Reflection
public class DIContainerTest {
	// Test to verify that dependencies are injected correctly
	@Test
	public void testDependencyInjection() {
		// Create an instance of UserService
		UserService userService = new UserService();

		// Inject dependencies using DIContainer
		DIContainer.injectDependencies(userService);

		// Verify that DatabaseService is injected
		assertNotNull(userService.getDatabaseService(), "DatabaseService should be injected");

		// Verify that NotificationService is injected
		assertNotNull(userService.getNotificationService(), "NotificationService should be injected");
	}
}
