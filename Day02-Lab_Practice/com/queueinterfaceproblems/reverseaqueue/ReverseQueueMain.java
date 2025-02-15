package com.queueinterfaceproblems.reverseaqueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Class to print reversed queue
public class ReverseQueueMain {
	public static void main(String[] args) {
		// Create a queue and add elements
		Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		// Print original queue
		System.out.println("Original Queue: " + queue);

		// Reverse the queue
		Queue<Integer> reversedQueue = ReverseQueue.reverse(queue);

		// Print the reversed queue
		System.out.println("Reversed Queue: " + reversedQueue);
	}
}
