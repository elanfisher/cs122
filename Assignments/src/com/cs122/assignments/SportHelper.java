package com.cs122.assignments;

public class SportHelper {

	public static void main(String[] args) 
	{
		Soccer s1 = new Soccer("fish",10,3,1,6);
		
		s1.printName();
		s1.printPreformance();
		
		Basketball b1 = new Basketball("birds",10,3,1,150);
		
		b1.printName();
		b1.printPlayers();
		b1.printPreformance();
	}

}
