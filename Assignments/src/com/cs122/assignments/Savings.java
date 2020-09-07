package com.cs122.assignments;

public class Savings implements Account {
	
	private double ballance;
	
	public Savings(double inBallance)
	{
		ballance = inBallance;
	}
	
	public double getBalance()
	{
		return ballance;
	}
	
	public void withdraw(double inWithdraw)
	{
		if(inWithdraw <= ballance)//if its not subtract a negative number lol
		{
			ballance -= inWithdraw;
		}
		else 
		{ 
			System.out.println("You do not have enough, you only have, $"+ballance+"."); 
		}
	}
	
	public void deposit(double inDeposit)
	{
		if(inDeposit >= 0)//if you aren't depositing a negative number
		{
			ballance += inDeposit;
		}
	}
}
