package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.NewspaperDTO;

public interface NewspaperService {
	boolean validateAndSave(NewspaperDTO dto);
}
