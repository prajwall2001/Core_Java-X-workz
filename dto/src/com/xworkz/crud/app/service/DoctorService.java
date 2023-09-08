package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.DoctorDTO;

public interface DoctorService {
	boolean validateAndSave(DoctorDTO dto);
}