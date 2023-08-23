package com.java.fivelevel;
public class Course extends Department {
  public  String courseName;

   public Course(String universityName, String departmentName, String courseName) {
        super(universityName, departmentName);
        System.out.println("invoking no-args cons");
        this.courseName = courseName;
    }

    public void displayCourseInfo() {
    	super.displayInfo();
        System.out.println("Course Name: " + courseName);
    }
}
