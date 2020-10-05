package com.pace.elanpractice;

public class WirelessDevice implements Electronics
{
	double bandwidth, weight, voltage, cost;
	String maker;
	
	public WirelessDevice(double inB, double inW, double inV, double inC, String inMake)
	{
		bandwidth = inB;
		weight = inW;
		voltage = inV;
		cost = inC;
		maker = inMake;
	}
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

	@Override
	public double getVoltage() {
		// TODO Auto-generated method stub
		return voltage;
	}

	@Override
	public String getMaker() {
		// TODO Auto-generated method stub
		return maker;
	}
	
}
