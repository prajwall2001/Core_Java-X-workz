package com.xworkz.springCakeOrder.dto;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CakeDTO {
	@NotNull()
	@Size(min=3,max=30,message="Customer should be between 3 to 30 characters")
	private String customer;
	@Email
	private String email;
	@NotNull(message = "select some flavour")
	@Size(min=3,max=30,message="Flavour should be between 3 to 30 characters")
	private String flavour;
	@NotNull(message="Please choose weight value`")
	@Size(min=3,max=30,message="Weight should be between 3 to 30 characters")
	private String weight;
	@DecimalMin("50.00")
	@DecimalMax("5000.00")
	private Double price;
	private boolean takeaway;

}
