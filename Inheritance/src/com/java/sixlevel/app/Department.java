package com.java.sixlevel.app;
public class Department extends Company {
  public  String departmentName;

   public Department(String companyName, String departmentName) {
        super(companyName);
        System.out.println("invoking non args const in Dept");
        this.departmentName = departmentName;
    }

   public void display() {
        super.display();
        System.out.println("Department Name: " + departmentName);
    }
}
