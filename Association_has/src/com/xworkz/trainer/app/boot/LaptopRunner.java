package com.xworkz.trainer.app.boot;

import com.xworkz.trainer.app.Laptop;
import com.xworkz.trainer.app.Trainer;

public class LaptopRunner {

	public static void main(String[] args) {
	        System.out.println("Invoking main in TrainerRunner....");
	        String name = "John";

	        Laptop laptop = new Laptop();

	        Trainer trainer = new Trainer(name);
	        System.out.println("Trainer name: " + name);
	        trainer.setLaptop(laptop);
	        trainer.teaching();
	    }
	}

