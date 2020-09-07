package com.cs122.assignments;

public abstract class Literature 
{
	protected int pageNumbers;
	protected String[] characters;
	
	public Literature(int inPageNumbers, String[] inCharacters)
	{
		this.pageNumbers = inPageNumbers;
		this.characters = inCharacters;
	}
	
	public abstract void printCharacters();
	public abstract void printPages();
	
	public void ripOutPages(int pagesToRip)
	{
		if(pagesToRip > 1 && pagesToRip < pageNumbers)
		{
			pageNumbers -= pagesToRip;
			System.out.println("Removed "+pagesToRip+" pages.");
		}
		else if(pagesToRip == 1 && pagesToRip < pageNumbers)
		{ 
			System.out.println("Removed only one page.");
		}
		else
		{
			System.out.println("Has to be a positive number of pages.");
		}
	}
}
