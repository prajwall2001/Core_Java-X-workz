package com.java.singlelevel.inheritance;

import com.java.singlelevel.Computer;
import com.java.singlelevel.Laptop;

public class ComputerRunner {
public static void main(String[] args) {
	System.out.println("Invoking main in ComputerRunner");
	Laptop lap=new Laptop("Dell");
	System.out.println("************************************************************");
	lap.play();
	lap.tech();
	System.out.println("************************************************************");
	Computer comp=new Laptop("Lenovo");
}
}
