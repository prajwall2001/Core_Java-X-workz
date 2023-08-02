package com.xworkz.app.six_level_inheritance;

public class Student extends Person {

	 public int studentId;

	    public Student(String name, int studentId) {
	        super(name);
	        System.out.println("invoking const in Student");
	        this.studentId = studentId;
	    }

	    public void introduce() {
	        super.introduce();
	        System.out.println("I am a student with ID: " + studentId + ".");
	    }
}
