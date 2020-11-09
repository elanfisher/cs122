package com.cs122.assignments;

import java.util.Scanner;

public class PP_12_8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int go = 1;
		do
		{
			System.out.println("N: ");
			int n = sc.nextInt();
			String[][] triangleList = new String[n][n*2];
			triangleList = populatePascall(n, triangleList);
			printPascall(n, triangleList);
			
			System.out.println("Again?[1/2]: ");
			go = sc.nextInt();
			if(!(go == 1)) { go =0;}
			
		}while(go == 1);
		
	}
	
	private static String[][] populatePascall(int n, String[][] triList) 
	{
		for(int r = 0; r < n; r++) {
			for(int c = 0; c < r+1; c++) 
			{	
				triList[r][c] = (Integer.toString(pascal(r,c)) + " ");
			}
		}
		return triList;
	}
	
	private static void printPascall(int n, String[][] triList)
	{
		for(int r = 0; r < n; r++) 
		{
			for(int s = 1; s < n-r; s++) {
				System.out.print(" ");
			}
			for(int c = 0; c < r+1; c++) 
			{
				System.out.print(triList[r][c]);
			}
			System.out.println("");
		}
	}
	
	private static String[][] starList(int n, String[][] triList) 
	{
		for(int r = 0; r < n; r++) {
			for(int c = 0; c < n; c++) 
			{	
				triList[r][c] = "*";
			}
		}
		return triList;
	}

	public static int pascal(int r, int c) {
		//ALGORITHM BASED OFF THE STIFEL's RELATION (1500's)
		int result=0;
		
		if((c == 0) || (c == r)) {
			result = 1;
		}
		else {
			result = pascal(r-1, c-1) + pascal(r-1, c);
		}
		
		return result;
	}
}
