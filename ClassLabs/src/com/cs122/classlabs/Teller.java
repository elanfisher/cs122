package com.cs122.classlabs;

public class Teller {

	public static void main(String[] args) 
	{
		Bank bank1 = new Bank();
		
		bank1.printBankAccounts();
		
		((Deposit) bank1.getAccount(0)).interest(.10,20);
		((Credit) bank1.getAccount(2)).apr();
		((Checkings) bank1.getAccount(3)).fees();
		((Savings) bank1.getAccount(4)).limit();
	}
}
