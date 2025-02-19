package reflection.customloggingproxyusingreflectiontest;

import com.reflection.customloggingproxyusingreflection.Greeting;
import com.reflection.customloggingproxyusingreflection.GreetingImplentation;
import com.reflection.customloggingproxyusingreflection.LoggingProxyHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// Class to test the LoggingProxy
class LoggingProxyTest {
	// Method to test the proxy
	@Test
	void testLoggingProxy() {
		// Create an instance of the real Greeting implementation
		Greeting realGreeting = new GreetingImplentation();

		// Create a proxy for the Greeting interface with LoggingProxyHandler
		Greeting proxyGreeting = (Greeting) java.lang.reflect.Proxy.newProxyInstance(Greeting.class.getClassLoader(), new Class[]{Greeting.class}, new LoggingProxyHandler(realGreeting));

		// Call the method via the proxy
		String message = proxyGreeting.sayHello("Abhishek Jat");

		// Verify that the message is correctly returned
		assertNotNull(message, "The greeting message should not be null.");
		assertEquals("Hello, Abhishek Jat!", message, "The greeting message should be 'Hello, Abhishek Jat!'.");
	}

	// Method to test the proxy method call
	@Test
	void testLoggingProxyMethodCall() {
		// Create an instance of the real Greeting implementation
		Greeting realGreeting = new GreetingImplentation();

		// Create a proxy for the Greeting interface
		Greeting proxyGreeting = (Greeting) java.lang.reflect.Proxy.newProxyInstance(Greeting.class.getClassLoader(), new Class[]{Greeting.class}, new LoggingProxyHandler(realGreeting));

		// Call the method via the proxy (method name will be logged)
		proxyGreeting.sayHello("John");
	}
}
