package com.cs122.assignments;

public class StacksDriver {

	public static void main(String[] args) 
	{
		Stacks s1 = new Stacks();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		
		s1.print();
		
		s1.pop();
		
		s1.print();
		
		System.out.println(s1.peek());
	}
}