package com.cs122.assignments;

import java.util.Scanner;

public class EE_12_7 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int go = 1;
		do
		{
			System.out.println("Reverse String: ");
			String inString = sc.nextLine();
			
			reverse(inString);
			
			System.out.println("Again?[1/2]: ");
			
			try{
				go = sc.nextInt();
			}
			catch(Exception e){
				go = 2;
			}
			
			if(!(go == 1)) { go =0;}
			
		}while(go == 1);
	}
	
	public static void reverse(String word) {
		if ((word.length() == 0) || (word == null)) {
			System.out.println(word);
		}	          
        else
        { 
            System.out.print(word.charAt(word.length()-1)); 
            reverse(word.substring(0,word.length()-1)); 
        } 
	}
}
