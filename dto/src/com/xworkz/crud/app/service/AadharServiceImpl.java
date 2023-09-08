package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.AadharDTO;
import com.xworkz.crud.app.repository.AadharRepository;

public class AadharServiceImpl implements AadharService {
	private AadharRepository aadharRepository;

	public AadharServiceImpl(AadharRepository aadharRepository) {
		this.aadharRepository = aadharRepository;
	}

	@Override
	public boolean validateAndSave(AadharDTO dto) {
		System.out.println("Invoking validateAndSave in AadharServiceImpl");
		if (dto != null) {
			System.out.println("dto is valid, then store UID " + this.getClass().getSimpleName());
			String uid = dto.getUid();
			String name = dto.getName();
			int age = dto.getAge();
			String address = dto.getAddress();

			if (uid != null && !uid.isEmpty() && uid.length() >= 12 && uid.length() <= 16) {
				System.out.println("Aadhar UID " + dto.getUid() + " is valid");
			} else {
				System.err.println("Aadhar UID " + dto.getUid() + " is invalid");
			}

			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 50) {
				System.out.println("Aadhar Name " + dto.getName() + " is valid");
			} else {
				System.err.println("Aadhar Name " + dto.getName() + " is invalid");
			}

			if (age >= 0 && age <= 150) {
				System.out.println("Aadhar Age is valid");
			} else {
				System.err.println("Aadhar Age is invalid");
			}

			if (address != null && !address.isEmpty() && address.length() >= 10 && address.length() <= 100) {
				System.out.println("Aadhar Address is valid");
			} else {
				System.err.println("Aadhar Address is invalid");
			}

			this.aadharRepository.save(dto);
			return true;
		} else {
			System.err.println("Cannot store data, dto is invalid");
		}
		return false;
	}
}
