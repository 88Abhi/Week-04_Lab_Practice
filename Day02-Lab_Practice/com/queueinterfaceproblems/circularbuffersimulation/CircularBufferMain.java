package com.queueinterfaceproblems.circularbuffersimulation;

// Class to test the CircularBuffer implementation.
public class CircularBufferMain {
	public static void main(String[] args) {
		// Create a circular buffer object
		CircularBuffer circularBuffer = new CircularBuffer(3);

		// Adding elements to it
		circularBuffer.insert(1);
		circularBuffer.insert(2);
		circularBuffer.insert(3);
		circularBuffer.insert(4);

		int[] bufferState = circularBuffer.getBuffer();

		// Printing the buffer
		for (int num : bufferState) {
			System.out.print(num + " ");
		}
	}
}
