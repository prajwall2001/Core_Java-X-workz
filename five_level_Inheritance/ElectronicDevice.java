package com.xworkz.app.five_level_Inheritance;

public class ElectronicDevice extends Device {

	
	public static String deviceUsed;
	
	public ElectronicDevice(String brand, String model,String deviceUsed){
		super(brand, model);
		System.out.println("Invoking String const in ELectronicDevice");
		this.deviceUsed=deviceUsed;
		
	}
	
	public void display()
	{
		super.displayInfo();
		System.out.println("Device used is "+this.deviceUsed);
	}
	


}
