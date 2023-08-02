package com.xworkz.app.two_sharing_inheritance;

public class Mammal extends Animal{
	
	public static boolean givesBirth;
	public Mammal(boolean givesBirth)
	{
		super(name);
		System.out.println("Invoking no-arg const in Mammal");
		this.givesBirth=givesBirth;
	}
	
	 public void produceMilk() {
	        System.out.println("Mammal is producing milk");
	    }
	
	
	

}
