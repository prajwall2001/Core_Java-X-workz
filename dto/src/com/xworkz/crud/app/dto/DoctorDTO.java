package com.xworkz.crud.app.dto;

import java.io.Serializable;

public class DoctorDTO implements Serializable {
	private String doctorName;
	private String specialization;
	private int experience;
	private String hospitalName;

	public DoctorDTO() {

	}

	public DoctorDTO(String doctorName, String specialization, int experience, String hospitalName) {
		super();
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.experience = experience;
		this.hospitalName = hospitalName;
	}

	@Override
	public String toString() {
		return "DoctorDTO [doctorName=" + doctorName + ", specialization=" + specialization + ", experience="
				+ experience + ", hospitalName=" + hospitalName + "]";
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
}