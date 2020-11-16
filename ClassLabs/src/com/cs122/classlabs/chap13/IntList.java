package com.cs122.classlabs.chap13;

public class IntList {
	
	private IntNode list;
	
	public IntList() {
		list = null;
	}
	
	public void add(int x) 
	{
		IntNode node = new IntNode(x);
		IntNode current;
		
		if(list == null) { //if its not just a head node
			list = node;
		}
		else {            
			current = list; //set the temp
			while(current.next != null){ //if the next one is a real node
				current = current.next; //set the real node to the current one
			}
			current.next = node; //set it to the current one
		}
	}
	
	public void print() 
	{
		String result = "";

        IntNode current = list;

        while (current != null)
        {
            result += current.data + " -> ";
            current = current.next;
        }
        

        System.out.println(result + "end");
	}
	
	private class IntNode{
		public int data;
		public IntNode next;
		
		public IntNode(int inD) {
			data = inD;
			next = null;
		}
	}
	
}
