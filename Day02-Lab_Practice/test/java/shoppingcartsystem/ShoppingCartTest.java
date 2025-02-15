package shoppingcartsystem;

import com.shoppingcartsystem.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {
	// Declaring a ShoppingCart instance
	private ShoppingCart cart;

	@BeforeEach
	void setUp() {
		// Initializing the ShoppingCart before each test case execution
		cart = new ShoppingCart();
	}

	@Test
	void testAddProductAndOrder() {
		cart.addProduct("Kiwi", 180);
		cart.addProduct("Banana", 45);
		cart.addProduct("Orange", 40);
		List<String> expectedOrder = Arrays.asList("Kiwi", "Banana", "Orange");

		// Asserting that the actual order of products matches the expected order
		assertEquals(expectedOrder, cart.getProductsInOrder());
	}

	@Test
	void testProductsSortedByPrice() {
		cart.addProduct("Kiwi", 180);
		cart.addProduct("Banana", 45);
		cart.addProduct("Orange", 40);
		cart.addProduct("Apple", 250);
		cart.addProduct("Mango", 30);

		Map<String, Integer> expectedSorted = new LinkedHashMap<>();
		expectedSorted.put("Mango", 30);
		expectedSorted.put("Orange", 40);
		expectedSorted.put("Banana", 45);
		expectedSorted.put("Kiwi", 180);
		expectedSorted.put("Apple", 250);

		// Asserting that the sorted products by price match the expected sorted order
		assertEquals(expectedSorted, cart.getProductsSortedByPrice());
	}

	@Test
	void testTotalPrice() {
		cart.addProduct("Kiwi", 180);
		cart.addProduct("Banana", 45);
		cart.addProduct("Orange", 40);
		cart.addProduct("Apple", 250);
		cart.addProduct("Mango", 30);

		// Asserting that the total price of all added products matches the expected value (545)
		assertEquals(545, cart.getTotalPrice());
	}
}
