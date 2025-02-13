package com.personalizedmealplangenerator;

// Defining a class for High-Protein Meals implementing MealPlan
class HighProteinMeal implements MealPlan {
	// Declaring a private variable to store the protein type
	private String proteinType;

	// Constructor to initialize the high-protein meal
	public HighProteinMeal(String proteinType) {
		this.proteinType = proteinType;
	}

	// Implementing the method to return details
	@Override
	public String getMealDetails() {
		return "High-Protein Meal with " + proteinType;
	}
}