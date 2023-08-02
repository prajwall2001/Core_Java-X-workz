package com.xworkz.app.two_sharing_inheritance;

public class Dog extends Mammal {
	
	public String breed;
	public Dog(String breed)
	{
		super(givesBirth);
		System.out.println("Invoking no-arg const in Dog");
	this.breed=breed;
	}
	
	public void bark() {
        System.out.println("Dog is barking");
    }

}
