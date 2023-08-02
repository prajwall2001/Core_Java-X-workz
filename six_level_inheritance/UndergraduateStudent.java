package com.xworkz.app.six_level_inheritance;

public class UndergraduateStudent extends Student {

	public int year;

    public UndergraduateStudent(String name, int studentId, int year) {
        super(name, studentId);
        System.out.println("Invoking const in undergraduate");
        this.year = year;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I am in year: " + year + ".");
    }
}
