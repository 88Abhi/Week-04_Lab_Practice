package com.dynamiconlinemarketplace;

// Defining a subclass for ClothingCategory, extending ProductCategory
class ClothingCategory extends ProductCategory {
	// Declaring a private variable for clothing type
	private String clothingType;

	// Constructor to initialize the clothing category with name and type
	public ClothingCategory(String categoryName, String clothingType) {
		super(categoryName);
		this.clothingType = clothingType;
	}

	// Implementing the method to return details of the clothing category
	@Override
	public String getCategoryDetails() {
		return "Category: " + categoryName + ", Type: " + clothingType;
	}
}
