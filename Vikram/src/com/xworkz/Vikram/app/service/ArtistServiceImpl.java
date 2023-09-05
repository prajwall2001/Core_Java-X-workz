package com.xworkz.Vikram.app.service;

public class ArtistServiceImpl implements ArtistService {
	private ArtistService artistService;
	@Override
	public boolean validateAndSave (String artist) {
		if (artist!= null && !artist.isEmpty() && artist.length()>=3 && artist.length()<=10) {
	      System.out.println("artist is good ,then store artist");	         
	     }
		else {
			System.err.println("Cannot store data,artist is bad");
		}
		return false;
	}
	 public ArtistServiceImpl(ArtistService artistService) {
	        this.artistService = artistService;
	}
}
