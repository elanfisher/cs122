package com.cs122.assignments;

public class QueueDriver {

	public static void main(String[] args) 
	{
		Queues q1 = new Queues();
		
		q1.enque("a");
		q1.print();
		
		q1.enque("b");
		q1.print();
		
		q1.enque("c");
		q1.print();
		
		q1.enque("d");
		q1.print();
		
		q1.enque("e");
		q1.print();
		
		q1.deque();
		q1.print();
		
		System.out.println("Peek most recent: "+q1.peek());
	}

}
