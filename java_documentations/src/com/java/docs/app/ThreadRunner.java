package com.java.docs.app;
import java.lang.Thread;
public class ThreadRunner {

	public static void main(String[] args) {
		Thread thread=new Thread();
		System.out.println("Hashcode() method in Thread");
		int ref= thread.hashCode();
		System.out.println(ref);
		
		System.out.println("\ngetAccess() method in Thread");
		thread.checkAccess();
		System.out.println(thread);
		
		System.out.println("\nequals() method in Thread");
		boolean ref3=thread.equals(thread);
		System.out.println(ref3);
		
		System.out.println("\nisAlive() method in Thread");
		boolean ref4=thread.isAlive();
		System.out.println(ref4);
		
		System.out.println("\ngetPriority() method in Thread");
		int ref5= thread.getPriority();
		System.out.println(ref5);
	
		

	}

}
