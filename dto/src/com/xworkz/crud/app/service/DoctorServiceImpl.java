package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.DoctorDTO;
import com.xworkz.crud.app.repository.DoctorRepository;

public class DoctorServiceImpl implements DoctorService {
	private DoctorRepository doctorRepository;

	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}

	@Override
	public boolean validateAndSave(DoctorDTO dto) {
		System.out.println("Invoking validateAndSave in DoctorServiceImpl");
		if (dto != null) {
			System.out.println("dto is valid, then store doctor " + this.getClass().getSimpleName());
			String doctorName = dto.getDoctorName();
			String specialization = dto.getSpecialization();
			int experience = dto.getExperience();
			String hospitalName = dto.getHospitalName();

			if (doctorName != null && !doctorName.isEmpty() && doctorName.length() >= 3 && doctorName.length() <= 15) {
				System.out.println("Doctor " + dto.getDoctorName() + " is valid");
			} else {
				System.err.println("Doctor " + dto.getDoctorName() + " is invalid");
			}

			if (specialization != null && !specialization.isEmpty() && specialization.length() >= 3
					&& specialization.length() <= 20) {
				System.out.println("Specialization " + dto.getSpecialization() + " is valid");
			} else {
				System.err.println("Specialization " + dto.getSpecialization() + " is invalid");
			}

			if (experience > 0) {
				System.out.println("Doctor experience is valid");
			} else {
				System.err.println("Doctor experience is invalid");
			}

			if (hospitalName != null && !hospitalName.isEmpty() && hospitalName.length() >= 3
					&& hospitalName.length() <= 50) {
				System.out.println("Hospital Name " + dto.getHospitalName() + " is valid");
			} else {
				System.err.println("Hospital Name " + dto.getHospitalName() + " is invalid");
			}

			this.doctorRepository.save(dto);
			return true;
		} else {
			System.err.println("Cannot store data, dto is invalid");
		}
		return false;
	}
}
