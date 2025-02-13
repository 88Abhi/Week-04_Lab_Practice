package com.smartwarehousemanagementsystem;

// Class representing Groceries, extending WarehouseItem
class Groceries extends WarehouseItem {
	// Constructor to initialize grocery item
	public Groceries(String itemName) {
		super(itemName);
	}

	// Overriding method to get item details
	@Override
	public String getItemDetails() {
		return "Groceries: " + itemName;
	}

	public String toString() {
		return itemName;
	}
}
