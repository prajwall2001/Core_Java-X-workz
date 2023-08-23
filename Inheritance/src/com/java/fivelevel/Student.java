package com.java.fivelevel;
public class Student extends Professor {
 public   String studentName;

   public Student(String universityName, String departmentName, String courseName, String professorName, String studentName) {
        super(universityName, departmentName, courseName, professorName);
        this.studentName = studentName;
    }

   public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
    }
}
