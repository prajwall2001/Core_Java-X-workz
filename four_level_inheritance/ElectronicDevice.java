package com.xworkz.app.four_level_inheritance;

public class ElectronicDevice {
	
	public static String deviceUsed;
	
	public ElectronicDevice(String deviceUsed){
		System.out.println("Invoking String const in ELectronicDevice");
		this.deviceUsed=deviceUsed;
		
	}
	
	public void display()
	{
		System.out.println("Device used is "+this.deviceUsed);
	}
	

}
