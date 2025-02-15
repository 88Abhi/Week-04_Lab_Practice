package com.queueinterfaceproblems.reverseaqueue;

import java.util.Queue;
import java.util.Stack;

// Class to reverse the elements of a queue using only queue operations.
public class ReverseQueue {
	// Reverses the given queue.
	public static Queue<Integer> reverse(Queue<Integer> queue) {
		// Create a stack to store elements temporarily
		Stack<Integer> stack = new Stack<>();

		// Remove elements from the queue and push them onto the stack
		while (!queue.isEmpty()) {
			stack.push(queue.remove());
		}

		// Pop elements from the stack and add them back to the queue
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}

		// Return the reversed queue
		return queue;
	}
}