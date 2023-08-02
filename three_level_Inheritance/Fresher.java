package com.xworkz.app.three_level_Inheritance;

public class Fresher {

	public static String name;
	
	public Fresher(String name){
		System.out.println("Invoking no-arg const in Fresher");
		this.name=name;
	}
	
	public void searchFor()
	{
		System.out.println("Invoking searchFor in Fresher");
	}
	
}
