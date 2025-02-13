package com.smartwarehousemanagementsystem;

// Importing necessary classes
import java.util.ArrayList;
import java.util.List;

// Generic class to store items of type WarehouseItem or its subclasses
class Storage<T extends WarehouseItem> {
	// Declaring an ArrayList to store warehouse items
	private List<T> items;

	// Constructor to initialize the storage list
	public Storage() {
		items = new ArrayList<>();
	}

	// Method to add an item to the storage
	public void addItem(T item) {
		items.add(item);
	}

	// Method to retrieve all stored items
	public List<T> getItems() {
		return items;
	}

	// Static method to display all stored items
	public static void displayItems(List<? extends WarehouseItem> itemList) {
		for (WarehouseItem item : itemList) {
			System.out.println(item.getItemDetails());
		}
	}
}

