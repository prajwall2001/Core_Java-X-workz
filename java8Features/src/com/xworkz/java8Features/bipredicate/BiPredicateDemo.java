package com.xworkz.java8Features.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {   //equlas ()
	public static void main(String[] args) {

		BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
		{
			System.out.println("String1 Equals String2:" + biPredicate.test("virat", "kohli"));

		};
	}
}
