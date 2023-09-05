package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.service.ArtistService;
import com.xworkz.Vikram.app.service.ArtistServiceImpl;

public class ArtistsRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main...");
		ArtistService artistService=new ArtistServiceImpl(null);
		artistService.validateAndSave("Arijit Singh");
	}

}
