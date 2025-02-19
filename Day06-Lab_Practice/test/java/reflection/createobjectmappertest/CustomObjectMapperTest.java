package reflection.createobjectmappertest;

import com.reflection.createcustomobjectmapper.CustomObjectMapper;
import com.reflection.createcustomobjectmapper.Person;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// Class to test the object mapper
class CustomObjectMapperTest {
	// Method to test the object mapper
	@Test
	void testToObject() {
		// Prepare the map with field data
		Map<String, Object> personData = new HashMap<>();
		personData.put("name", "Abhishek");
		personData.put("age", 25);

		// Using the CustomObjectMapper to create and populate a Person object
		Person person = CustomObjectMapper.toObject(Person.class, personData);

		// Verify the populated object's field values
		assertNotNull(person, "The Person object should not be null.");
		assertEquals("Abhishek", person.getName(), "The name should be 'Ankit'.");
		assertEquals(25, person.getAge(), "The age should be 25.");
	}
}

