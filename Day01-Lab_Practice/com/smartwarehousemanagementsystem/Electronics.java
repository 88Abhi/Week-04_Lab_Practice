package com.smartwarehousemanagementsystem;

// Class representing Electronics, extending WarehouseItem
class Electronics extends WarehouseItem {
	// Constructor to initialize electronics item
	public Electronics(String itemName) {
		super(itemName);
	}

	// Overriding method to get item details
	@Override
	public String getItemDetails() {
		return "Electronics: " + itemName;
	}
	public String toString() {
		return itemName;
	}
}
