package com.engineer.boot;

import com.engineer.app.Player;
import com.engineer.app.Sport;

public class EngineerRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in SportRunner");

		Player players0 = new Player("Rohit", "Two");
		Player players1 = new Player("Gayle", "seven");
		Player players2 = new Player("ABD", "Eleven");
		Player players3 = new Player("Shreyas", "fourteen");
		Player players4 = new Player("Virat", "Three");

		Player[] players6 = { players0, players1, players2, players3, players4 };

		Sport sport = new Sport("Cricket", players6);
		sport.printInfo();

	}
}
