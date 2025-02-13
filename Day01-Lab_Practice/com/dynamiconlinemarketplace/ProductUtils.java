package com.dynamiconlinemarketplace;

// Defining a utility class to handle product related operations
class ProductUtils {
	// Implementing a generic method to apply a discount dynamically
	public static <T extends Product<? extends ProductCategory>> void applyDiscount(T product, double percentage) {
		// Calculating the new price after discount
		double discountedPrice = product.getPrice() - (product.getPrice() * (percentage / 100));

		product.setPrice(discountedPrice);
	}
}
