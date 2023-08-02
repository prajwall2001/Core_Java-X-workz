package com.xworkz.app.three_level_Inheritance;

public class Manager extends Employee {
	
	 public static String department;

	    public Manager( String department,String name,String companyName) {
	    	 super(name,companyName);
	    	System.out.println("Invoking String,String,String const in Manager");
	       
	        this.department = department;
	    }

	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Department: " + department);
	    }

}
