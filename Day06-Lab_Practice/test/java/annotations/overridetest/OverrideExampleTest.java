package annotations.overridetest;

import com.annotations.override.Animal;
import com.annotations.override.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Class to test the override notation
public class OverrideExampleTest {
	// Method to test the makeSound and override notation
	@Test
	public void testDogMakeSound() {
		// Creating an instance of Dog and calling makeSound()
		Animal myDog = new Dog();

		// Expected output
		String expectedOutput = "Dog Barks!";

		// Comparing expected and actual output
		assertTrue(expectedOutput.equals(myDog.makeSound()), "Dog's makeSound() should print 'Dog Barks!'");
		System.out.println("Test Passed!");
	}
}
