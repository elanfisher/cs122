package com.cs122.assignments;

public class Soccer extends Sport
{
	private int goals;
	
	public Soccer(String inName, int inWins, int inLosses, int inTies, int inGoals) 
	{
		super(inName, inWins, inLosses, inTies, 11);
		goals = inGoals;
	}

	public void printName() 
	{
		System.out.println("Socer team: "+super.name);
	}

	public void printPreformance() 
	{
		System.out.println( ((double) ( (super.wins) / (super.losses) ))+" = wins/losses");
	}
}
