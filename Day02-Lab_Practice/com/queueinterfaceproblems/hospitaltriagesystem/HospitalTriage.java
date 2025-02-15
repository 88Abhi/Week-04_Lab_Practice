package com.queueinterfaceproblems.hospitaltriagesystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

// Class to simulate a hospital triage system using a priority queue.
public class HospitalTriage {
	// Processes patients based on their severity level
	public static List<String> processPatients(List<Patient> patients) {
		PriorityQueue<Patient> queue = new PriorityQueue<>(Collections.reverseOrder());

		// Add all patients to the priority queue
		queue.addAll(patients);

		// Create a list to store the order of treated patients
		List<String> treatmentOrder = new ArrayList<>();

		// Process patients based on severity
		while (!queue.isEmpty()) {
			treatmentOrder.add(queue.poll().name);
		}

		// Return the order of treated patients
		return treatmentOrder;
	}
}
