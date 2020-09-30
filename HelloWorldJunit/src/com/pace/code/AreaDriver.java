package com.pace.code;

public class AreaDriver 
{
	public static void main(String[] args) 
	{
		Area a1 = new Area();
		Area a2 = new Area1();
		
		//late binding / compile
		System.out.println(a1.calcArea(5));
		System.out.println(a2.calcArea(5));
		
		//early / runtime
		System.out.println(a1.calcArea(5));
		System.out.println(a1.calcArea(2,8));
	}
}
