package com.xworkz.app.six_level_inheritance;

public class PhDStudent extends MasterStudent {

	public PhDStudent(String name, int studentId, String researchTopic) {
        super(name, studentId, researchTopic);
        System.out.println("invoking const in PhDstudent");
    }

    public void introduce() {
        super.introduce();
        System.out.println("I am pursuing a PhD.");
    }
}
