package com.cs122.assignments;

public class Stacks 
{
	private class Node{
		int data;
		Node next;
		
		Node(int x){
			data = x;
			next = null;
		}
	}
	
	Node top;
	
	Stacks(){ //top of the stack
		top = null;
	}
	
	public int peek() {
		if(empty()) {
			return (Integer) null;
		}
		else {
			return top.data;
		}
	}
	
	public int pop() {
		if(empty()) { //nothing there
			return (Integer) null;
		}
		else {			
			Node temp = top.next;
			top.next = null; //remove the first node of the list
			top = temp; //set the second node to be the top
			return top.data;
		}
	}
	
	public void push(int x) {		
		/*if(empty()) {
			System.out.println("nothing to add onto");
		}
		else {
			//set incoming node to point at top node
			Node newNode = new Node(x);
			newNode.next = top;
			top = newNode;
			//set incoming node as top
		}	
		*/	
		Node newNode = new Node(x);
		newNode.next = top;
		top = newNode;
	}
	
	public boolean empty() {//true of top is empty
		if(top == null) {
			return true;
		}
		return false;
	}
	
	public void print() 
	{
		String result = "";

        Node current = top;

        while (current != null)
        {
            result += current.data + " -> ";
            current = current.next;
        }       

        System.out.println(result);
	}
}
