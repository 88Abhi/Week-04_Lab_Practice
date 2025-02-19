package reflection.accessprivatefieldtest;

import com.reflection.accessprivatefield.Person;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

// Class to test the access of private field
class PrivateFieldAccessTest {
	// Method to test the private field access
	@Test
	void testPrivateFieldModification() {
		try {
			// Creating a Person object with age 21
			Person person = new Person(25);

			// Accessing and modifying the private field "age"
			Field ageField = Person.class.getDeclaredField("age");
			ageField.setAccessible(true);
			ageField.set(person, 30);

			// Verifying the modified value
			assertEquals(30, ageField.get(person), "Age should be modified to 30");

		}
		catch (Exception e) {
			fail("Reflection failed to access or modify the private field");
		}
	}
}
