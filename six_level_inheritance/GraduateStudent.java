package com.xworkz.app.six_level_inheritance;

public class GraduateStudent extends Freshman {
	
	 public String researchTopic;

	    public GraduateStudent(String name, int studentId, String researchTopic) {
	        super(name, studentId);
	        System.out.println("invoking const in GraduateStudent");
	        this.researchTopic = researchTopic;
	    }

	    public void introduce() {
	        super.introduce();
	        System.out.println("I am a graduate student. My research topic is: " + researchTopic + ".");
	    }

}
