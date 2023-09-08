package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.PrinterDTO;

public class PrinterRepositoryImpl implements PrinterRepository {
	private PrinterDTO[] dtos = new PrinterDTO[TOTAL_PRINTERS];
	int position;

	@Override
	public void save(PrinterDTO dto) {
		System.out.println("Invoking save in PrinterRepositoryImpl...");

		if (this.position < TOTAL_PRINTERS) {
			this.dtos[position] = dto;
			System.out.println("Stored " + dto + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot store printer...");
		}
	}
}
