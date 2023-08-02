package com.xworkz.app.three_level_Inheritance;

public class SeniorManager extends Manager {
	  public int teamSize;

	    public SeniorManager(String name, String companyName, String department, int teamSize) {
	        super(name, companyName, department);
	        System.out.println("Invoking String,String,String,int const in SeniorManager ");
	        this.teamSize = teamSize;
	    }

	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Team Size: " + teamSize);
	    }
	

}
