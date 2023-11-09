package com.xworkz.collection.boot;

import java.awt.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.collection.dto.GameDTO;
import com.xworkz.collection.dto.IceCreamDTO;

public class GameRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in GameRunner...");

		GameDTO dto1 = new GameDTO(1, "Chess", 2, 100, LocalDate.of(2023, 10, 5), "Raj", "Kumar", 120);
		GameDTO dto2 = new GameDTO(2, "Tennis", 2, 200, LocalDate.of(2023, 9, 15), "Rohan", "Ram", 90);
		GameDTO dto3 = new GameDTO(3, "Cricket", 22, 400, LocalDate.of(2023, 8, 25), "Prajwal", "Ganesh", 240);
		GameDTO dto4 = new GameDTO(4, "Swimming", 10, 300, LocalDate.of(2023, 7, 10), "Pramod", "Dheeraj", 150);
		GameDTO dto5 = new GameDTO(5, "Basketball", 10, 150, LocalDate.of(2023, 6, 20), "Rohit", "Arun", 180);
		GameDTO dto6 = new GameDTO(6, "Football", 22, 250, LocalDate.of(2023, 5, 5), "Anil", "Anup", 120);
		GameDTO dto7 = new GameDTO(7, "Badminton", 2, 50, LocalDate.of(2023, 4, 30), "Amrit", "Aman", 60);
		GameDTO dto8 = new GameDTO(8, "Table Tennis", 2, 80, LocalDate.of(2023, 3, 15), "Darshan", "Amit", 75);
		GameDTO dto9 = new GameDTO(9, "Golf", 4, 75, LocalDate.of(2023, 2, 10), "Veeresh", "Raman", 200);
		GameDTO dto10 = new GameDTO(10, "Boxing", 2, 120, LocalDate.of(2023, 1, 5), "Rana", "Ani", 150);

		ArrayList<GameDTO> games = (ArrayList<GameDTO>) Stream.of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted().collect(Collectors.toList());
		games.stream().sorted(Comparator.comparing(GameDTO::getId)).forEach(ref->System.out.println(ref));
        System.out.println("-------------------------------------");
		games.stream().sorted(Comparator.comparing(GameDTO::getName)).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------");
		games.stream().sorted(Comparator.comparing(GameDTO::getName).reversed()).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------");
		games.stream().sorted(Comparator.comparing(GameDTO::getPoints)).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------");
		games.stream().sorted(Comparator.comparing(GameDTO::getPoints).reversed()).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------");
		games.stream().sorted(Comparator.comparing(GameDTO::getEventDate)).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------");
		games.stream().sorted(Comparator.comparing(GameDTO::getName).thenComparing(GameDTO::getPoints)).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------");
		games.stream().sorted(Comparator.comparing(GameDTO::getName).thenComparing(GameDTO::getPoints).thenComparing(GameDTO::getEventDate)).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------");
		games.stream().sorted(Comparator.comparing(GameDTO::getDuration).reversed().thenComparing(GameDTO::getEventDate, Comparator.reverseOrder()).thenComparing(GameDTO::getId, Comparator.reverseOrder())).forEach(ref->System.out.println(ref));
		System.out.println("-------------------------------------");
		GameDTO gameByName = games.stream().filter(game -> game.getName().equalsIgnoreCase("Tennis")).findFirst().orElse(null);
		System.out.println("Game by Name Tennis: " + gameByName);
		System.out.println("-------------------------------------");
		LocalDate searchDate = LocalDate.of(2023, 6, 20);
		GameDTO gameByEventDate = games.stream().filter(game -> game.getEventDate().equals(searchDate)).findFirst().orElse(null);
		System.out.println("Game by Event Date '2023-06-20': " + gameByEventDate);
		System.out.println("-------------------------------------");
		String winnerByGame = games.stream().filter(game -> game.getName().equalsIgnoreCase("Chess")).map(GameDTO::getWinner).findFirst().orElse(null);
		System.out.println("Winner of Chess: " + winnerByGame);
		System.out.println("-------------------------------------");
		int pointsByGame = games.stream().filter(game -> game.getName().equalsIgnoreCase("Basketball")).mapToInt(GameDTO::getPoints).findFirst().orElse(0);
		System.out.println("Points in Basketball: " + pointsByGame);
	}

}
