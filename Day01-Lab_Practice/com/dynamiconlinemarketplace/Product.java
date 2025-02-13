package com.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

// Defining a generic class to represent a product in the marketplace
class Product<T extends ProductCategory> {
	// Declaring a private variable for product name and price
	private String productName;
	private double price;

	// Declaring a private variable for category
	private T category;

	List<T> products = new ArrayList<>();

	// Constructor to initialize the product with name, price, and category
	public Product(String productName, double price, T category) {
		this.productName = productName;
		this.price = price;
		this.category = category;
	}

	// Method to get the product price
	public double getPrice() {
		return price;
	}

	public void addProduct(T product) {
		products.add(product);
	}

	public List<T> getProductList(){
		return products;
	}

	// Method to set the new price of the product
	public void setPrice(double price) {
		this.price = price;
	}

	// Method to return product details as a string
	public String getProductDetails() {
		return "Product: " + productName + ", Price: " + price + ", " + category.getCategoryDetails();
	}
}