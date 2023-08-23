package com.java.sixlevel.app;
public class Project extends Team {
   public String projectName;

   public Project(String companyName, String departmentName, String divisionName, String teamName, String projectName) {
        super(companyName, departmentName, divisionName, teamName);
        this.projectName = projectName;
    }

   public void display() {
        super.display();
        System.out.println("Project Name: " + projectName);
    }
    }
