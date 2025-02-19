package reflection.getclassinformationtest;

import com.reflection.getclassinformation.ObjectMapper;
import com.reflection.getclassinformation.User;
import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

// Class to test the object mapper
class ObjectMapperTest {
	// Method to test the object mapping
	@Test
	void testToObjectMapping() {
		// Provide key and value map with user properties
		Map<String, Object> properties = Map.of("name", "Abhishek Jat", "age", 21);

		// converting to a User object
		User user = ObjectMapper.toObject(User.class, properties);

		//verifying the mapped values
		assertNotNull(user, "User object should not be null");

		// Using Reflection to check private field values
		try {
			// Accessing private fields
			var nameField = User.class.getDeclaredField("name");
			var ageField = User.class.getDeclaredField("age");
			nameField.setAccessible(true);
			ageField.setAccessible(true);

			// Asserting field values and test weather output matched with expected
			assertEquals("Abhishek Jat", nameField.get(user), "Name should be correctly mapped");
			assertEquals(21, ageField.get(user), "Age should be correctly mapped");

		}
		catch (Exception e) {
			fail("Reflection failed to access private fields");
		}
	}
}
