package com.cs122.classlabs;

abstract public class Account
{
	//5 accounts
	//teller which shows ballance
	
	//private Bank[] accountList;
	protected String name;
	protected double ballance;
	
	public Account(String inName, double inBallance)
	{
		name = inName;
		ballance = inBallance;
	}
	
	public abstract void ballance();
}
