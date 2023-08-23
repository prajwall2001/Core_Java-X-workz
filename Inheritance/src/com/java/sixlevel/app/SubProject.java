package com.java.sixlevel.app;
public class SubProject extends Project {
   public String subProjectName;

    public SubProject(String companyName, String departmentName, String divisionName, String teamName, String projectName, String subProjectName) {
        super(companyName, departmentName, divisionName, teamName, projectName);
        System.out.println("invoking no args const in subproject");
        this.subProjectName = subProjectName;
    }

    public void display() {
        super.display();
        System.out.println("Sub-Project Name: " + subProjectName);
    }
}
