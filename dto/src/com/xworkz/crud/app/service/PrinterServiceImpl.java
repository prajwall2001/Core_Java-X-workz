package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.PrinterDTO;
import com.xworkz.crud.app.repository.PrinterRepository;

public class PrinterServiceImpl implements PrinterService {
	private PrinterRepository printerRepository;

	public PrinterServiceImpl(PrinterRepository printerRepository) {
		this.printerRepository = printerRepository;
	}

	@Override
	public boolean validateAndSave(PrinterDTO dto) {
		System.out.println("Invoking validateAndSave in PrinterServiceImpl");
		if (dto != null) {
			System.out.println("dto is valid, then store printer " + this.getClass().getSimpleName());
			String printerName = dto.getPrinterName();
			String brand = dto.getBrand();
			double price = dto.getPrice();
			String type = dto.getType();

			if (printerName != null && !printerName.isEmpty() && printerName.length() >= 3
					&& printerName.length() <= 15) {
				System.out.println("Printer " + dto.getPrinterName() + " is valid");
			} else {
				System.err.println("Printer " + dto.getPrinterName() + " is invalid");
			}

			if (brand != null && !brand.isEmpty() && brand.length() >= 3 && brand.length() <= 15) {
				System.out.println("Brand " + dto.getBrand() + " is valid");
			} else {
				System.err.println("Brand " + dto.getBrand() + " is invalid");
			}

			if (price > 0) {
				System.out.println("Printer price is valid");
			} else {
				System.err.println("Printer price is invalid");
			}

			this.printerRepository.save(dto);
			return true;
		} else {
			System.err.println("Cannot store data, dto is invalid");
		}
		return false;
	}
}
