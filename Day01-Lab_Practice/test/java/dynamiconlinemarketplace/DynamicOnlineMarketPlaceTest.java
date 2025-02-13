package dynamiconlinemarketplace;

import com.dynamiconlinemarketplace.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class DynamicOnlineMarketPlaceTest {
	// Testing the book category by various test cases
	@Test
	public void testOfBookCategory() {
		// Creating book categories
		BookCategory fictionCategory = new BookCategory("Books", "Fiction");
		BookCategory eBookCategory = new BookCategory("E-book", "Fiction");

		// Creating a product with the initial category
		Product<BookCategory> book = new Product<>("Java Complete Reference", 20.0, eBookCategory);

		// Adding categories to the product
		book.addProduct(fictionCategory);
		book.addProduct(eBookCategory);

		// Expected categories for the product
		List<String> categoriesList = List.of("Books", "E-book");

		// Checking if the product categories match the expected list
		Assertions.assertEquals(categoriesList, book.getProductList().stream().map(item -> item.categoryName).toList());
	}

	// Testing the clothing category by various test cases
	@Test
	public void testOfClothingCategory() {
		// Creating clothing categories
		ClothingCategory casualWear = new ClothingCategory("Casual WearClothing", "Casual Wear");
		ClothingCategory formalWear = new ClothingCategory("Formal WearClothing", "Formal Wear");

		// Creating a product with the initial category
		Product<ClothingCategory> tShirt = new Product<>("Shirt", 25.0, casualWear);

		// Adding categories to the product
		tShirt.addProduct(casualWear);
		tShirt.addProduct(formalWear);

		// Expected categories for the product
		List<String> clothingList = List.of("Casual WearClothing", "Formal WearClothing");

		// Checking if the product categories match the expected list
		Assertions.assertEquals(clothingList, tShirt.getProductList().stream().map(item -> item.categoryName).toList());
	}

	// Testing the gadget category by various test cases
	@Test
	public void testOfGadgetCategory() {
		// Creating gadget categories
		GadgetCategory smartDevices = new GadgetCategory("Mobile Gadgets", "Smart Devices");
		GadgetCategory laptops = new GadgetCategory("IPad Gadgets", "Mobile");

		// Creating a product with the initial category
		Product<GadgetCategory> smartwatch = new Product<>("Smartwatch", 1250.0, smartDevices);

		// Adding categories to the product
		smartwatch.addProduct(smartDevices);
		smartwatch.addProduct(laptops);

		// Expected categories for the product
		List<String> gadgetList = List.of("Mobile Gadgets", "IPad Gadgets");

		// Checking if the product categories match the expected list
		Assertions.assertEquals(gadgetList, smartwatch.getProductList().stream().map(item -> item.categoryName).toList());
	}
}
