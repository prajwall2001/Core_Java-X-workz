package com.xworkz.collection.app.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ApplicationDTO implements Serializable {
	private String name;
	private String version;
	private String companyname;
	private LocalDate createDate;
	private double rating;

	public ApplicationDTO() {
		super();
	}

	public ApplicationDTO(String name, String version, String companyname, LocalDate createDate, double rating) {
		super();
		this.name = name;
		this.version = version;
		this.companyname = companyname;
		this.createDate = createDate;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", companyname=" + companyname
				+ ", createDate=" + createDate + ", rating=" + rating + "]";
	}

}
