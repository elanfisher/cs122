package com.cs122.classlabs;

public class Deposit extends Account
{
	private double deposit;
	
	public Deposit(String inName, double inDeposit)
	{
		super(inName, inDeposit);
		deposit = inDeposit;
	}
	
	public void interest(double inR, double inT)
	{
		//A = P(1 + rt)
		/*
		 * A = Total Accrued Amount (principal + interest)
		P = Principal Amount
		I = Interest Amount
		r = Rate of Interest per year in decimal; r = R/100
		R = Rate of Interest per year as a percent; R = r * 100
		t = Time Period involved in months or years
		 */
		double interest = 0;
		double oneRT = (inR*inT);
		interest = deposit * (1 + oneRT);
		System.out.println("Interest: "+interest);
	}

	public void ballance() 
	{
		System.out.println(this.name+ "'s depoit Ballance: "+super.ballance);
		
	}
}
