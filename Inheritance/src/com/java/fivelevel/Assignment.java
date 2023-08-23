package com.java.fivelevel;
public class Assignment extends Student {
    String assignmentName;

   public Assignment(String universityName, String departmentName, String courseName, String professorName, String studentName, String assignmentName) {
        super(universityName, departmentName, courseName, professorName, studentName);
        this.assignmentName = assignmentName;
    }

   public void displayAssignmentInfo() {
        System.out.println("Assignment Name: " + assignmentName);
    }
}
