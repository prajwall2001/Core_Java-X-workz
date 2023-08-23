package com.java.sixlevel.app;

public class Company {
	public String companyName;

   public Company(String companyName) {
	   System.out.println("invoking non args const in Company");
        this.companyName = companyName;
    }

    public void display() {
        System.out.println("Company Name: " + companyName);
    }
}
