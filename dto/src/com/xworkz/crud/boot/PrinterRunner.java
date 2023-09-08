package com.xworkz.crud.boot;

import com.xworkz.crud.app.dto.PrinterDTO;
import com.xworkz.crud.app.repository.PrinterRepository;
import com.xworkz.crud.app.repository.PrinterRepositoryImpl;
import com.xworkz.crud.app.service.PrinterService;
import com.xworkz.crud.app.service.PrinterServiceImpl;

public class PrinterRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main for Printer...");
		PrinterRepository printerRepository = new PrinterRepositoryImpl();
		PrinterService printerService = new PrinterServiceImpl(printerRepository);
		PrinterDTO dto = new PrinterDTO("EpsonL360", "Epson", 249.99, "LaserJet Printers");
		boolean persisted = printerService.validateAndSave(dto);
		System.out.println("Persisted: " + persisted);
	}
}
