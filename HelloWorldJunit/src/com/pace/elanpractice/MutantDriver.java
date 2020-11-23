package com.pace.elanpractice;

import java.util.Scanner;

public class MutantDriver {

	public static void main(String[] args) 
	{
		//instantiate class
		Mutant mutant1 = new Mutant();
		
		//ask user for name
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		
		//set name using setName
		mutant1.setName(sc.next());
		
		//print name using getName
		System.out.println(mutant1.getName());
	}
}
