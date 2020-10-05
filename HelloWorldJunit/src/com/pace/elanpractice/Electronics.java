package com.pace.elanpractice;

public interface Electronics 
{
	/*
	 * PP 9.7 Design and implement a set of classes that define various types of electronics equipment (computers, cell phones, 
	 * pagers, digital cameras, etc.). Include data values that describe various attributes of the electronics, such as the weight, 
	 * cost, power usage, and the names of the manufacturers. Include methods that are named appropriately for each class and that
	 *  print an appropriate message. Create a main driver class to instantiate and exercise several of the classes.
	 */
	
	public double getWeight();
	public double getCost();
	public double getVoltage();
	public String getMaker();
	public String toString();
}
