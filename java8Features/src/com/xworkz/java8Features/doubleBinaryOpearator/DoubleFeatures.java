package com.xworkz.java8Features.doubleBinaryOpearator;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;

public class DoubleFeatures { // compare
	public static void main(String[] args) {
		DoubleBinaryOperator doubleBinaryOp = (s1, s2) -> {
			if (s1 == s2) {
				System.out.println("Old Amount");
			} else {
				System.out.println("New Amount");
			}
			return s1;
		};
		doubleBinaryOp.applyAsDouble(2000.00, 5000.00);
		System.out.println("\nDoubleConsumer");

		DoubleConsumer consumer1 = (d1) -> {
			if (d1 > 1000d)
				System.out.println("valid price:" + d1);
			else
				System.out.println("Invalid:" + d1);
		};
		consumer1.accept(900d);
		System.out.println("\nDouubleFunction");
		DoubleFunction<Double> dFunction = (s1) -> {
			if (s1 != 0)
				System.out.println(s1);
			else
				System.out.println(0);
			return s1;

		};
		dFunction.apply(0);

		System.out.println();
		IntFunction<Integer> ref1 = (num) -> {
			return 0;

		};
		System.out.println(ref1);
	}

}
