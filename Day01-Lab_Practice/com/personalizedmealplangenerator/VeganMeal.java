package com.personalizedmealplangenerator;

// Defining a class for Vegan Meals implementing MealPlan
class VeganMeal implements MealPlan {
	// Declaring a private variable to store protein source
	private String proteinSource;

	// Constructor to initialize the vegan meal
	public VeganMeal(String proteinSource) {
		this.proteinSource = proteinSource;
	}

	// Implementing the method to return details
	@Override
	public String getMealDetails() {
		return "Vegan Meal with Protein Source: " + proteinSource;
	}
}
