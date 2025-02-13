package com.dynamiconlinemarketplace;

// Defining an abstract class to represent a product category
abstract class ProductCategory {
	// Declaring a protected variable to store the category name
	protected String categoryName;

	// Constructor to initialize the category name
	public ProductCategory(String categoryName) {
		this.categoryName = categoryName;
	}

	// Abstract method to get the category details
	public abstract String getCategoryDetails();
}