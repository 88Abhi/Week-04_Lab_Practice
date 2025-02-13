package com.personalizedmealplangenerator;

// Defining a class for Vegetarian Meals implementing MealPlan
class VegetarianMeal implements MealPlan {
	// Declaring a private variable to store the main ingredient
	private String mainIngredient;

	// Constructor to initialize the vegetarian meal
	public VegetarianMeal(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}

	// Implementing the method to return details
	@Override
	public String getMealDetails() {
		return "Vegetarian Meal with " + mainIngredient;
	}
}