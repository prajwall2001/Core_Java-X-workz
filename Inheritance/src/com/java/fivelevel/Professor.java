package com.java.fivelevel;

public class Professor extends Course {
  public  String professorName;

  public  Professor(String universityName, String departmentName, String courseName, String professorName) {
        super(universityName, departmentName, courseName);
        this.professorName = professorName;
    }

  public  void displayProfessorInfo() {
        System.out.println("Professor Name: " + professorName);
    }
}
