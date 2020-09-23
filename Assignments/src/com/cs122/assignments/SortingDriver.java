package com.cs122.assignments;

public class SortingDriver {

	public static void main(String[] args) 
	{
		Contact[] friends = new Contact[8]; 

		friends[0] = new Contact("John", "Smith", "610-555-7384");
		friends[1] = new Contact("Sarah", "Barnes", "215-555-3827");
		friends[2] = new Contact("Mark", "Riley", "733-555-2969");
		friends[3] = new Contact("Laura", "Getz", "663-555-3984");
		friends[4] = new Contact("Larry", "Smith", "464-555-3489");
		friends[5] = new Contact("Frank", "Phelps", "322-555-2284");
		friends[6] = new Contact("Mario", "Guzman", "804-555-9066");
		friends[7] = new Contact("Marsha", "Grant", "243-555-2837"); 
		
		Sorting<Contact> sorts = new Sorting<Contact>();
		
		Contact[] copy = new Contact[8];
		copy[0] = new Contact("John", "Smith", "610-555-7384");
		copy[1] = new Contact("Sarah", "Barnes", "215-555-3827");
		copy[2] = new Contact("Mark", "Riley", "733-555-2969");
		copy[3] = new Contact("Laura", "Getz", "663-555-3984");
		copy[4] = new Contact("Larry", "Smith", "464-555-3489");
		copy[5] = new Contact("Frank", "Phelps", "322-555-2284");
		copy[6] = new Contact("Mario", "Guzman", "804-555-9066");
		copy[7] = new Contact("Marsha", "Grant", "243-555-2837");		
		for (Contact other : copy)
		{	
			System.out.println(other); 
		}
		
		System.out.println("--------selection---------"); 
		
		sorts.selectionSort(friends);		
		for (Contact friend : friends)
		{	
			System.out.println(friend); 
		}
		
		System.out.println("--------insertion---------"); 
		
		sorts.insertionSort(copy);
		for (Contact other : copy)
		{	
			System.out.println(other); 
		}
		
		/* Ascending Sort
		 * Barnes, Sarah	215-555-3827
			Getz, Laura	663-555-3984
			Grant, Marsha	243-555-2837
			Guzman, Mario	804-555-9066
			Phelps, Frank	322-555-2284
			Riley, Mark	733-555-2969
			Smith, John	610-555-7384
			Smith, Larry	464-555-3489
		 */
	}
}

