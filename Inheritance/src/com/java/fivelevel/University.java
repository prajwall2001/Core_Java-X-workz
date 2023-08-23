package com.java.fivelevel;

public class University {
	public String name;

 public  University(String name) {
	 System.out.println("invoking no-args cons");
        this.name = name;
    }

   public void displayInfo() {
        System.out.println("University Name: " + name);
    }
}
