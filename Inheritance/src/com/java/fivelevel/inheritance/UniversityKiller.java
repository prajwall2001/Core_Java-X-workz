package com.java.fivelevel.inheritance;

import com.java.fivelevel.Assignment;

public class UniversityKiller {

	public static void main(String[] args) {
		Assignment assignment = new Assignment("vtu", "Computer Science", "Programming 101", " Smith", "ARun", "Final Project");
        System.out.println("****************************************");
        assignment.displayInfo();
        assignment.displayDepartmentInfo();
        assignment.displayCourseInfo();
        assignment.displayProfessorInfo();
        assignment.displayStudentInfo();
        assignment.displayAssignmentInfo();
    }
	}

