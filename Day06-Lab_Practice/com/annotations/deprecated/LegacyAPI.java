package com.annotations.deprecated;

// Defining the class LegacyAPI
public class LegacyAPI {
	// Marking an old method as @Deprecated
	@Deprecated
	public String oldFeature() {
		return "This is an old feature. Do not use it.";
	}

	// Defining a new method to replace the deprecated method
	public String newFeature() {
		return "This is the new recommended feature.";
	}
}

