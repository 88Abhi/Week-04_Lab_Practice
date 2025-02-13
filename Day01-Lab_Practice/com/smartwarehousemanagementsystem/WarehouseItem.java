package com.smartwarehousemanagementsystem;

// Abstract class representing a generic warehouse item
abstract class WarehouseItem {
	// Declaring a protected variable for item name
	protected String itemName;

	// Constructor to initialize the item name
	public WarehouseItem(String itemName) {
		this.itemName = itemName;
	}

	// Abstract method to get item details
	public abstract String getItemDetails();
}

