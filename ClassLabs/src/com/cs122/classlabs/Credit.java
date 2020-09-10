package com.cs122.classlabs;

public class Credit extends Account
{
	private double credit;
	public Credit(String inName, double inCredit)
	{
		super(inName,inCredit);
		credit = inCredit;
	}

	//x  Account method ballance
	//-Credit has method APR
	//-Deoposit has method interest
	//----Checkings has a method Fees
	//----Savings haas a method limit
	
	public void apr()
	{
		System.out.println("IMPLIMENT APR: 26.86");
	}
		
	public void ballance()
	{
		System.out.println(this.name+"'s credit Ballance: "+super.ballance);
	}
}
