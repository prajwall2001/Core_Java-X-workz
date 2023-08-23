package com.java.fivelevel;
public class Department extends University {
   public  String departmentName;

   public Department(String universityName, String departmentName) {
        super(universityName);
        System.out.println("invoking no-args cons");
        this.departmentName = departmentName;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department Name: " + departmentName);
    }
   }
