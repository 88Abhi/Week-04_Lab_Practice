package com.dynamiconlinemarketplace;

// Defining a subclass for BookCategory, extending ProductCategory
class BookCategory extends ProductCategory {
	// Declaring a private variable for the genre of the book
	private String genre;

	// Constructor to initialize the book category
	public BookCategory(String categoryName, String genre) {
		super(categoryName);
		this.genre = genre;
	}

	// Implementing the method to return details of the book category
	@Override
	public String getCategoryDetails() {
		return "Category: " + categoryName + ", Genre: " + genre;
	}
}
