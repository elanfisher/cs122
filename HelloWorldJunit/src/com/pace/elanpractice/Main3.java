package com.pace.elanpractice;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account();
		
		boolean quit = false;
		while(quit == false) {
			System.out.println("d)eposit \nw)ithdraw \nb)alance \nq)uit");
			String userChoice = sc.next();
			if(userChoice.equals("d")) {
				
				System.out.println("Deposit: ");
				double amm = sc.nextDouble();
				a1.deposit(amm);
			}
			else if(userChoice.equals("w")) {
				System.out.println("Withdraw: ");
				double amm = sc.nextDouble();
				a1.withdraw(amm);
			}
			else if(userChoice.equals("b")){
				System.out.println("Current ballance $"+ a1.getBalance()+"0");
			}
			else if(userChoice.equals("q")) {
				quit = true;
			}
			else {
				System.out.println("Not a valid choice.");
			}
		}
	}

}
