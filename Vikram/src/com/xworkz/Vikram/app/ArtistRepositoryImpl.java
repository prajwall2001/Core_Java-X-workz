package com.xworkz.Vikram.app;

public class ArtistRepositoryImpl implements ArtistRepository {

    private String[] artists = new String[TOTAL_ARTISTS];
    int position;

    @Override
    public void save(String artist) {
        System.out.println("Invoking save in ArtistRepositoryImpl...");

        if (this.position < TOTAL_ARTISTS) {
            this.artists[position] = artist;
            System.out.println("Stored " + artist + " in position " + this.position);
            this.position++;
        } else {
            System.err.println("Storage is full, cannot store artist...");
        }
    }
}
