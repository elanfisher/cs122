package com.cs122.assignments;

import java.util.Scanner;

public class RecBinarySearch {
    public static void main(String[] args)
    {
    	//Search the first half or search the second half could be a recursive call to the method itself.     	
    	//Implement the recursive version in this project.
    	
        int[] list = { 1, 2, 3, 6, 8, 10 };
        
    	//highIndex - the maximum index of the part of the list being searched
        int highIndex = list.length - 1;
        
  		//lowIndex - the minimum index of the part of the list being searched
        int lowIndex = 0;
          		
        
        //Implement Scanner
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	System.out.println("Target: ");
            int target = sc.nextInt();
            int searchedNum = target;
            try{
            	searchedNum = recBinarySearch(list, lowIndex, highIndex, target);
            }
            catch(Exception e) {
            	System.err.println(e+" with target: "+target);
            }
            
            if(searchedNum == -1) {
            	System.err.println("Did not find: " + target);
            }
            else {
            	System.out.println("Found: "+ list[searchedNum]);
            }
        }        
    }
    
    public static int recBinarySearch(int[] list, int lowIndex, int highIndex, int target)
    {
		//look in the middle
		int middleIndex = (highIndex + lowIndex) / 2;
		
		//if the list is exhausted
		if(lowIndex > highIndex) {
			return -1;
		}
		
		//if the list element at the middleIndex is the target		
		if(list[middleIndex] == target) {
			return middleIndex;
		}		
		else if(target < list[middleIndex]){
			//---binary search the second half of the list
			return recBinarySearch(list, lowIndex, middleIndex - 1, target);
		}
		else {
			//else if the list element in the middle is greater than the target
			return recBinarySearch(list, middleIndex + 1, highIndex, target);
		}
    }
}
