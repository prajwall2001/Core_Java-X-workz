package com.xworkz.java8Features.app;

public class Joy implements Happy{
@Override
public void accept(Object t, Object u) {
	System.out.println("Invoking accept...");
	
}
public static void main(String[] args) {
	Happy happy=(ref,ref1)->{
		System.out.println("Invoking BiConsumer Interface");
	};
	Joy joy =new Joy();
	happy.accept(happy, joy);
}
}
