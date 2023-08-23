package com.java.sixlevel.app;
public class Task extends SubProject {
   public String taskName;

   public Task(String companyName, String departmentName, String divisionName, String teamName, String projectName, String subProjectName, String taskName) {
        super(companyName, departmentName, divisionName, teamName, projectName, subProjectName);
        this.taskName = taskName;
    }

    public void display() {
        super.display();
        System.out.println("Task Name: " + taskName);
    }
}
