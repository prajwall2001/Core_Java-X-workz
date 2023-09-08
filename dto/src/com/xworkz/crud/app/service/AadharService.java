package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.AadharDTO;

public interface AadharService {
	boolean validateAndSave(AadharDTO dto);
}
