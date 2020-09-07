package com.cs122.assignments;

import java.util.Arrays;

public class LiteratureHelper {

	public static void main(String[] args) 
	{
		String[] b1Names = {"jimmy","james","geoffery"};
		
		Book b1 = new Book(100, b1Names);
		b1.printCharacters();
		b1.ripOutPages(10);
		b1.printPages();
		
		String[] n1Names = {"geena","gabby","jensen"};
		
		Novel n1 = new Novel(571, n1Names);
		n1.printCharacters();
		n1.ripOutPages(401);
		n1.printPages();
		
		String[] t1Names = {"abby","charles", "barney", "bobby", "jackie", "zinfandel", "leigh", "fredrick"};
		
		TechnicalJournal t1 = new TechnicalJournal(12, t1Names);
		t1.printCharacters();
	}

}
