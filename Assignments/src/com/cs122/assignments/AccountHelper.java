package com.cs122.assignments;

public class AccountHelper 
{
	/*
	--
	x Finally create a helperclass 
	x -and initialize a person, 
	x -person's saving 
	x -and(or) checkings account.
	x - Perform 2 transactions
	 */
	public static void main(String[] args) 
	{
		Savings sav1 = new Savings(1000.0);
		Checkings chec1 = new Checkings(2000.0);
		Credit cred1 = new Credit(5.0);
		
		Person elan = new Person("Elan", "Maryland",sav1, chec1, cred1);
		
		//withdraw 500 from savings, deposit 50 to checkings, withdraw 100000 from credit, print all
		
		sav1.withdraw(500);
		chec1.deposit(50);
		cred1.withdraw(100000);
		
		System.out.println("sav1: $"+sav1.getBalance());
		System.out.println("chec1: $"+chec1.getBalance());
		System.out.println("cred1: $"+cred1.getBalance());
	}

}
