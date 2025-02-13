package smartwarehousemanagementsystem;

import com.smartwarehousemanagementsystem.*;
import org.junit.jupiter.api.Assertions;
import java.util.List;
import org.junit.jupiter.api.Test;

class SmartWarehouseTest {
	// Testing the electronics storage function
	@Test
	public void testElectronicsStorageList() {
		//TestCase 1 : Creating expected list of items for electronicsList
		List<String> electronicsList = List.of("Laptop", "Smartphone");

		// Creating Generics and then Test Generics works as expected or not
		Storage<Electronics> electronicsStorage = new Storage<>();

		// Creating and adding electronic items to the electronics storage
		electronicsStorage.addItem(new Electronics("Laptop"));
		electronicsStorage.addItem(new Electronics("Smartphone"));

		Assertions.assertEquals(electronicsList, electronicsStorage.getItems().stream().map(item -> item.itemName).toList());
	}

	// Testing the groceries storage function
	@Test
	public void testGroceriesStorageList() {
		//TestCase 2 : Creating expected list of items for groceries
		List<String> groceryList = List.of("Rice", "Wheat");
		Storage<Groceries> groceriesStorage = new Storage<>();

		// Creating and adding grocery items to the groceries storage
		groceriesStorage.addItem(new Groceries("Rice"));
		groceriesStorage.addItem(new Groceries("Wheat"));
		Assertions.assertEquals(groceryList, groceriesStorage.getItems().stream().map(item -> item.itemName).toList());
	}

	// Testing the furniture storage function
	@Test
	public void testFurnitureStorageList() {
		//TestCase 3 : Creating expected list of items for furniture
		List<String> furnitureList = List.of("Chair", "Table");

		// Creating Generics and then Test Generics works as expected or not
		Storage<Furniture> furnitureStorage = new Storage<>();

		// Creating and adding furniture items to the furniture storage
		furnitureStorage.addItem(new Furniture("Chair"));
		furnitureStorage.addItem(new Furniture("Table"));

		Assertions.assertEquals(furnitureList, furnitureStorage.getItems().stream().map(item -> item.itemName).toList());
	}
}
