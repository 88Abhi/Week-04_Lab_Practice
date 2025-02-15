package com.queueinterfaceproblems.circularbuffersimulation;

// Class to implement a circular buffer using an array.
public class CircularBuffer {
	// Array to store buffer elements
	private int[] buffer;

	// Instance variables to store queue details
	private int capacity;
	private int front;
	private int rear;
	private int size;

	// Constructor to initialize the circular buffer with a fixed size.
	public CircularBuffer(int capacity) {
		this.capacity = capacity;
		this.buffer = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	// Inserts an element into the circular buffer.
	public void insert(int value) {
		// Shifting the rear
		rear = (rear + 1) % capacity;
		buffer[rear] = value;

		// increase the size
		if (size < capacity) {
			size++;
		}
		else {
			front = (front + 1) % capacity;
		}
	}


	// Retrieves all elements from the buffer in their current order.
	public int[] getBuffer() {
		int[] result = new int[size];
		int index = front;

		// Print the buffer
		for (int i = 0; i < size; i++) {
			result[i] = buffer[index];

			index = (index + 1) % capacity;
		}

		return result;
	}
}

