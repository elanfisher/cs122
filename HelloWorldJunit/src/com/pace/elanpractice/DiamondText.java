package com.pace.elanpractice;

import java.util.Scanner;

public class DiamondText {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Raidus: ");
		int raid = sc.nextInt();
		
		//int raid = 2;
		int mid = raid;
		int end = (2*raid);
		/*
		int[] c = new int[10]; //columns
		int[] r= new int[10]; //rows
		*/
		
		//player is 2 from right edge c[10-2]: count only 2 spaces
		//spaces from edge = col - 6 -> (-) good (were >6 so run)
		int x = raid;
		int y = mid;
		
		for(int r = 0; r < end+1; r++) {
			
			for(int c = 0; c < end+1; c++) {
				if(c >= x && c <= y)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			if(r < mid) {
				x--;
				y++;
			}
			else {
				x++;
				y--;
			}
			System.out.println();			
		}
			
	}
}
