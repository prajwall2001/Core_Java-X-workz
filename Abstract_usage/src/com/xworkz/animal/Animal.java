package com.xworkz.animal;

public abstract class Animal {

	public void eat() {
		System.out.println("Animal is eating.");
	}

	public void sleep() {
		System.out.println("Animal is sleeping.");
	}

	public void move() {
		System.out.println("Animal is moving.");
	}

	public void sound() {
		System.out.println("Animal is making a sound.");
	}

	public void breathe() {
		System.out.println("Animal is breathing.");
	}

	public abstract void species();

	public abstract void habitat();

	public abstract void age();

	public abstract void color();

	public abstract void gender();
}
