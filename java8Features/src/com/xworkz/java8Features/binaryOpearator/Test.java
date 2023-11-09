package com.xworkz.java8Features.binaryOpearator;

import java.util.function.BinaryOperator;

public interface Test {
	public static void main(String[] args) {
		BinaryOperator<String> binary = (str1, str2) -> str1 + str2;
		System.out.println(binary.apply("Hello", "World"));
	}
}
