package com.smartwarehousemanagementsystem;

// Class representing Furniture, extending WarehouseItem
class Furniture extends WarehouseItem {
	// Constructor to initialize furniture item
	public Furniture(String itemName) {
		super(itemName);
	}

	// Overriding method to get item details
	@Override
	public String getItemDetails() {
		return "Furniture: " + itemName;
	}
	public String toString() {
		return itemName;
	}
}

