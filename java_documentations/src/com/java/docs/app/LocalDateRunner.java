package com.java.docs.app;

import java.time.LocalDate;

public class LocalDateRunner {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalDate day=LocalDate.of(2001, 8, 28);
		System.out.println(day.isLeapYear());
		
		LocalDate date2=LocalDate.MAX;
		System.out.println(date2);
		
		LocalDate date3=LocalDate.MIN;
		System.out.println(date3);
		
		LocalDate date4=LocalDate.EPOCH;
		System.out.println(date4);
		
		LocalDate day5=LocalDate.ofEpochDay(25);
		System.out.println(day5);
		
		
	}

}
