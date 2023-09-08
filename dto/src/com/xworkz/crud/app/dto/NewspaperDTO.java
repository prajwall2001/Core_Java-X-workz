package com.xworkz.crud.app.dto;

import java.io.Serializable;

public class NewspaperDTO implements Serializable {
	private String newspaperName;
	private int pages;
	private double price;
	private String language;
	
	public NewspaperDTO() {
		
	}
		

	public NewspaperDTO(String newspaperName, int pages, double price, String language) {
		super();
		this.newspaperName = newspaperName;
		this.pages = pages;
		this.price = price;
		this.language = language;
	}




	@Override
	public String toString() {
		return "NewspaperDTO [newspaperName=" + newspaperName + ", pages=" + pages + ", price=" + price + ", language="
				+ language + "]";
	}


	public String getNewspaperName() {
		return newspaperName;
	}

	public void setNewspaperName(String newspaperName) {
		this.newspaperName = newspaperName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	

}
