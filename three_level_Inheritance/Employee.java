package com.xworkz.app.three_level_Inheritance;

public class Employee extends Fresher {
	
	public static String companyName;
	
	public Employee(String name,String companyName)
	{
		super(name);
		System.out.println("Invoking string,string constructor in Employee");
		this.companyName=companyName;
	}
	
	public void displayInfo() {
        System.out.println("Company name " + this.companyName);
        
    }

}
