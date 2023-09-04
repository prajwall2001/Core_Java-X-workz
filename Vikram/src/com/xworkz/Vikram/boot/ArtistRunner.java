package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.ArtistRepository;
import com.xworkz.Vikram.app.ArtistRepositoryImpl;

public class ArtistRunner {
    public static void main(String[] args) {

        System.out.println("Invoking main in ArtistRunner...");

        ArtistRepository artistRepo = new ArtistRepositoryImpl();
        artistRepo.save("Raja Ravi Varma");
        artistRepo.save("Amrita Sher-Gil");
        artistRepo.save("M.F. Husain");
        artistRepo.save("Tyeb Mehta");
        artistRepo.save("S.H. Raza");
        artistRepo.save("F.N. Souza");
        artistRepo.save("Jamini Roy");
        artistRepo.save("Nandalal Bose");
        artistRepo.save("Rabindranath Tagore");
        artistRepo.save("Anjolie Ela Menon");
        artistRepo.save("Arpita Singh");
    }
}
