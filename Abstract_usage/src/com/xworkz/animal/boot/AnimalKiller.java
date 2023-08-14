package com.xworkz.animal.boot;

import com.xworkz.animal.Animal;
import com.xworkz.animal.Dog;

public class AnimalKiller {

	public static void main(String[] args) {
		Animal dog=new Dog();

        dog.eat();
        dog.sleep();
        dog.move();
        dog.sound();
        dog.breathe();

        dog.species();
        dog.habitat();
        dog.age();
        dog.color();
        dog.gender();
	}

}
