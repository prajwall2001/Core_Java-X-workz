package com.xworkz.app.six_level_inheritance;

public class Freshman extends UndergraduateStudent {
	
	public Freshman(String name, int studentId) {
        super(name, studentId, 1);
        System.out.println("Invoking const in Freshman");
    }

    public void introduce() {
        super.introduce();
        System.out.println("I am a freshman.");
    }

}
