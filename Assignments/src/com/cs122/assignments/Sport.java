package com.cs122.assignments;

public abstract class Sport 
{
	protected String name;
	protected int wins;
	protected int losses;
	protected int ties;
	protected int players;
	
	public Sport(String inName, int inWins, int inLosses, int inTies, int inPlayers)
	{
		name = inName;
		wins = inWins;
		losses = inLosses;
		ties = inTies;
		players = inPlayers;
	}
	
	public abstract void printName();
	public abstract void printPreformance();
	
	public void printWins() 
	{
		System.out.println("Wins: "+wins);
	}

	public void printLosses()
	{
		System.out.println("Losses: "+losses);
	}

	public void printTies()
	{
		System.out.println("Ties: "+ties);
	}

	public void printPlayers() 
	{
		System.out.println("Players: "+players);
	}
}
