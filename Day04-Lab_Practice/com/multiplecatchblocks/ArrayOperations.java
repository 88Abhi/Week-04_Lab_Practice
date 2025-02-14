package com.multiplecatchblocks;

// Class to perform array operations
class ArrayOperations {
	// Method to retrieve and print the value at a given index
	public static void retrieveElement(int[] array, int index) {
		try {
			// Checking if the array is null before accessing elements
			if (array == null) {
				// Throwing a NullPointerException if the array is not initialized
				throw new NullPointerException("Array is not initialized!");
			}

			// Retrieving the value at the given index
			int value = array[index];

			// Printing the retrieved value
			System.out.println("Value at index " + index + ": " + value);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// Handling exception when index is out of bounds
			System.out.println("Invalid index!");
		}
		catch (NullPointerException e) {
			// Handling exception when array is null
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// Initializing an integer array with values
		int[] numbers = {10, 20, 30, 40, 50};

		// Calling retrieveElement with a valid index
		ArrayOperations.retrieveElement(numbers, 2);

		// Calling retrieveElement with an out-of-bounds index
		ArrayOperations.retrieveElement(numbers, 10);

		// Calling retrieveElement with a null array
		ArrayOperations.retrieveElement(null, 0);
	}
}
