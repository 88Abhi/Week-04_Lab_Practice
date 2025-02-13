package com.aidrivenresumescreeningsystem;

// Defining a class for the Product Manager role extending JobRole
public class ProductManager extends JobRole {
	// Constructor to initialize the Product Manager role
	public ProductManager() {
		super("Product Manager");
	}

	// Implementing the method to specify required skills
	@Override
	public String requiredSkills() {
		return "Skills: Market Research, Agile, Business Strategy, Leadership";
	}
}
