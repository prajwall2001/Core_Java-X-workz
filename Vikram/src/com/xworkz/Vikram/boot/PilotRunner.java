package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.PilotRepository;
import com.xworkz.Vikram.app.PilotRepositoryImpl;

public class PilotRunner {
	public static void main(String[] args) {

        System.out.println("Invoking main in PilotRunner...");

        PilotRepository repo = new PilotRepositoryImpl();
        repo.addPilot("Amelia Earhart");
        repo.addPilot("Wright Brothers");
        repo.addPilot("Robertson");
        repo.addPilot("Chuck Yeager");
        repo.addPilot("Sunita Williams");
        repo.addPilot("Kalpana Chawla");
        repo.addPilot("JRD Tata");
        repo.addPilot("Neil Armstrong");
        repo.addPilot("Yuri Gagarin");
        repo.addPilot("Valentina Tereshkova");
        repo.addPilot("Bessie Coleman");
    }
}
