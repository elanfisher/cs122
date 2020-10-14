package com.pace.elanpractice;

import java.awt.Color;
//import GridTools.MyGrid;

public class FlagMaker {

	public static void drawFlag(MyGrid grid, int countryCode) 
	{
		
		/* Remove this comment and implement this method 
		 * according to the project description.
		 */
        int width = grid.getWd();
        int height = grid.getHt();
		if (countryCode == 6)
		{
			if(height % 2 == 0)
			{
				System.out.println("even");
				for(int row = height-1; row > height/2; row = row - 1)
				{
					for(int col = 0; col < width; col = col + 1)
					{
						grid.setColor(row, col, Color.BLUE);
					}
				}
				//increment row then 4 cols, repeat
				for(int row = 0; row < height; row = row + 1)
				{
					for(int col = (row*4)+4; col < width; col = col + 1)
					{
						grid.setColor(row, col, Color.GREEN);
					}
				}
				
				int end = 0;
				
				for(int row = 0; row < height; row = row + 1)
				{
					if(row < height/2)
					{
						System.out.println("add: "+row);
						end = end + 4;
					}
					else if(row > height/2)
					{
						System.out.println("minus: "+row);
						end = end - 4;
					}
					
					for(int col = 0; col < end; col = col + 1)
					{
						grid.setColor(row, col, Color.RED);
					}
				}
			}
			else
			{
				System.out.println("odd");
				for(int row = height-1; row > height/2; row = row - 1)
				{
					for(int col = 0; col < width; col = col + 1)
					{
						grid.setColor(row, col, Color.BLUE);
					}
				}
				//increment row then 4 cols, repeat
				for(int row = 0; row < height; row = row + 1)
				{
					for(int col = (row*4)+4; col < width; col = col + 1)
					{
						grid.setColor(row, col, Color.GREEN);
					}
				}
				
				int end = 0;
				
				for(int row = 0; row < height; row = row + 1)
				{
					if(row < height/2)
					{
						end = end + 4;
					}
					else if(row == (height/2))
					{
						end = end + 2;
					}
					else if(row == (height/2)+1)
					{
						end = end - 2;
					}
					else if(row > (height/2)+1)
					{
						end = end - 4;
					}
					else {
						System.out.println("not in loop");
					}
					
					
					for(int col = 0; col < end; col = col + 1)
					{
						grid.setColor(row, col, Color.RED);
					}
				}
			}
			
		}
		if (countryCode == 7)
		{
			for(int row = 0; row < height; row = row + 1)
			{
				for(int col = 0; col < width; col = col + 1)
				{
					grid.setColor(row, col, Color.RED);
				}
			}
			
			for (int row = 0; row < height; row = row + 1) 
			{
                for (int col = (2 * row); col < (2*row)+2; col = col + 1) 
                {
                    grid.setColor(row, col, Color.ORANGE);
                }
            }
			
			System.out.println(width);
			System.out.println(height);
			for (int row = 0; row < height; row = row + 1) 
			{
                for (int col = width - (2 * row)-1; col >= width - (2*row)-2; col = col - 1)
                {
                    grid.setColor(row, col, Color.ORANGE);
                }
            }
		}
	}	
}