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
	
	Node top;
	Node rear;
	int count;
	Queues(){
		top = null;
		rear = null;
		count = 0;
	}
	
	//add to the rear, remove from the front
	
	//7--->654321--->
	//rear      front

	//void enque(String item) //add an item to the rear of the queue
	public void enque(String item) {
		Node newNode = new Node(item);
		if(empty()) {
			System.out.println("empty, adding: "+item);
			top = newNode;
			rear = newNode;
			count = 1;
			/*
			Node temp = rear;
			top.link = newNode;
			newNode.link = temp;
			*/
		}
		else if(count == 1) {
			System.out.println("one, adding: "+item);
			top.link = newNode;
			rear = newNode;
			count++;
		}
		else {
			System.out.println("adding rest: "+item);
			count++;
			//set top link to incoming node
			rear.link = newNode;
			//set rear to new rear
			rear = newNode;
		}
	}
	
	//string deque(string) //remove an item from the front of the queue
	public void deque() {
		if(empty()) {
			System.out.println("empty, deque null");
		}
		else {
			System.out.println("removing "+ top.data);
			Node temp = top.link;
			top.link = null;
			top = temp;
		}
	}
	
	//boolean empty() //returns true if the queue is empty
	public boolean empty() {
		if(top == null) {
			return true;
		}
		return false;
	}
	
	public String peek() {
		if(empty()) {
			return null;
		}
		else {
			return rear.data;
		}
	}
	
	public void print() 
	{
		String result = "";

        Node current = top;

        while (current != null)
        {
            result += current.data + " -> ";
            current = current.link;
        }

        System.out.println("top -> "+result + "end");
	}
}
