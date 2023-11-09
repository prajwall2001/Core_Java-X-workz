package com.xworkz.java8Features.bifunction;

import java.util.function.BiFunction;

public class BiFunctionDemo implements BiFunction<Integer, Integer, Integer>{

	@Override
	public Integer apply(Integer t, Integer u) {
		return (t+u);
	}
public static void main(String[] args) {
	BiFunction<Integer, Integer, Integer> bifunction=(t,u)->(t+u);
	BiFunction<Integer, Integer, Integer> bifunction1=(t,u)->(t-u);{
		System.out.println("Addition:"+bifunction.apply(100, 100));
		System.out.println("Substraction:"+bifunction1.apply(100, 20));
	};
}
}
