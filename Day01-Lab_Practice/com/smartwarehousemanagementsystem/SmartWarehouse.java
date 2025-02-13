package com.smartwarehousemanagementsystem;

// SmartWarehouse class to execute and test the warehouse system
public class SmartWarehouse {
	public static void main(String[] args) {
		// Creating storage instances for different types of items
		Storage<Electronics> electronicsStorage = new Storage<>();
		Storage<Groceries> groceriesStorage = new Storage<>();
		Storage<Furniture> furnitureStorage = new Storage<>();

		// Adding items to their respective storage
		electronicsStorage.addItem(new Electronics("Laptop"));
		electronicsStorage.addItem(new Electronics("Smartphone"));

		groceriesStorage.addItem(new Groceries("Apple"));
		groceriesStorage.addItem(new Groceries("Milk"));

		furnitureStorage.addItem(new Furniture("Table"));
		furnitureStorage.addItem(new Furniture("Chair"));

		// Displaying stored items using wildcard method
		System.out.println("Electronics Storage:");
		Storage.displayItems(electronicsStorage.getItems());

		System.out.println("\nGroceries Storage:");
		Storage.displayItems(groceriesStorage.getItems());

		System.out.println("\nFurniture Storage:");
		Storage.displayItems(furnitureStorage.getItems());

	}
}