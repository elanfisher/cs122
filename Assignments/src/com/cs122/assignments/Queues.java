package com.cs122.assignments;

public class Queues 
{
	private class Node{
		String data;
		Node link;
		
		Node(String x){
			data = x;
			link = null;
		}
	}
	
	Node top; //insert at the end of the list
	
	Queues(){
		top = null;
	}
	
	//add to the rear, remove from the front
	
	//7--->654321--->
	//rear      front

	//void enque(String item)
	
	//string deque(string)
	
	//boolean empty()
	
	//
	
	public void print() 
	{
		String result = "";

        Node current = top;

        while (current != null)
        {
            result += current.data + " -> ";
            current = current.link;
        }       

        System.out.println(result);
	}
}
