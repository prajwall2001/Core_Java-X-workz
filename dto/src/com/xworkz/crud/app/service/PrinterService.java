package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.PrinterDTO;

public interface PrinterService {
	boolean validateAndSave(PrinterDTO dto);
}
