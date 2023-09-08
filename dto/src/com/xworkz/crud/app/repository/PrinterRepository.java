package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.PrinterDTO;

public interface PrinterRepository {
	int TOTAL_PRINTERS = 10;

	void save(PrinterDTO dto);
}
