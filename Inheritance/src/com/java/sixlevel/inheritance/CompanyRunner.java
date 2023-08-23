package com.java.sixlevel.inheritance;

import com.java.sixlevel.app.Task;

public class CompanyRunner {
public static void main(String[] args) {
	System.out.println("Invoking main in CompanyRunner");
	Task task = new Task("XYZ Corp", "Engineering", "Software", "Development Team", "Project X", "SubProject Y", "Implement Feature Z");
	System.out.println("**************************************");
	task.display();
}
}
