package com.cs122.classlabs.chap12;

public class MyOwnTower {

	public static void main(String[] args) 
	{
		tower(4, 1, 3, 2);
	}
	
	public static void tower(int discs, int start, int end, int temp) {
		if(discs == 1) {
			moveDisk(start,end);
		}
		else {
			tower(discs-1, start, temp, end);
			moveDisk(start, end);
	        tower(discs-1, temp, end, start);
		}
	}
	
	private static void moveDisk(int start, int end)
    {
        System.out.println("Move one disk from " + start + " to " +
                end);
    }
}
