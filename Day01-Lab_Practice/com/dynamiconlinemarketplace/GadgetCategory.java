package com.dynamiconlinemarketplace;

// Defining a subclass for GadgetCategory, extending ProductCategory
class GadgetCategory extends ProductCategory {
	// Declaring a private variable for the technology type
	private String technologyType;

	// Constructor to initialize the gadget category
	public GadgetCategory(String categoryName, String technologyType) {
		super(categoryName);
		this.technologyType = technologyType;
	}

	// Implementing the method to return details of the gadget category
	@Override
	public String getCategoryDetails() {
		return "Category: " + categoryName + ", Technology: " + technologyType;
	}
}
