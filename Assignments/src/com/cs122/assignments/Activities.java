package com.cs122.assignments;

public class Activities 
{
	private String activityName;
	private int suggestedHours;
	private String locationType;
	
	public Activities(String inActivityName, int inSuggestedHours, String inLocationType)
	{
		activityName = inActivityName;
		suggestedHours = inSuggestedHours;
		locationType = inLocationType;
	}
	
	public void printActivity()
	{
		System.out.println("The "+ locationType + " activity " + "is suggested for "+ suggestedHours + " hours");
	}
	
	public void preferredActivity(String activityPreferred)
	{
		System.out.println("I prefer "+activityPreferred+" over "+activityName);
	}
	
	public boolean getOddHours()
	{
		if(suggestedHours % 2 == 1)//odd
		{
			return true;
		}
		else {return false;}
	}
}
