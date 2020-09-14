package com.cs122.assignments;

public class Activities {
	private String activityName;
	private int suggestedHours;
	private String locationType;

	public Activities(String inActivityName, int inSuggestedHours, String inLocationType) {
		activityName = inActivityName;
		suggestedHours = inSuggestedHours;
		locationType = inLocationType;
	}

	public void printActivity() {
		System.out.println("The " + locationType + " activity " + "is suggested for " + suggestedHours + " hours");
	}

	public void preferredActivity(String activityPreferred) {
		System.out.println("I prefer " + activityPreferred + " over " + activityName);
	}

	public boolean getOddHours() {
		// good job on writing comments, try to write more comments, it makes much
		// better code and will
		// also help you understand later
		if (suggestedHours % 2 == 1)// odd
		{
			return true;
		} else {
			return false;
		}
	}
}
