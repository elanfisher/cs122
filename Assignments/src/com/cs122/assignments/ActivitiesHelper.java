package com.cs122.assignments;

public class ActivitiesHelper {

	public static void main(String[] args) {
		Activities running = new Activities("Running", 2, "Trail");

		running.printActivity();
		running.preferredActivity("Sailing");
		// you are missing the part where it prints odd or false
		System.out.println(running.getOddHours());
	}

}
