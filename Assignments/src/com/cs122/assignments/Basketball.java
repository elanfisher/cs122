package com.cs122.assignments;

public class Basketball extends Sport
{
	private int hoops;
	
	public Basketball(String inName, int inWins, int inLosses, int inTies, int inHoops) 
	{
		super(inName, inWins, inLosses, inTies, 5);
		hoops = inHoops;
	}

	public void printName() 
	{
		System.out.println("Basketball team: "+super.name);
	}

	public void printPreformance() 
	{
		System.out.println( ((double) ( (hoops) / (super.wins) )) +" = hoops/wins");
	}
}
