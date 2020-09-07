package com.cs122.assignments;

public class Book extends Literature 
{
	
	public Book(int inPageNumbers, String[] inCharacters) 
	{
		super(inPageNumbers, inCharacters);
	}
	
	public void printCharacters()
	{
		for(int i = 0; i < super.characters.length; i++)
		{
			System.out.print(super.characters[i]+" ");
		}
		System.out.println();
	}

	public void printPages() 
	{
		System.out.println("There are "+super.pageNumbers+"'s in this book.");
	}
}
