package com.cs122.assignments;

import java.util.Random;

public class Novel extends Literature
{
	public Novel(int inPageNumbers, String[] inCharacters) 
	{
		super(inPageNumbers, inCharacters);
	}
	
	public void printCharacters()
	{
		Random r1 = new Random();
		System.out.println("There is only one good character: "+super.characters[r1.nextInt(super.characters.length)]);
	}

	public void printPages() 
	{
		System.out.println("There are "+super.pageNumbers+"'s in this Novel.");
	}
}
