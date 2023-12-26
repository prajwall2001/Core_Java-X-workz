package com.xworkz.springScientist.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ScientistDTO {
	@NotNull
	@Size(min = 3, max = 20, message = "Name must me between 3 to 20 characters")
	private String name;
	@NotNull(message="Not be null")
	@Size(min=3,max=30,message="Field should not be null")

	private String field;
	@Min(2)
	@Max(25)
	private int exp;
	@NotNull(message="Field should not be null")
	@Size(min=3,max=30,message="Country should not be null")
	private String country;
	@NotNull
	@Size(min = 3, max = 20, message = "Achievement must me between 3 to 20 characters")
	private String achievement;
}
