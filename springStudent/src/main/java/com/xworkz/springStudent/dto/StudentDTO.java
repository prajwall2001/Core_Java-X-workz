package com.xworkz.springStudent.dto;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class StudentDTO {
	@NotNull
	@Size(min = 3, max = 20, message = "Name must me between 3 to 20 characters")
	private String name;
	@NotNull
	@Size(min=10,max=10 ,message="USN must me 10 characters")
	private String usn;
	@NotNull()
	@Size(min = 3, max = 20, message = "Branch must me between 3 to 20 characters")
	private String branch;
	@Min(1)
	@Max(8)
	private int semister;
	@DecimalMin("5.50")
	@DecimalMax("10.00")
	private double cgpa;
}
