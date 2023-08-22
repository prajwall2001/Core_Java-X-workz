package com.java.docs.app;
import java.lang.System;
public class SystemRunner {

	public static void main(String[] args) {
		 System.out.println("Invoking getenv() method in System ");
	        String userHome = System.getenv("HOME");
	        System.out.println("User Home Directory: " + userHome);
	        
	        System.out.println("\nInvoking nanoTime() method in System ");
	        long time = System.nanoTime();
	        System.out.println("Time in Nanoseconds: " + time);
	        
	        System.out.println("\nInvoking lineSeparator() method in System ");
	        String ref = System.lineSeparator();
	        System.out.println("Line Separator: " + ref);
	        
	        System.out.println("\nInvoking repeat() method in System ");
	        String res= "Hello, world!".repeat(5);
	        System.out.println(res);
	        
	        System.out.println("\nInvoking identityHashCode() method in System ");
	        int hashCode = System.identityHashCode(res);
	        System.out.println("Identity Hash Code: " + hashCode);
	    }
	}


