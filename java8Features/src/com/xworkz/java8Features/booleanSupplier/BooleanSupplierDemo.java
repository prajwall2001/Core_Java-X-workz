package com.xworkz.java8Features.booleanSupplier;

import java.util.function.BooleanSupplier;

public class BooleanSupplierDemo {   //compare and result in boolean
	public static void main(String[] args) {
		BooleanSupplier booleanSupplier = () -> true;
		System.out.println(booleanSupplier.getAsBoolean());
		int x = 100;
		int y = 30;

		booleanSupplier = () -> x < y;
		System.out.println(booleanSupplier.getAsBoolean());

	}
}
