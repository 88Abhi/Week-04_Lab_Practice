package com.queueinterfaceproblems.implementstackusingqueues;

// Class to demonstrate the stack implementation using queues
public class StackUsingQueuesMain {
	public static void main(String[] args) {
		// Creating a stack object
		StackUsingQueues stack = new StackUsingQueues();

		// Adding elements to stack
		stack.push(1);
		stack.push(2);
		stack.push(3);

		// pop element and return top of the stack
		System.out.println("Popped element of the stack: " + stack.pop());
		System.out.println("Top of the stack: " + stack.top());
	}
}
