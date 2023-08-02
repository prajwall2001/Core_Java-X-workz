package com.xworkz.app.six_level_inheritance;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(String name, int studentId, String researchTopic) {
        super(name, studentId, researchTopic);
        System.out.println("invoking const in MasterStudent");
    }

    public void introduce() {
        super.introduce();
        System.out.println("I am pursuing a Master's degree.");
    }
}
