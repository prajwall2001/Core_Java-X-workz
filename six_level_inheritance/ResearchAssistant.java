package com.xworkz.app.six_level_inheritance;

public class ResearchAssistant extends PhDStudent {

	public ResearchAssistant(String name, int studentId, String researchTopic) {
        super(name, studentId, researchTopic);
        System.out.println("invoking const in ResearchAssistant");
    }

    public void introduce() {
        super.introduce();
        System.out.println("I am also working as a research assistant.");
    }
}
