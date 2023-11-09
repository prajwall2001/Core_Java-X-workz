package com.xworkz.java8Features.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {// contains
	Consumer<String> consumer1 = (input) -> System.out.println(input + "World");

	public static void main(String[] args) {

		Consumer<String> consumer = (s) -> System.out.println(s);
		consumer.accept("Virat");

		Consumer<String> consumer1 = (input) -> System.out.println(input + "World");
		Consumer<String> consumer2 = (input) -> System.out.println(input + "java");
		consumer1.andThen(consumer2).accept("hello");
		System.out.println();
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		integers.forEach((t) -> System.out.println(t));
	}
}
