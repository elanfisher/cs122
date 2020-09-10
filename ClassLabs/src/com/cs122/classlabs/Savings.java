package com.cs122.classlabs;

public class Savings extends Account
{
	private double savings;
	public Savings(String inName, double inSavings)
	{
		super(inName,inSavings);
		savings = inSavings;
	}
	
	public void limit()
	{
		System.out.println("IMPLIMENT LIMIT: 100");
	}
		
	public void ballance()
	{
		System.out.println(this.name+"'s saving Ballance: "+super.ballance);
	}
}
