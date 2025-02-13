package com.personalizedmealplangenerator;

import java.util.ArrayList;
import java.util.List;

// Defining a generic class to manage different types of meal plans
class Meal<T extends MealPlan> {
	// Declaring a private variable to store the meal details
	private String category;
	private T mealDetails;
	List<T> list = new ArrayList<>();

	// Constructor to initialize the meal with category and details
	public Meal(String category, T mealDetails) {
		this.category = category;
		this.mealDetails = mealDetails;
	}

	// Getter method to get the meal
	public List<T> getMeal() {
		return list;
	}

	// Adding meal to the list
	public void addMeal(T obj) {
		list.add(obj);
	}

	// Method to return full meal plan information as a string
	public String getFullMealPlanInfo() {
		return "Category: " + category + ", " + mealDetails.getMealDetails();
	}
}
