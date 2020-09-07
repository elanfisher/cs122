package com.cs122.assignments;

import java.util.Arrays;

public class TechnicalJournal extends Literature
{
	public TechnicalJournal(int inPageNumbers, String[] inCharacters) 
	{
		super(inPageNumbers, inCharacters);
	}
	
	public void printCharacters() //alphabetically (first letter only) list the journal authors
	{
		//Algorithm written by yours truly [me] ;)
		String sortOut = super.characters[0]; //start out with the first
		String[] characterList = super.characters; // b, a, c
		
		if(super.characters.length > 1) //check if there are authors to compare
		{
			for(int i = 1; i < super.characters.length; i++)//for each author compare
			{
				for(int j = i+1; j < super.characters.length; j++)//for each author+1 compare
				{
					if(super.characters[i].charAt(0) > super.characters[j].charAt(0)) //compare the first letter of each
					{
						String temp = super.characters[i]; //b
						//System.out.println(super.characters[i]);
						characterList[i] = characterList[j]; //a , a , c
						characterList[j] = temp; //a, b, c
					}
				}
			}
			String authorsFinal = "Contributing Authors Sorted: "; //just to flex a bit, a little formatting
			for(String name : characterList)
			{
				if(name != super.characters[super.characters.length-1])
				{
					authorsFinal = authorsFinal+name+", ";
				}
				else
				{
					authorsFinal = authorsFinal+"and "+name+".";
				}
				
			}
			System.out.println(authorsFinal);
		}
		else if(super.characters.length == 1)
		{
			System.out.println("Just one author: "+super.characters[0]);
		}
		else
		{
			System.out.println("Authors dont exist for this paper.");
		}
		
		System.out.println();
	}

	public void printPages() //list the pages of the journal
	{
		System.out.println("There are "+super.pageNumbers+"'s in this book.");
	}
}
