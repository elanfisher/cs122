package com.cs122.classlabs;

public class Bank 
{
	private Account[] accountList;
	
	public Bank()
	{
		accountList = new Account[5];
		
		accountList[0] = new Deposit("Deposit1",10000);
		accountList[1] = new Credit("Credit1",100);
		accountList[2] = new Credit("Credit2",4000);
		accountList[3] = new Checkings("Checkings1",350);
		accountList[4] = new Savings("Savings1",63342);
		
		//TODO add 4 more banks, 2 credits, 1 deposit, 1 checkings, 1 savings
	}
	
	public void printBankAccounts()
	{
		for(int i = 0; i < accountList.length; i++)
		{
			accountList[i].ballance();
		}
	}
	
	public Account getAccount(int inNum)
	{
		return accountList[inNum];
	}
}
