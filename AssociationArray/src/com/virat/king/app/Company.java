package com.virat.king.app;

public class Company {
	public String compName;
	public String ceo;
	public String originCountry;

	public Company(String compName, String ceo, String originCountry) {
		this.compName = compName;
		this.ceo = ceo;
		this.originCountry = originCountry;
	}

	public void printInfo() {
		System.out.println("Company Name: " + this.compName);
		System.out.println("CEO: " + this.ceo);
		System.out.println("Origin Country: " + this.originCountry);
	}
}