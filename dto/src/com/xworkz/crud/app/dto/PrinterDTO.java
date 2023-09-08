package com.xworkz.crud.app.dto;

import java.io.Serializable;

public class PrinterDTO implements Serializable {
	private String printerName;
	private String brand;
	private double price;
	private String type;

	public PrinterDTO() {

	}

	public PrinterDTO(String printerName, String brand, double price, String type) {
		super();
		this.printerName = printerName;
		this.brand = brand;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "PrinterDTO [printerName=" + printerName + ", brand=" + brand + ", price=" + price + ", type=" + type
				+ "]";
	}

	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
