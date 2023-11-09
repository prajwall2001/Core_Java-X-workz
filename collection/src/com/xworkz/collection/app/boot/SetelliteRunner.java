package com.xworkz.collection.app.boot;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.app.dto.SetelliteDTO;

public class SetelliteRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in SetelliteRunner....");

		Collection<SetelliteDTO> dtos = new ArrayList<>();

		SetelliteDTO satellite1 = new SetelliteDTO("Rohini RS-D1", 100, 50.5, true, 'A', (short) 1980, 200000, 500.0f,
				(byte) 5, LocalDate.of(1980, 1, 1), LocalDateTime.now());
		dtos.add(satellite1);

		SetelliteDTO satellite2 = new SetelliteDTO("Ariane Passenger Payload Experiment", 110, 60.5, true, 'B',
				(short) 1990, 210000, 600.0f, (byte) 6, LocalDate.of(1990, 2, 15), LocalDateTime.now());
		dtos.add(satellite2);

		SetelliteDTO satellite3 = new SetelliteDTO("Bhaskara-II", 120, 70.5, true, 'C', (short) 1995, 220000, 700.0f,
				(byte) 7, LocalDate.of(1995, 4, 30), LocalDateTime.now());
		dtos.add(satellite3);

		SetelliteDTO satellite4 = new SetelliteDTO("INSAT-1A", 130, 80.5, true, 'D', (short) 1985, 230000, 800.0f,
				(byte) 8, LocalDate.of(1985, 6, 10), LocalDateTime.now());
		dtos.add(satellite4);

		SetelliteDTO satellite5 = new SetelliteDTO("Rohini RS-D2", 140, 90.5, true, 'E', (short) 1982, 240000, 900.0f,
				(byte) 9, LocalDate.of(1982, 8, 20), LocalDateTime.now());
		dtos.add(satellite5);

		SetelliteDTO satellite6 = new SetelliteDTO("INSAT-1B", 150, 100.5, true, 'F', (short) 1986, 250000, 1000.0f,
				(byte) 10, LocalDate.of(1986, 10, 5), LocalDateTime.now());
		dtos.add(satellite6);

		SetelliteDTO satellite7 = new SetelliteDTO("CROSS-1", 160, 110.5, true, 'G', (short) 1992, 260000, 1100.0f,
				(byte) 11, LocalDate.of(1992, 12, 15), LocalDateTime.now());
		dtos.add(satellite7);

		SetelliteDTO satellite8 = new SetelliteDTO("IRS-1A", 170, 120.5, true, 'H', (short) 1988, 270000, 1200.0f,
				(byte) 12, LocalDate.of(1988, 7, 25), LocalDateTime.now());
		dtos.add(satellite8);

		SetelliteDTO satellite9 = new SetelliteDTO("SROSS-2", 180, 130.5, true, 'I', (short) 1994, 280000, 1300.0f,
				(byte) 13, LocalDate.of(1994, 3, 18), LocalDateTime.now());
		dtos.add(satellite9);

		SetelliteDTO satellite10 = new SetelliteDTO("INSAT-1C", 190, 140.5, true, 'J', (short) 1984, 290000, 1400.0f,
				(byte) 14, LocalDate.of(1984, 9, 30), LocalDateTime.now());
		dtos.add(satellite10);

		SetelliteDTO satellite11 = new SetelliteDTO("INSAT-1D", 200, 150.5, true, 'K', (short) 1987, 300000, 1500.0f,
				(byte) 15, LocalDate.of(1987, 5, 15), LocalDateTime.now());
		dtos.add(satellite11);

		SetelliteDTO satellite12 = new SetelliteDTO("IRS-1B", 210, 160.5, true, 'L', (short) 1989, 310000, 1600.0f,
				(byte) 16, LocalDate.of(1989, 11, 10), LocalDateTime.now());
		dtos.add(satellite12);

		SetelliteDTO satellite13 = new SetelliteDTO("SROSS-C", 220, 170.5, true, 'M', (short) 1993, 320000, 1700.0f,
				(byte) 17, LocalDate.of(1993, 8, 5), LocalDateTime.now());
		dtos.add(satellite13);

		SetelliteDTO satellite14 = new SetelliteDTO("INSAT-2DT", 230, 180.5, true, 'N', (short) 1997, 330000, 1800.0f,
				(byte) 18, LocalDate.of(1997, 6, 1), LocalDateTime.now());
		dtos.add(satellite14);

		SetelliteDTO satellite15 = new SetelliteDTO("INSAT-2A", 240, 190.5, true, 'O', (short) 1996, 340000, 1900.0f,
				(byte) 19, LocalDate.of(1996, 4, 12), LocalDateTime.now());
		dtos.add(satellite15);

		SetelliteDTO satellite16 = new SetelliteDTO("INSAT-2B", 250, 200.5, true, 'P', (short) 1998, 350000, 2000.0f,
				(byte) 20, LocalDate.of(1998, 2, 28), LocalDateTime.now());
		dtos.add(satellite16);

		SetelliteDTO satellite17 = new SetelliteDTO("IRS-1E", 260, 210.5, true, 'Q', (short) 1991, 360000, 2100.0f,
				(byte) 21, LocalDate.of(1991, 10, 17), LocalDateTime.now());
		dtos.add(satellite17);

		SetelliteDTO satellite18 = new SetelliteDTO("SROSS-C2", 270, 220.5, true, 'R', (short) 1999, 370000, 2200.0f,
				(byte) 22, LocalDate.of(1999, 7, 22), LocalDateTime.now());
		dtos.add(satellite18);

		SetelliteDTO satellite19 = new SetelliteDTO("IRS-P2", 280, 230.5, true, 'S', (short) 2000, 380000, 2300.0f,
				(byte) 23, LocalDate.of(2000, 3, 9), LocalDateTime.now());
		dtos.add(satellite19);

		SetelliteDTO satellite20 = new SetelliteDTO("INSAT-2C", 290, 240.5, true, 'T', (short) 2002, 390000, 2400.0f,
				(byte) 24, LocalDate.of(2002, 1, 14), LocalDateTime.now());
		dtos.add(satellite20);

		SetelliteDTO satellite21 = new SetelliteDTO("IRS-1C", 100, 50.5, true, 'A', (short) 1988, 200000, 500.0f,
				(byte) 5, LocalDate.of(1988, 4, 15), LocalDateTime.now());
		dtos.add(satellite21);

		SetelliteDTO satellite22 = new SetelliteDTO("IRS-P2", 110, 45.2, true, 'B', (short) 1991, 210000, 520.5f,
				(byte) 6, LocalDate.of(1991, 7, 23), LocalDateTime.now());
		dtos.add(satellite22);

		SetelliteDTO satellite23 = new SetelliteDTO("IRS-P3", 95, 47.9, true, 'A', (short) 1994, 215000, 505.0f,
				(byte) 7, LocalDate.of(1994, 9, 5), LocalDateTime.now());
		dtos.add(satellite23);

		SetelliteDTO satellite24 = new SetelliteDTO("INSAT-2D", 120, 60.8, true, 'C', (short) 1997, 220000, 515.0f,
				(byte) 8, LocalDate.of(1997, 11, 17), LocalDateTime.now());
		dtos.add(satellite24);

		SetelliteDTO satellite25 = new SetelliteDTO("IRS-1D", 105, 48.6, true, 'A', (short) 2000, 230000, 510.0f,
				(byte) 9, LocalDate.of(2000, 3, 8), LocalDateTime.now());
		dtos.add(satellite25);

		SetelliteDTO satellite26 = new SetelliteDTO("INSAT-2E", 115, 55.4, true, 'B', (short) 2003, 240000, 525.0f,
				(byte) 10, LocalDate.of(2003, 6, 12), LocalDateTime.now());
		dtos.add(satellite26);

		SetelliteDTO satellite27 = new SetelliteDTO("IRS-P4 OCEANS", 130, 62.3, true, 'A', (short) 2006, 250000, 530.0f,
				(byte) 11, LocalDate.of(2006, 9, 21), LocalDateTime.now());
		dtos.add(satellite27);

		SetelliteDTO satellite28 = new SetelliteDTO("INSAT-3B", 125, 56.7, true, 'C', (short) 2009, 260000, 520.5f,
				(byte) 12, LocalDate.of(2009, 12, 30), LocalDateTime.now());
		dtos.add(satellite28);

		SetelliteDTO satellite29 = new SetelliteDTO("GSAT-1", 135, 63.9, true, 'A', (short) 2012, 270000, 515.0f,
				(byte) 13, LocalDate.of(2012, 4, 7), LocalDateTime.now());
		dtos.add(satellite29);

		SetelliteDTO satellite30 = new SetelliteDTO("Technology Experiment Satellite (TES)", 140, 70.2, true, 'B',
				(short) 2015, 280000, 535.0f, (byte) 14, LocalDate.of(2015, 7, 19), LocalDateTime.now());
		dtos.add(satellite30);

		SetelliteDTO satellite31 = new SetelliteDTO("INSAT-3C", 145, 75.1, true, 'A', (short) 2018, 290000, 540.0f,
				(byte) 15, LocalDate.of(2018, 9, 28), LocalDateTime.now());
		dtos.add(satellite31);

		SetelliteDTO satellite32 = new SetelliteDTO("Kalpana-1 (METSAT)", 150, 80.0, true, 'C', (short) 2021, 300000,
				530.5f, (byte) 16, LocalDate.of(2021, 11, 2), LocalDateTime.now());
		dtos.add(satellite32);

		SetelliteDTO satellite33 = new SetelliteDTO("INSAT-3A", 155, 85.4, true, 'A', (short) 2024, 310000, 525.0f,
				(byte) 17, LocalDate.of(2024, 1, 14), LocalDateTime.now());
		dtos.add(satellite33);

		SetelliteDTO satellite34 = new SetelliteDTO("GSAT-2", 160, 90.8, true, 'B', (short) 2027, 320000, 540.5f,
				(byte) 18, LocalDate.of(2027, 3, 26), LocalDateTime.now());
		dtos.add(satellite34);

		SetelliteDTO satellite35 = new SetelliteDTO("INSAT-3E", 165, 95.7, true, 'A', (short) 2030, 330000, 545.0f,
				(byte) 19, LocalDate.of(2030, 5, 5), LocalDateTime.now());
		dtos.add(satellite35);

		SetelliteDTO satellite36 = new SetelliteDTO("RESOURCES-1 (IRS-P6)", 170, 100.2, true, 'C', (short) 2033, 340000,
				535.5f, (byte) 20, LocalDate.of(2033, 7, 7), LocalDateTime.now());
		dtos.add(satellite36);

		SetelliteDTO satellite37 = new SetelliteDTO("EDUSAT (GSAT-3)", 175, 105.9, true, 'A', (short) 2036, 350000,
				530.0f, (byte) 21, LocalDate.of(2036, 9, 18), LocalDateTime.now());
		dtos.add(satellite37);

		SetelliteDTO satellite38 = new SetelliteDTO("HAMSA", 180, 110.3, true, 'B', (short) 2039, 360000, 545.5f,
				(byte) 22, LocalDate.of(2039, 11, 22), LocalDateTime.now());
		dtos.add(satellite38);

		SetelliteDTO satellite39 = new SetelliteDTO("CARTOSAT-1", 185, 115.7, true, 'A', (short) 2042, 370000, 550.0f,
				(byte) 23, LocalDate.of(2042, 1, 31), LocalDateTime.now());
		dtos.add(satellite39);

		SetelliteDTO satellite40 = new SetelliteDTO("INSAT-4A", 190, 120.1, true, 'C', (short) 2045, 380000, 540.5f,
				(byte) 24, LocalDate.of(2045, 4, 4), LocalDateTime.now());
		dtos.add(satellite40);

		SetelliteDTO setellite41 = new SetelliteDTO("INSAT-4C", 100, 50.5, true, 'A', (short) 2005, 36000L, 2.5f,
				(byte) 2, LocalDate.of(2005, 7, 10), LocalDateTime.now());
		dtos.add(setellite41);
		SetelliteDTO setellite42 = new SetelliteDTO("CARTOSAT-2", 200, 150.2, true, 'B', (short) 2007, 42000L, 3.0f,
				(byte) 4, LocalDate.of(2007, 1, 12), LocalDateTime.now());
		dtos.add(setellite42);
		SetelliteDTO setellite43 = new SetelliteDTO("SRE-1 (Space Capsule Recovery Experiment)", 150, 75.3, true, 'A',
				(short) 2007, 40000L, 2.8f, (byte) 3, LocalDate.of(2007, 1, 10), LocalDateTime.now());
		dtos.add(setellite43);
		SetelliteDTO setellite44 = new SetelliteDTO("INSAT-4B", 120, 60.8, true, 'B', (short) 2007, 39000L, 3.2f,
				(byte) 2, LocalDate.of(2007, 3, 12), LocalDateTime.now());
		dtos.add(setellite44);
		SetelliteDTO setellite45 = new SetelliteDTO("INSAT-4CR", 140, 70.2, true, 'A', (short) 2007, 41000L, 2.7f,
				(byte) 4, LocalDate.of(2007, 5, 12), LocalDateTime.now());
		dtos.add(setellite45);
		SetelliteDTO setellite46 = new SetelliteDTO("CARTOSAT-2A", 180, 90.5, true, 'A', (short) 2008, 43000L, 2.9f,
				(byte) 3, LocalDate.of(2008, 2, 15), LocalDateTime.now());
		dtos.add(setellite46);
		SetelliteDTO setellite47 = new SetelliteDTO("IMS-1", 130, 65.2, true, 'B', (short) 2008, 40000L, 3.1f, (byte) 2,
				LocalDate.of(2008, 6, 18), LocalDateTime.now());
		dtos.add(setellite47);
		SetelliteDTO setellite48 = new SetelliteDTO("Chandrayaan-1", 240, 120.0, true, 'A', (short) 2008, 50000L, 3.0f,
				(byte) 4, LocalDate.of(2008, 10, 22), LocalDateTime.now());
		dtos.add(setellite48);
		SetelliteDTO setellite49 = new SetelliteDTO("RISAT-2", 160, 80.4, true, 'A', (short) 2009, 47000L, 3.1f,
				(byte) 3, LocalDate.of(2009, 4, 20), LocalDateTime.now());
		dtos.add(setellite49);
		SetelliteDTO setellite50 = new SetelliteDTO("ANUSAT", 110, 55.0, true, 'B', (short) 2009, 38000L, 2.8f,
				(byte) 2, LocalDate.of(2009, 4, 20), LocalDateTime.now());
		dtos.add(setellite50);
		SetelliteDTO setellite51 = new SetelliteDTO("Oceans-2", 170, 85.7, true, 'A', (short) 2010, 46000L, 3.0f,
				(byte) 4, LocalDate.of(2010, 9, 12), LocalDateTime.now());
		dtos.add(setellite51);
		SetelliteDTO setellite52 = new SetelliteDTO("GSAT-4", 130, 65.2, true, 'A', (short) 2011, 38000L, 3.2f,
				(byte) 2, LocalDate.of(2011, 5, 4), LocalDateTime.now());
		dtos.add(setellite52);
		SetelliteDTO setellite53 = new SetelliteDTO("CARTOSAT-2B", 200, 100.0, true, 'A', (short) 2012, 42000L, 2.9f,
				(byte) 3, LocalDate.of(2012, 7, 12), LocalDateTime.now());
		dtos.add(setellite53);
		SetelliteDTO setellite54 = new SetelliteDTO("GSAT-5P /INSAT-4D", 180, 90.5, true, 'A', (short) 2013, 43000L,
				2.8f, (byte) 4, LocalDate.of(2013, 10, 1), LocalDateTime.now());
		dtos.add(setellite54);
		SetelliteDTO setellite55 = new SetelliteDTO("RESOURCES-2", 150, 75.3, true, 'A', (short) 2013, 40000L, 3.1f,
				(byte) 2, LocalDate.of(2013, 4, 18), LocalDateTime.now());
		dtos.add(setellite55);
		SetelliteDTO setellite56 = new SetelliteDTO("INSAT-4G", 170, 85.7, true, 'B', (short) 2015, 45000L, 2.7f,
				(byte) 3, LocalDate.of(2015, 8, 5), LocalDateTime.now());
		dtos.add(setellite56);
		SetelliteDTO setellite57 = new SetelliteDTO("Youths", 140, 70.2, true, 'A', (short) 2015, 41000L, 2.8f,
				(byte) 2, LocalDate.of(2015, 6, 19), LocalDateTime.now());
		dtos.add(setellite57);
		SetelliteDTO setellite58 = new SetelliteDTO("GSAT-12", 120, 60.8, true, 'A', (short) 2011, 39000L, 3.0f,
				(byte) 4, LocalDate.of(2011, 7, 11), LocalDateTime.now());
		dtos.add(setellite58);
		SetelliteDTO setellite59 = new SetelliteDTO("Megha-Tropiques", 160, 80.4, true, 'A', (short) 2011, 47000L, 2.9f,
				(byte) 3, LocalDate.of(2011, 10, 12), LocalDateTime.now());
		dtos.add(setellite59);
		SetelliteDTO setellite60 = new SetelliteDTO("RISAT-1", 130, 65.2, true, 'A', (short) 2012, 38000L, 3.1f,
				(byte) 2, LocalDate.of(2012, 4, 26), LocalDateTime.now());
		dtos.add(setellite60);

		SetelliteDTO satellite61 = new SetelliteDTO("GSAT-10", 35900, 3400.0, true, 'A', (short) 2012, 42156, 1.55f,
				(byte) 2, LocalDate.of(2012, 9, 29), LocalDateTime.now());
		dtos.add(satellite61);

		SetelliteDTO satellite62 = new SetelliteDTO("SARAL", 785, 407.0, true, 'A', (short) 2013, 78563, 1.95f,
				(byte) 3, LocalDate.of(2013, 2, 25), LocalDateTime.now());
		dtos.add(satellite62);

		SetelliteDTO satellite63 = new SetelliteDTO("IRNSS-1A", 35785, 1425.0, true, 'A', (short) 2013, 37689, 1.32f,
				(byte) 4, LocalDate.of(2013, 7, 1), LocalDateTime.now());
		dtos.add(satellite63);

		SetelliteDTO satellite64 = new SetelliteDTO("INSAT-3", 35786, 2600.0, true, 'A', (short) 2003, 36789, 1.75f,
				(byte) 5, LocalDate.of(2003, 9, 23), LocalDateTime.now());
		dtos.add(satellite64);

		SetelliteDTO satellite65 = new SetelliteDTO("GSAT-7", 35785, 2300.0, true, 'A', (short) 2013, 37895, 1.47f,
				(byte) 6, LocalDate.of(2013, 8, 30), LocalDateTime.now());
		dtos.add(satellite65);

		SetelliteDTO satellite66 = new SetelliteDTO("Mars Orbiter Mission (MOM)", 377000, 1350.0, true, 'A',
				(short) 2013, 38765, 2.05f, (byte) 4, LocalDate.of(2013, 11, 5), LocalDateTime.now());
		dtos.add(satellite66);

		SetelliteDTO satellite67 = new SetelliteDTO("GSAT-14", 35786, 1982.0, true, 'A', (short) 2013, 36789, 1.88f,
				(byte) 3, LocalDate.of(2013, 8, 28), LocalDateTime.now());
		dtos.add(satellite67);

		SetelliteDTO satellite68 = new SetelliteDTO("IRNSS-1B", 35776, 1425.0, true, 'A', (short) 2014, 36987, 1.42f,
				(byte) 2, LocalDate.of(2014, 4, 4), LocalDateTime.now());
		dtos.add(satellite68);

		SetelliteDTO satellite69 = new SetelliteDTO("IRNSS-1C", 35777, 1425.0, true, 'A', (short) 2014, 36589, 1.39f,
				(byte) 1, LocalDate.of(2014, 10, 16), LocalDateTime.now());
		dtos.add(satellite69);

		SetelliteDTO satellite70 = new SetelliteDTO("GSAT-16", 35777, 3181.0, true, 'A', (short) 2014, 36187, 1.58f,
				(byte) 4, LocalDate.of(2014, 12, 6), LocalDateTime.now());
		dtos.add(satellite70);

		SetelliteDTO satellite71 = new SetelliteDTO("IRNSS-1D", 35786, 1425.0, true, 'A', (short) 2015, 37659, 1.41f,
				(byte) 2, LocalDate.of(2015, 3, 28), LocalDateTime.now());
		dtos.add(satellite71);

		SetelliteDTO satellite72 = new SetelliteDTO("GSAT-6", 35777, 2117.0, true, 'A', (short) 2015, 36895, 1.65f,
				(byte) 3, LocalDate.of(2015, 8, 27), LocalDateTime.now());
		dtos.add(satellite72);

		SetelliteDTO satellite73 = new SetelliteDTO("Astrosat", 650, 1513.0, true, 'A', (short) 2015, 65002, 1.73f,
				(byte) 2, LocalDate.of(2015, 9, 28), LocalDateTime.now());
		dtos.add(satellite73);

		SetelliteDTO satellite74 = new SetelliteDTO("GSAT-15", 35786, 3164.0, true, 'A', (short) 2015, 37685, 1.63f,
				(byte) 3, LocalDate.of(2015, 11, 10), LocalDateTime.now());
		dtos.add(satellite74);

		SetelliteDTO satellite75 = new SetelliteDTO("IRNSS-1E", 35787, 1425.0, true, 'A', (short) 2016, 36548, 1.43f,
				(byte) 2, LocalDate.of(2016, 1, 20), LocalDateTime.now());
		dtos.add(satellite75);

		SetelliteDTO satellite76 = new SetelliteDTO("IRNSS-1", 35776, 1425.0, true, 'A', (short) 2016, 36987, 1.42f,
				(byte) 1, LocalDate.of(2016, 7, 1), LocalDateTime.now());
		dtos.add(satellite76);

		SetelliteDTO satellite77 = new SetelliteDTO("IRNSS-1G", 35786, 1425.0, true, 'A', (short) 2016, 35678, 1.46f,
				(byte) 4, LocalDate.of(2016, 4, 28), LocalDateTime.now());
		dtos.add(satellite77);

		SetelliteDTO satellite78 = new SetelliteDTO("CARTOSAT-2C", 509, 712.0, true, 'A', (short) 2016, 50934, 1.68f,
				(byte) 3, LocalDate.of(2016, 6, 22), LocalDateTime.now());
		dtos.add(satellite78);

		SetelliteDTO satellite79 = new SetelliteDTO("MicroSat-TD", 100, 50.5, true, 'A', (short) 1980, 200000, 500.0f,
				(byte) 5, LocalDate.of(1980, 1, 1), LocalDateTime.now());
		dtos.add(satellite79);

		SetelliteDTO satellite80 = new SetelliteDTO("INSAT-3DR", 100, 50.5, true, 'A', (short) 1980, 200000, 500.0f,
				(byte) 5, LocalDate.of(1980, 1, 1), LocalDateTime.now());
		dtos.add(satellite80);
		SetelliteDTO satellite81 = new SetelliteDTO("SCATSAT-1", 101, 55.5, true, 'B', (short) 1990, 210000, 550.0f,
				(byte) 6, LocalDate.of(1990, 2, 2), LocalDateTime.now());
		dtos.add(satellite81);
		SetelliteDTO satellite82 = new SetelliteDTO("CARTOSAT-2D", 102, 60.5, true, 'C', (short) 2000, 220000, 600.0f,
				(byte) 7, LocalDate.of(2000, 3, 3), LocalDateTime.now());
		dtos.add(satellite82);
		SetelliteDTO satellite83 = new SetelliteDTO("CARTOSAT-2F", 103, 65.5, true, 'D', (short) 2010, 240000, 650.0f,
				(byte) 8, LocalDate.of(2010, 4, 4), LocalDateTime.now());
		dtos.add(satellite83);
		SetelliteDTO satellite84 = new SetelliteDTO("MICROSAT- TD", 104, 70.5, true, 'E', (short) 2020, 260000, 700.0f,
				(byte) 9, LocalDate.of(2020, 5, 5), LocalDateTime.now());
		dtos.add(satellite84);
		SetelliteDTO satellite85 = new SetelliteDTO("INS -1C", 105, 75.5, true, 'F', (short) 1981, 280000, 750.0f,
				(byte) 10, LocalDate.of(1981, 6, 6), LocalDateTime.now());
		dtos.add(satellite85);
		SetelliteDTO satellite86 = new SetelliteDTO("GSAT- 6A", 106, 80.5, true, 'G', (short) 1991, 300000, 800.0f,
				(byte) 11, LocalDate.of(1991, 7, 7), LocalDateTime.now());
		dtos.add(satellite86);
		SetelliteDTO satellite87 = new SetelliteDTO("IRNSS -1I", 107, 85.5, true, 'H', (short) 2001, 320000, 850.0f,
				(byte) 12, LocalDate.of(2001, 8, 8), LocalDateTime.now());
		dtos.add(satellite87);
		SetelliteDTO satellite88 = new SetelliteDTO("GSAT-29", 108, 90.5, true, 'I', (short) 2011, 340000, 900.0f,
				(byte) 13, LocalDate.of(2011, 9, 9), LocalDateTime.now());
		dtos.add(satellite88);
		SetelliteDTO satellite89 = new SetelliteDTO("HySYS", 109, 95.5, true, 'J', (short) 2021, 360000, 950.0f,
				(byte) 14, LocalDate.of(2021, 10, 10), LocalDateTime.now());
		dtos.add(satellite89);
		SetelliteDTO satellite90 = new SetelliteDTO("ExseedSat-1", 110, 100.5, true, 'K', (short) 1982, 380000, 1000.0f,
				(byte) 15, LocalDate.of(1982, 11, 11), LocalDateTime.now());
		dtos.add(satellite90);
		SetelliteDTO satellite91 = new SetelliteDTO("GSAT-11", 111, 105.5, true, 'L', (short) 1992, 400000, 1050.0f,
				(byte) 16, LocalDate.of(1992, 12, 12), LocalDateTime.now());
		dtos.add(satellite91);
		SetelliteDTO satellite92 = new SetelliteDTO("GSAT-7A", 112, 110.5, true, 'M', (short) 2002, 420000, 1100.0f,
				(byte) 17, LocalDate.of(2002, 1, 13), LocalDateTime.now());
		dtos.add(satellite92);
		SetelliteDTO satellite93 = new SetelliteDTO("Microsat-R", 113, 115.5, true, 'N', (short) 2012, 440000, 1150.0f,
				(byte) 18, LocalDate.of(2012, 2, 14), LocalDateTime.now());
		dtos.add(satellite93);
		SetelliteDTO satellite94 = new SetelliteDTO("KalamSAT-V2", 114, 120.5, true, 'O', (short) 2022, 460000, 1200.0f,
				(byte) 19, LocalDate.of(2022, 3, 15), LocalDateTime.now());
		dtos.add(satellite94);
		SetelliteDTO satellite95 = new SetelliteDTO("GSAT-31", 115, 125.5, true, 'P', (short) 1983, 480000, 1250.0f,
				(byte) 20, LocalDate.of(1983, 4, 16), LocalDateTime.now());
		dtos.add(satellite95);
		SetelliteDTO satellite96 = new SetelliteDTO("EMISAT", 116, 130.5, true, 'Q', (short) 1993, 500000, 1300.0f,
				(byte) 21, LocalDate.of(1993, 5, 17), LocalDateTime.now());
		dtos.add(satellite96);
		SetelliteDTO satellite97 = new SetelliteDTO("Chandrayaan-2", 117, 135.5, true, 'R', (short) 2003, 520000,
				1350.0f, (byte) 22, LocalDate.of(2003, 6, 18), LocalDateTime.now());
		dtos.add(satellite97);
		SetelliteDTO satellite98 = new SetelliteDTO("Cartosat-3", 118, 140.5, true, 'S', (short) 2013, 540000, 1400.0f,
				(byte) 23, LocalDate.of(2013, 7, 19), LocalDateTime.now());
		dtos.add(satellite98);
		SetelliteDTO satellite99 = new SetelliteDTO("GSAT-30", 119, 145.5, true, 'T', (short) 2023, 560000, 1450.0f,
				(byte) 24, LocalDate.of(2023, 8, 20), LocalDateTime.now());
		dtos.add(satellite99);

		SetelliteDTO satellite100 = new SetelliteDTO("INS-1C", 100, 50.5, true, 'A', (short) 1980, 200000, 500.0f,
				(byte) 5, LocalDate.of(1980, 1, 1), LocalDateTime.now());
		dtos.add(satellite100);

		SetelliteDTO setellite101 = new SetelliteDTO("Iris-SP", 101, 50.5, true, 'A', (short) 1980, 140000, 500.0f,
				(byte) 5, LocalDate.of(1945, 1, 1), LocalDateTime.now());
		dtos.add(setellite101);
		SetelliteDTO setellite102 = new SetelliteDTO("Starshade", 102, 55.5, true, 'B', (short) 1980, 204000, 500.0f,
				(byte) 5, LocalDate.of(1987, 1, 8), LocalDateTime.now());
		dtos.add(setellite102);
		SetelliteDTO setellite103 = new SetelliteDTO("Planetary-CubeSat 2.0", 103, 40.5, true, 'A', (short) 1980,
				200000, 500.0f, (byte) 5, LocalDate.of(1980, 1, 11), LocalDateTime.now());
		dtos.add(setellite103);
		SetelliteDTO setellite104 = new SetelliteDTO("FREEDOM-SP", 104, 50.5, true, 'A', (short) 1980, 200000, 320.0f,
				(byte) 5, LocalDate.of(1942, 11, 1), LocalDateTime.now());
		dtos.add(setellite104);
		SetelliteDTO setellite105 = new SetelliteDTO("Starlight and Optical Ground Labs", 105, 50.5, true, 'A',
				(short) 1980, 200450, 500.0f, (byte) 5, LocalDate.of(1978, 1, 10), LocalDateTime.now());
		dtos.add(setellite105);
		SetelliteDTO setellite106 = new SetelliteDTO("Juno", 120, 50.5, true, 'D', (short) 1980, 200000, 300.0f,
				(byte) 5, LocalDate.of(1996, 1, 1), LocalDateTime.now());
		dtos.add(setellite106);
		SetelliteDTO setellite107 = new SetelliteDTO("VIPERS-SP", 106, 50.5, true, 'Y', (short) 1980, 200000, 130.0f,
				(byte) 5, LocalDate.of(1979, 1, 1), LocalDateTime.now());
		dtos.add(setellite107);
		SetelliteDTO setellite108 = new SetelliteDTO("GLEAM-SP", 107, 50.5, true, 'C', (short) 1980, 200000, 700.0f,
				(byte) 5, LocalDate.of(185, 1, 1), LocalDateTime.now());
		dtos.add(setellite108);
		SetelliteDTO setellite109 = new SetelliteDTO("NEEMO", 108, 50.5, true, 'T', (short) 1988, 200000, 580.0f,
				(byte) 5, LocalDate.of(1988, 1, 1), LocalDateTime.now());
		dtos.add(setellite109);
		SetelliteDTO setellite110 = new SetelliteDTO("ARTEMIS-SP", 109, 50.5, false, 'A', (short) 1983, 2458000, 500.0f,
				(byte) 5, LocalDate.of(1983, 1, 1), LocalDateTime.now());
		dtos.add(setellite110);
		SetelliteDTO setellite111 = new SetelliteDTO("LADEE", 110, 50.5, false, 'A', (short) 1990, 96000, 475.0f,
				(byte) 5, LocalDate.of(1990, 11, 1), LocalDateTime.now());
		dtos.add(setellite111);
		SetelliteDTO setellite112 = new SetelliteDTO("CRISM", 111, 50.5, false, 'H', (short) 1998, 300000, 480.0f,
				(byte) 5, LocalDate.of(1998, 7, 11), LocalDateTime.now());
		dtos.add(setellite112);
		SetelliteDTO setellite113 = new SetelliteDTO("DAWN", 112, 30.5, true, 'O', (short) 2000, 650000, 400.0f,
				(byte) 5, LocalDate.of(2000, 8, 1), LocalDateTime.now());
		dtos.add(setellite113);
		SetelliteDTO setellite114 = new SetelliteDTO("Dragonfly", 113, 46.5, false, 'P', (short) 2001, 380000, 570.0f,
				(byte) 5, LocalDate.of(2001, 4, 4), LocalDateTime.now());
		dtos.add(setellite114);
		SetelliteDTO setellite115 = new SetelliteDTO("Deep Space Transport (DST)", 114, 50.5, true, 'A', (short) 1980,
				780000, 520.0f, (byte) 5, LocalDate.of(1980, 11, 11), LocalDateTime.now());
		dtos.add(setellite115);
		SetelliteDTO setellite116 = new SetelliteDTO("CHIPS", 115, 57.5, true, 'I', (short) 2002, 160000, 850.0f,
				(byte) 5, LocalDate.of(2002, 5, 12), LocalDateTime.now());
		dtos.add(setellite116);
		SetelliteDTO setellite117 = new SetelliteDTO("DART", 116, 20.5, false, 'L', (short) 2005, 780000, 520.0f,
				(byte) 5, LocalDate.of(2005, 1, 1), LocalDateTime.now());
		dtos.add(setellite117);
		SetelliteDTO setellite118 = new SetelliteDTO("Ionospheric Connections and Climate of Mars", 117, 50.5, true,
				'N', (short) 2000, 100000, 500.0f, (byte) 5, LocalDate.of(2000, 11, 1), LocalDateTime.now());
		dtos.add(setellite118);
		SetelliteDTO setellite119 = new SetelliteDTO("Van Allen Probes", 118, 66.5, false, 'E', (short) 1900, 180000,
				500.0f, (byte) 5, LocalDate.of(1900, 4, 21), LocalDateTime.now());
		dtos.add(setellite119);
		SetelliteDTO setellite120 = new SetelliteDTO("Deep Impact", 119, 32.5, false, 'D', (short) 2014, 160000, 500.0f,
				(byte) 5, LocalDate.of(2014, 4, 11), LocalDateTime.now());
		dtos.add(setellite120);

		SetelliteDTO satellite121 = new SetelliteDTO("SES-13 (NUSAT)", 121, 71.5, true, 'D', (short) 2000, 230000,
				800.0f, (byte) 8, LocalDate.of(2000, 5, 10), LocalDateTime.now());
		dtos.add(satellite121);

		SetelliteDTO satellite122 = new SetelliteDTO("Intelsat 37e (SABRIN)", 122, 72.5, true, 'E', (short) 2005,
				240000, 900.0f, (byte) 9, LocalDate.of(2005, 7, 20), LocalDateTime.now());
		dtos.add(satellite122);

		SetelliteDTO satellite123 = new SetelliteDTO("Galaxy 20 (GSAT-6A)", 123, 73.5, true, 'F', (short) 2010, 250000,
				1000.0f, (byte) 10, LocalDate.of(2010, 10, 15), LocalDateTime.now());
		dtos.add(satellite123);

		SetelliteDTO satellite124 = new SetelliteDTO("Star One C4 (S-31)", 124, 74.5, true, 'G', (short) 2015, 260000,
				1100.0f, (byte) 11, LocalDate.of(2015, 2, 28), LocalDateTime.now());
		dtos.add(satellite124);

		SetelliteDTO satellite125 = new SetelliteDTO("SaudiGeoSat-1 (KACST)", 125, 75.5, true, 'H', (short) 2020,
				270000, 1200.0f, (byte) 12, LocalDate.of(2020, 5, 1), LocalDateTime.now());
		dtos.add(satellite125);

		SetelliteDTO satellite126 = new SetelliteDTO("IGS-10 (INFORMATION GEOGRAPHIC SYSTEM SATELLITE)", 126, 76.5,
				true, 'I', (short) 2025, 280000, 1300.0f, (byte) 13, LocalDate.of(2025, 7, 15), LocalDateTime.now());
		dtos.add(satellite126);

		SetelliteDTO satellite127 = new SetelliteDTO("Innovatision 1 (Innovatision-1)", 127, 77.5, true, 'J',
				(short) 2030, 290000, 1400.0f, (byte) 14, LocalDate.of(2030, 8, 20), LocalDateTime.now());
		dtos.add(satellite127);

		SetelliteDTO satellite128 = new SetelliteDTO("HISAT-2 (HILLI-SAT-2)", 128, 78.5, true, 'K', (short) 2035,
				300000, 1500.0f, (byte) 15, LocalDate.of(2035, 10, 30), LocalDateTime.now());
		dtos.add(satellite128);

		SetelliteDTO satellite129 = new SetelliteDTO("Space-O1 No.3 (KACST-SAT No.3)", 129, 79.5, true, 'L',
				(short) 2040, 310000, 1600.0f, (byte) 16, LocalDate.of(2040, 12, 31), LocalDateTime.now());
		dtos.add(satellite129);

		SetelliteDTO satellite130 = new SetelliteDTO("Intelsat 37d (SABRIN)", 130, 80.5, true, 'M', (short) 2045,
				320000, 1700.0f, (byte) 17, LocalDate.of(2045, 1, 1), LocalDateTime.now());
		dtos.add(satellite130);

		SetelliteDTO satellite131 = new SetelliteDTO("O3b 256 (KepOp-45)", 131, 81.5, true, 'N', (short) 2050, 330000,
				1800.0f, (byte) 18, LocalDate.of(2050, 2, 15), LocalDateTime.now());
		dtos.add(satellite131);

		SetelliteDTO satellite132 = new SetelliteDTO("OSCAR 31 (CSA-OSCAR)", 132, 82.5, true, 'O', (short) 2055, 340000,
				1900.0f, (byte) 19, LocalDate.of(2055, 4, 30), LocalDateTime.now());
		dtos.add(satellite132);

		SetelliteDTO satellite133 = new SetelliteDTO("Dove 3 (PMC-Sat)", 133, 83.5, true, 'P', (short) 2060, 350000,
				2000.0f, (byte) 20, LocalDate.of(2060, 6, 1), LocalDateTime.now());
		dtos.add(satellite133);

		SetelliteDTO satellite134 = new SetelliteDTO("Amos 24 (AMSAT)", 134, 84.5, true, 'Q', (short) 2065, 360000,
				2100.0f, (byte) 21, LocalDate.of(2065, 7, 10), LocalDateTime.now());
		dtos.add(satellite134);

		SetelliteDTO satellite135 = new SetelliteDTO("OSCAR 25 (CSA-OSCAR)", 135, 85.5, true, 'R', (short) 2070, 370000,
				2200.0f, (byte) 22, LocalDate.of(2070, 8, 15), LocalDateTime.now());
		dtos.add(satellite135);

		SetelliteDTO satellite136 = new SetelliteDTO("MORGAN (MEXNET-2)", 136, 86.5, true, 'S', (short) 2075, 380000,
				2300.0f, (byte) 23, LocalDate.of(2075, 9, 20), LocalDateTime.now());
		dtos.add(satellite136);

		SetelliteDTO satellite137 = new SetelliteDTO("Wise 2021 (Space Engineering Satellite-1)", 137, 87.5, true, 'T',
				(short) 2080, 390000, 2400.0f, (byte) 24, LocalDate.of(2080, 10, 25), LocalDateTime.now());
		dtos.add(satellite137);

		SetelliteDTO satellite138 = new SetelliteDTO("Satnoi-R 24", 138, 88.5, true, 'U', (short) 2085, 400000, 2500.0f,
				(byte) 25, LocalDate.of(2085, 11, 30), LocalDateTime.now());
		dtos.add(satellite138);

		SetelliteDTO satellite139 = new SetelliteDTO("Star One C2 (S-29)", 139, 89.5, true, 'V', (short) 2090, 410000,
				2600.0f, (byte) 26, LocalDate.of(2090, 12, 31), LocalDateTime.now());
		dtos.add(satellite139);

		SetelliteDTO satellite140 = new SetelliteDTO("Innovatision 2 (Innovatision-2)", 140, 90.5, true, 'W',
				(short) 2095, 420000, 2700.0f, (byte) 27, LocalDate.of(2095, 1, 1), LocalDateTime.now());
		dtos.add(satellite140);

		SetelliteDTO satellite141 = new SetelliteDTO("Dove 4 (PMC-Sat)", 141, 91.5, true, 'X', (short) 2100, 430000,
				2800.0f, (byte) 28, LocalDate.of(2100, 2, 10), LocalDateTime.now());
		dtos.add(satellite141);

		SetelliteDTO satellite142 = new SetelliteDTO("Dove 2 (PMC-Sat)", 142, 92.5, true, 'Y', (short) 2105, 440000,
				2900.0f, (byte) 29, LocalDate.of(2105, 4, 15), LocalDateTime.now());
		dtos.add(satellite142);

		SetelliteDTO satellite143 = new SetelliteDTO("Nayif-1 (Saudi-Satellite-1)", 143, 93.5, true, 'Z', (short) 2110,
				450000, 3000.0f, (byte) 30, LocalDate.of(2110, 6, 20), LocalDateTime.now());
		dtos.add(satellite143);

		SetelliteDTO satellite144 = new SetelliteDTO("Hisat 25 (HILLI-SAT-25)", 144, 94.5, true, 'A', (short) 2115,
				460000, 3100.0f, (byte) 31, LocalDate.of(2115, 8, 25), LocalDateTime.now());
		dtos.add(satellite144);

		SetelliteDTO satellite145 = new SetelliteDTO("TN-47 (Nayif-2)", 145, 95.5, true, 'B', (short) 2120, 470000,
				3200.0f, (byte) 32, LocalDate.of(2120, 10, 30), LocalDateTime.now());
		dtos.add(satellite145);

		SetelliteDTO satellite146 = new SetelliteDTO("BT-1 (SAFER-SKY)", 146, 96.5, true, 'C', (short) 2125, 480000,
				3300.0f, (byte) 33, LocalDate.of(2125, 12, 31), LocalDateTime.now());
		dtos.add(satellite146);

		SetelliteDTO satellite147 = new SetelliteDTO("JCSAT-16 (JSAT-16)", 147, 97.5, true, 'D', (short) 2130, 490000,
				3400.0f, (byte) 34, LocalDate.of(2130, 1, 1), LocalDateTime.now());
		dtos.add(satellite147);

		SetelliteDTO satellite148 = new SetelliteDTO("WISE 2017 (Space Engineering Satellite-2)", 148, 98.5, true, 'E',
				(short) 2135, 500000, 3500.0f, (byte) 35, LocalDate.of(2135, 2, 10), LocalDateTime.now());
		dtos.add(satellite148);

		SetelliteDTO satellite149 = new SetelliteDTO("SaudiSat 1R (S-1R)", 149, 99.5, true, 'F', (short) 2140, 510000,
				3600.0f, (byte) 36, LocalDate.of(2140, 3, 20), LocalDateTime.now());
		dtos.add(satellite149);

		SetelliteDTO satellite150 = new SetelliteDTO("Iridium Next 24", 150, 100.5, true, 'G', (short) 2145, 520000,
				3700.0f, (byte) 37, LocalDate.of(2145, 4, 25), LocalDateTime.now());
		dtos.add(satellite150);

		SetelliteDTO satellite151 = new SetelliteDTO("OneWeb 15 (Galaxy 15)", 151, 75.5, true, 'D', (short) 2000,
				230000, 800.0f, (byte) 8, LocalDate.of(2000, 1, 1), LocalDateTime.now());
		dtos.add(satellite151);

		SetelliteDTO satellite152 = new SetelliteDTO("Satellite for Promotion of Industry and Innovation-1 (PROIND-1)",
				152, 85.5, true, 'E', (short) 2001, 240000, 900.0f, (byte) 9, LocalDate.of(2001, 2, 15),
				LocalDateTime.now());
		dtos.add(satellite152);

		SetelliteDTO satellite153 = new SetelliteDTO("Intelsat 36e (SABRIN)", 153, 95.5, true, 'F', (short) 2002,
				250000, 1000.0f, (byte) 10, LocalDate.of(2002, 3, 30), LocalDateTime.now());
		dtos.add(satellite153);

		SetelliteDTO satellite154 = new SetelliteDTO("Telesat-9 (CSA-37)", 154, 105.5, true, 'G', (short) 2003, 260000,
				1100.0f, (byte) 11, LocalDate.of(2003, 4, 20), LocalDateTime.now());
		dtos.add(satellite154);

		SetelliteDTO satellite155 = new SetelliteDTO("HISAT 22 (HILLI-SAT-22)", 155, 115.5, true, 'H', (short) 2004,
				270000, 1200.0f, (byte) 12, LocalDate.of(2004, 5, 10), LocalDateTime.now());
		dtos.add(satellite155);

		SetelliteDTO satellite156 = new SetelliteDTO("CBERS-701 (China-Brazil Earth Resources Satellite-701)", 156,
				125.5, true, 'I', (short) 2005, 280000, 1300.0f, (byte) 13, LocalDate.of(2005, 6, 15),
				LocalDateTime.now());
		dtos.add(satellite156);

		SetelliteDTO satellite157 = new SetelliteDTO("Amos 25 (AMSAT)", 157, 135.5, true, 'J', (short) 2006, 290000,
				1400.0f, (byte) 14, LocalDate.of(2006, 7, 25), LocalDateTime.now());
		dtos.add(satellite157);

		SetelliteDTO satellite158 = new SetelliteDTO("Innovatision 3 (Innovatision-3)", 158, 145.5, true, 'K',
				(short) 2007, 300000, 1500.0f, (byte) 15, LocalDate.of(2007, 8, 15), LocalDateTime.now());
		dtos.add(satellite158);

		SetelliteDTO satellite159 = new SetelliteDTO("MXM (Marshall X-ray Observatory)", 159, 155.5, true, 'L',
				(short) 2008, 310000, 1600.0f, (byte) 16, LocalDate.of(2008, 9, 10), LocalDateTime.now());
		dtos.add(satellite159);

		SetelliteDTO satellite160 = new SetelliteDTO("KT-5 (KT-5)", 160, 165.5, true, 'M', (short) 2009, 320000,
				1700.0f, (byte) 17, LocalDate.of(2009, 10, 5), LocalDateTime.now());
		dtos.add(satellite160);

		SetelliteDTO satellite161 = new SetelliteDTO("XTS-106 (South Africa Satellite Launch and Tracking System)", 161,
				175.5, true, 'N', (short) 2010, 330000, 1800.0f, (byte) 18, LocalDate.of(2010, 11, 20),
				LocalDateTime.now());
		dtos.add(satellite161);

		SetelliteDTO satellite162 = new SetelliteDTO("JCSAT-17 (JSAT-17)", 162, 185.5, true, 'O', (short) 2011, 340000,
				1900.0f, (byte) 19, LocalDate.of(2011, 12, 15), LocalDateTime.now());
		dtos.add(satellite162);

		SetelliteDTO satellite163 = new SetelliteDTO("AISAT-2 (AI SAT-2)", 163, 195.5, true, 'P', (short) 2012, 350000,
				2000.0f, (byte) 20, LocalDate.of(2012, 1, 31), LocalDateTime.now());
		dtos.add(satellite163);

		SetelliteDTO satellite164 = new SetelliteDTO("Astra 10E (10E)", 164, 205.5, true, 'Q', (short) 2013, 360000,
				2100.0f, (byte) 21, LocalDate.of(2013, 2, 28), LocalDateTime.now());
		dtos.add(satellite164);

		SetelliteDTO satellite165 = new SetelliteDTO("MILAN (MILAN)", 165, 215.5, true, 'R', (short) 2014, 370000,
				2200.0f, (byte) 22, LocalDate.of(2014, 3, 15), LocalDateTime.now());
		dtos.add(satellite165);

		SetelliteDTO satellite166 = new SetelliteDTO("O3b 255 (KepOp-44)", 166, 225.5, true, 'S', (short) 2015, 380000,
				2300.0f, (byte) 23, LocalDate.of(2015, 4, 5), LocalDateTime.now());
		dtos.add(satellite166);

		SetelliteDTO satellite167 = new SetelliteDTO("BT-2 (SAFER-SKY)", 167, 235.5, true, 'T', (short) 2016, 390000,
				2400.0f, (byte) 24, LocalDate.of(2016, 5, 20), LocalDateTime.now());
		dtos.add(satellite167);

		SetelliteDTO satellite168 = new SetelliteDTO("AESSAT-1 (Australian Early Stage Satellite)", 168, 245.5, true,
				'U', (short) 2017, 400000, 2500.0f, (byte) 25, LocalDate.of(2017, 6, 30), LocalDateTime.now());
		dtos.add(satellite168);

		SetelliteDTO satellite169 = new SetelliteDTO("Amos 23 (AMSAT)", 169, 255.5, true, 'V', (short) 2018, 410000,
				2600.0f, (byte) 26, LocalDate.of(2018, 7, 10), LocalDateTime.now());
		dtos.add(satellite169);

		SetelliteDTO satellite170 = new SetelliteDTO("MDA XM (EduSat-MDA XM)", 170, 265.5, true, 'W', (short) 2019,
				420000, 2700.0f, (byte) 27, LocalDate.of(2019, 8, 31), LocalDateTime.now());
		dtos.add(satellite170);

		SetelliteDTO satellite171 = new SetelliteDTO("Sputnik 1", 100, 50.5, true, 'A', (short) 1957, 200000, 500.0f,
				(byte) 5, LocalDate.of(1957, 10, 4), LocalDateTime.now());
		dtos.add(satellite171);

		SetelliteDTO satellite172 = new SetelliteDTO("Sputnik 2", 110, 60.5, true, 'B', (short) 1957, 210000, 600.0f,
				(byte) 6, LocalDate.of(1957, 11, 3), LocalDateTime.now());
		dtos.add(satellite172);

		SetelliteDTO satellite173 = new SetelliteDTO("Luna-3", 120, 70.5, true, 'C', (short) 1959, 220000, 700.0f,
				(byte) 7, LocalDate.of(1959, 10, 4), LocalDateTime.now());
		dtos.add(satellite173);

		SetelliteDTO satellite174 = new SetelliteDTO("Luna-2", 130, 80.5, true, 'D', (short) 1959, 230000, 800.0f,
				(byte) 8, LocalDate.of(1959, 9, 12), LocalDateTime.now());
		dtos.add(satellite174);

		SetelliteDTO satellite175 = new SetelliteDTO("Vostok 1", 140, 90.5, true, 'E', (short) 1961, 240000, 900.0f,
				(byte) 9, LocalDate.of(1961, 4, 12), LocalDateTime.now());
		dtos.add(satellite175);

		SetelliteDTO satellite176 = new SetelliteDTO("Luna 2", 150, 100.5, true, 'F', (short) 1959, 250000, 1000.0f,
				(byte) 10, LocalDate.of(1959, 9, 12), LocalDateTime.now());
		dtos.add(satellite176);

		SetelliteDTO satellite177 = new SetelliteDTO("Soyuz 1", 160, 110.5, true, 'G', (short) 1967, 260000, 1100.0f,
				(byte) 11, LocalDate.of(1967, 4, 23), LocalDateTime.now());
		dtos.add(satellite177);

		SetelliteDTO satellite178 = new SetelliteDTO("Molniya 1", 170, 120.5, true, 'H', (short) 1965, 270000, 1200.0f,
				(byte) 12, LocalDate.of(1965, 4, 23), LocalDateTime.now());
		dtos.add(satellite178);

		SetelliteDTO satellite179 = new SetelliteDTO("Cosmos 2251", 180, 130.5, true, 'I', (short) 1993, 280000,
				1300.0f, (byte) 13, LocalDate.of(1993, 12, 23), LocalDateTime.now());
		dtos.add(satellite179);

		SetelliteDTO satellite180 = new SetelliteDTO("Zond 5", 190, 140.5, true, 'J', (short) 1968, 290000, 1400.0f,
				(byte) 14, LocalDate.of(1968, 9, 15), LocalDateTime.now());
		dtos.add(satellite180);

		SetelliteDTO satellite181 = new SetelliteDTO("Mars 3", 200, 150.5, true, 'K', (short) 1971, 300000, 1500.0f,
				(byte) 15, LocalDate.of(1971, 5, 28), LocalDateTime.now());
		dtos.add(satellite181);

		SetelliteDTO satellite182 = new SetelliteDTO("Cosmos 954", 210, 160.5, true, 'L', (short) 1977, 310000, 1600.0f,
				(byte) 16, LocalDate.of(1977, 8, 19), LocalDateTime.now());
		dtos.add(satellite182);

		SetelliteDTO satellite183 = new SetelliteDTO("Mir", 220, 170.5, true, 'M', (short) 1986, 320000, 1700.0f,
				(byte) 17, LocalDate.of(1986, 2, 20), LocalDateTime.now());
		dtos.add(satellite183);

		SetelliteDTO satellite184 = new SetelliteDTO("Soyuz TMA-13", 230, 180.5, true, 'N', (short) 2008, 330000,
				1800.0f, (byte) 18, LocalDate.of(2008, 10, 12), LocalDateTime.now());
		dtos.add(satellite184);

		SetelliteDTO satellite185 = new SetelliteDTO("ISS (International Space Station) Modules", 240, 190.5, true, 'O',
				(short) 1998, 340000, 1900.0f, (byte) 19, LocalDate.of(1998, 11, 20), LocalDateTime.now());
		dtos.add(satellite185);

		SetelliteDTO satellite186 = new SetelliteDTO("GLONASS Satellites (Various)", 250, 200.5, true, 'P',
				(short) 1982, 350000, 2000.0f, (byte) 20, LocalDate.of(1982, 4, 12), LocalDateTime.now());
		dtos.add(satellite186);

		SetelliteDTO satellite187 = new SetelliteDTO("Elektro-L", 260, 210.5, true, 'Q', (short) 2011, 360000, 2100.0f,
				(byte) 21, LocalDate.of(2011, 1, 20), LocalDateTime.now());
		dtos.add(satellite187);

		SetelliteDTO satellite188 = new SetelliteDTO("Resurs-P", 270, 220.5, true, 'R', (short) 2013, 370000, 2200.0f,
				(byte) 22, LocalDate.of(2013, 5, 22), LocalDateTime.now());
		dtos.add(satellite188);

		SetelliteDTO satellite189 = new SetelliteDTO("Raduga", 280, 230.5, true, 'S', (short) 1975, 380000, 2300.0f,
				(byte) 23, LocalDate.of(1975, 12, 16), LocalDateTime.now());
		dtos.add(satellite189);

		SetelliteDTO satellite190 = new SetelliteDTO("Meteor", 290, 240.5, true, 'T', (short) 1969, 390000, 2400.0f,
				(byte) 24, LocalDate.of(1969, 3, 9), LocalDateTime.now());
		dtos.add(satellite190);

		SetelliteDTO satellite191 = new SetelliteDTO("BeiDou-3 (BDS-3) Navigation Satellites", 100, 50.5, true, 'D',
				(short) 2015, 200000, 500.0f, (byte) 5, LocalDate.of(2015, 1, 1), LocalDateTime.now());
		dtos.add(satellite191);

		SetelliteDTO satellite192 = new SetelliteDTO("Gaofen Earth Observation Satellites", 110, 60.5, true, 'E',
				(short) 2010, 210000, 600.0f, (byte) 6, LocalDate.of(2010, 2, 15), LocalDateTime.now());
		dtos.add(satellite192);

		SetelliteDTO satellite193 = new SetelliteDTO("Tianlian Data Relay Satellites", 120, 70.5, true, 'F',
				(short) 2005, 220000, 700.0f, (byte) 7, LocalDate.of(2005, 4, 30), LocalDateTime.now());
		dtos.add(satellite193);

		SetelliteDTO satellite194 = new SetelliteDTO("Chinasat Communication Satellites", 130, 80.5, true, 'G',
				(short) 2000, 230000, 800.0f, (byte) 8, LocalDate.of(2000, 6, 15), LocalDateTime.now());
		dtos.add(satellite194);

		SetelliteDTO satellite195 = new SetelliteDTO("Shijian Scientific Satellites", 140, 90.5, true, 'H',
				(short) 1995, 240000, 900.0f, (byte) 9, LocalDate.of(1995, 8, 30), LocalDateTime.now());
		dtos.add(satellite195);

		SetelliteDTO satellite196 = new SetelliteDTO("Fengyun Weather Satellites", 150, 100.5, true, 'I', (short) 1990,
				250000, 1000.0f, (byte) 10, LocalDate.of(1990, 10, 1), LocalDateTime.now());
		dtos.add(satellite196);

		SetelliteDTO satellite197 = new SetelliteDTO("Ziyuan Earth Observation Satellites", 160, 110.5, true, 'J',
				(short) 1990, 260000, 1100.0f, (byte) 11, LocalDate.of(1990, 12, 15), LocalDateTime.now());
		dtos.add(satellite197);

		SetelliteDTO satellite198 = new SetelliteDTO("TanSat", 170, 120.5, true, 'K', (short) 2016, 270000, 1200.0f,
				(byte) 12, LocalDate.of(2016, 5, 23), LocalDateTime.now());
		dtos.add(satellite198);

		SetelliteDTO satellite199 = new SetelliteDTO("Queqiao", 180, 130.5, true, 'L', (short) 2018, 280000, 1300.0f,
				(byte) 13, LocalDate.of(2018, 12, 31), LocalDateTime.now());
		dtos.add(satellite199);

		SetelliteDTO satellite200 = new SetelliteDTO("Chang'e Lunar Exploration Satellites", 190, 140.5, true, 'M',
				(short) 2007, 290000, 1400.0f, (byte) 14, LocalDate.of(2007, 6, 14), LocalDateTime.now());
		dtos.add(satellite200);

		SetelliteDTO satellite201 = new SetelliteDTO("Hubble-class Space Telescope", 200, 150.5, true, 'N',
				(short) 1990, 300000, 1500.0f, (byte) 15, LocalDate.of(1990, 4, 24), LocalDateTime.now());
		dtos.add(satellite201);

		SetelliteDTO satellite202 = new SetelliteDTO("X-ray Space Observatory", 210, 160.5, true, 'O', (short) 1999,
				310000, 1600.0f, (byte) 16, LocalDate.of(1999, 7, 23), LocalDateTime.now());
		dtos.add(satellite202);

		SetelliteDTO satellite203 = new SetelliteDTO("Kuaizhou and Long March Satellites", 220, 170.5, true, 'P',
				(short) 2013, 320000, 1700.0f, (byte) 17, LocalDate.of(2013, 11, 21), LocalDateTime.now());
		dtos.add(satellite203);

		SetelliteDTO satellite204 = new SetelliteDTO("Tianhe Core Module", 230, 180.5, true, 'Q', (short) 2021, 330000,
				1800.0f, (byte) 18, LocalDate.of(2021, 4, 29), LocalDateTime.now());
		dtos.add(satellite204);

		SetelliteDTO satellite205 = new SetelliteDTO("Shenzhou Crewed Spacecraft", 240, 190.5, true, 'R', (short) 2003,
				340000, 1900.0f, (byte) 19, LocalDate.of(2003, 10, 15), LocalDateTime.now());
		dtos.add(satellite205);

		SetelliteDTO satellite206 = new SetelliteDTO("Tiangong Space Laboratory", 250, 200.5, true, 'S', (short) 2011,
				350000, 2000.0f, (byte) 20, LocalDate.of(2011, 9, 29), LocalDateTime.now());
		dtos.add(satellite206);

		SetelliteDTO satellite207 = new SetelliteDTO("Tianzhou Cargo Spacecraft", 260, 210.5, true, 'T', (short) 2017,
				360000, 2100.0f, (byte) 21, LocalDate.of(2017, 4, 20), LocalDateTime.now());
		dtos.add(satellite207);

		SetelliteDTO satellite208 = new SetelliteDTO("Tianbing-2 Space Tracking Ship", 270, 220.5, true, 'U',
				(short) 2016, 370000, 2200.0f, (byte) 22, LocalDate.of(2016, 10, 15), LocalDateTime.now());
		dtos.add(satellite208);

		SetelliteDTO satellite209 = new SetelliteDTO("Quantum Science Satellite (QUESS)", 280, 230.5, true, 'V',
				(short) 2016, 380000, 2300.0f, (byte) 23, LocalDate.of(2016, 8, 16), LocalDateTime.now());
		dtos.add(satellite209);

		SetelliteDTO satellite210 = new SetelliteDTO("Chang Zheng (Long March) Rocket Family", 290, 240.5, true, 'W',
				(short) 1970, 390000, 2400.0f, (byte) 24, LocalDate.of(1970, 4, 24), LocalDateTime.now());
		dtos.add(satellite210);

		SetelliteDTO satellite211 = new SetelliteDTO("Himawari-8", 211, 50.5, true, 'A', (short) 2000, 200000, 500.0f,
				(byte) 5, LocalDate.of(2000, 1, 1), LocalDateTime.now());
		dtos.add(satellite211);

		SetelliteDTO satellite212 = new SetelliteDTO("Himawari-9", 212, 60.5, true, 'B', (short) 2001, 210000, 600.0f,
				(byte) 6, LocalDate.of(2001, 2, 15), LocalDateTime.now());
		dtos.add(satellite212);

		SetelliteDTO satellite213 = new SetelliteDTO("QZS-1 (Michibiki-1)", 213, 70.5, true, 'C', (short) 2002, 220000,
				700.0f, (byte) 7, LocalDate.of(2002, 4, 30), LocalDateTime.now());
		dtos.add(satellite213);

		SetelliteDTO satellite214 = new SetelliteDTO("QZS-2 (Michibiki-2)", 214, 80.5, true, 'D', (short) 2003, 230000,
				800.0f, (byte) 8, LocalDate.of(2003, 6, 10), LocalDateTime.now());
		dtos.add(satellite214);

		SetelliteDTO satellite215 = new SetelliteDTO("QZS-3 (Michibiki-3)", 215, 90.5, true, 'E', (short) 2004, 240000,
				900.0f, (byte) 9, LocalDate.of(2004, 8, 20), LocalDateTime.now());
		dtos.add(satellite215);

		SetelliteDTO satellite216 = new SetelliteDTO("QZS-4 (Michibiki-4)", 216, 100.5, true, 'F', (short) 2005, 250000,
				1000.0f, (byte) 10, LocalDate.of(2005, 10, 30), LocalDateTime.now());
		dtos.add(satellite216);

		SetelliteDTO satellite217 = new SetelliteDTO("ALOS-2 (DAICHI-2)", 217, 110.5, true, 'G', (short) 2006, 260000,
				1100.0f, (byte) 11, LocalDate.of(2006, 12, 10), LocalDateTime.now());
		dtos.add(satellite217);

		SetelliteDTO satellite218 = new SetelliteDTO("Hayabusa", 218, 120.5, true, 'H', (short) 2007, 270000, 1200.0f,
				(byte) 12, LocalDate.of(2007, 2, 20), LocalDateTime.now());
		dtos.add(satellite218);

		SetelliteDTO satellite219 = new SetelliteDTO("Hayabusa2", 219, 130.5, true, 'I', (short) 2008, 280000, 1300.0f,
				(byte) 13, LocalDate.of(2008, 4, 30), LocalDateTime.now());
		dtos.add(satellite219);

		SetelliteDTO satellite220 = new SetelliteDTO("Akari (ASTRO-F)", 220, 140.5, true, 'J', (short) 2009, 290000,
				1400.0f, (byte) 14, LocalDate.of(2009, 6, 10), LocalDateTime.now());
		dtos.add(satellite220);

		SetelliteDTO satellite221 = new SetelliteDTO("RAPISAT-1", 221, 150.5, true, 'K', (short) 2010, 300000, 1500.0f,
				(byte) 15, LocalDate.of(2010, 8, 20), LocalDateTime.now());
		dtos.add(satellite221);

		SetelliteDTO satellite222 = new SetelliteDTO("RAPISAT-2", 222, 160.5, true, 'L', (short) 2011, 310000, 1600.0f,
				(byte) 16, LocalDate.of(2011, 10, 30), LocalDateTime.now());
		dtos.add(satellite222);

		SetelliteDTO satellite223 = new SetelliteDTO("RAPISAT-3", 223, 170.5, true, 'M', (short) 2012, 320000, 1700.0f,
				(byte) 17, LocalDate.of(2012, 12, 10), LocalDateTime.now());
		dtos.add(satellite223);

		SetelliteDTO satellite224 = new SetelliteDTO("TSUBAME (SLATS)", 224, 180.5, true, 'N', (short) 2013, 330000,
				1800.0f, (byte) 18, LocalDate.of(2013, 2, 20), LocalDateTime.now());
		dtos.add(satellite224);

		SetelliteDTO satellite225 = new SetelliteDTO("SDS-1 (Superbird-A)", 225, 190.5, true, 'O', (short) 2014, 340000,
				1900.0f, (byte) 19, LocalDate.of(2014, 4, 30), LocalDateTime.now());
		dtos.add(satellite225);

		SetelliteDTO satellite226 = new SetelliteDTO("SDS-2 (Superbird-B)", 226, 200.5, true, 'P', (short) 2015, 350000,
				2000.0f, (byte) 20, LocalDate.of(2015, 6, 10), LocalDateTime.now());
		dtos.add(satellite226);

		SetelliteDTO satellite227 = new SetelliteDTO("SDS-3 (Superbird-C)", 227, 210.5, true, 'Q', (short) 2016, 360000,
				2100.0f, (byte) 21, LocalDate.of(2016, 8, 20), LocalDateTime.now());
		dtos.add(satellite227);

		SetelliteDTO satellite228 = new SetelliteDTO("KIZUNA (WINDS)", 228, 220.5, true, 'R', (short) 2017, 370000,
				2200.0f, (byte) 22, LocalDate.of(2017, 10, 30), LocalDateTime.now());
		dtos.add(satellite228);

		SetelliteDTO satellite229 = new SetelliteDTO("TANSU (TSUBAME)", 229, 230.5, true, 'S', (short) 2018, 380000,
				2300.0f, (byte) 23, LocalDate.of(2018, 12, 10), LocalDateTime.now());
		dtos.add(satellite229);

		SetelliteDTO satellite230 = new SetelliteDTO("UNIFORM (REIMEI)", 230, 240.5, true, 'T', (short) 2019, 390000,
				2400.0f, (byte) 24, LocalDate.of(2019, 2, 20), LocalDateTime.now());
		dtos.add(satellite230);

		SetelliteDTO satellite231 = new SetelliteDTO("SPRINT-A", 231, 250.5, true, 'U', (short) 2020, 400000, 2500.0f,
				(byte) 25, LocalDate.of(2020, 4, 30), LocalDateTime.now());
		dtos.add(satellite231);

		SetelliteDTO satellite232 = new SetelliteDTO("IKAROS", 232, 260.5, true, 'V', (short) 2021, 410000, 2600.0f,
				(byte) 26, LocalDate.of(2021, 6, 10), LocalDateTime.now());
		dtos.add(satellite232);

		SetelliteDTO satellite233 = new SetelliteDTO("SHIZUKU (GCOM-W1)", 233, 270.5, true, 'W', (short) 2022, 420000,
				2700.0f, (byte) 27, LocalDate.of(2022, 8, 20), LocalDateTime.now());
		dtos.add(satellite233);

		SetelliteDTO satellite234 = new SetelliteDTO("KAGUYA (SELENE)", 234, 280.5, true, 'X', (short) 2023, 430000,
				2800.0f, (byte) 28, LocalDate.of(2023, 10, 29), LocalDateTime.now());
		dtos.add(satellite234);

		SetelliteDTO satellite235 = new SetelliteDTO("Takizawa", 235, 290.5, true, 'Y', (short) 2024, 440000, 2900.0f,
				(byte) 29, LocalDate.of(2024, 12, 1), LocalDateTime.now());
		dtos.add(satellite235);

		SetelliteDTO satellite236 = new SetelliteDTO("Tsubame (Superbird-C2)", 236, 300.5, true, 'Z', (short) 2025,
				450000, 3000.0f, (byte) 30, LocalDate.of(2025, 1, 15), LocalDateTime.now());
		dtos.add(satellite236);

		SetelliteDTO satellite237 = new SetelliteDTO("Radar 1", 237, 310.5, true, 'A', (short) 2026, 460000, 3100.0f,
				(byte) 31, LocalDate.of(2026, 2, 28), LocalDateTime.now());
		dtos.add(satellite237);

		SetelliteDTO satellite238 = new SetelliteDTO("SDS-4", 238, 320.5, true, 'B', (short) 2027, 470000, 3200.0f,
				(byte) 32, LocalDate.of(2027, 4, 10), LocalDateTime.now());
		dtos.add(satellite238);

		SetelliteDTO satellite239 = new SetelliteDTO("SLATS (Super Low Altitude Test Satellite)", 239, 330.5, true, 'C',
				(short) 2028, 480000, 3300.0f, (byte) 33, LocalDate.of(2028, 5, 22), LocalDateTime.now());
		dtos.add(satellite239);

		SetelliteDTO satellite240 = new SetelliteDTO("STARS (Japanese Optical Data Relay Satellite System)", 240, 340.5,
				true, 'D', (short) 2029, 490000, 3400.0f, (byte) 34, LocalDate.of(2029, 7, 5), LocalDateTime.now());
		dtos.add(satellite240);

		SetelliteDTO satellite241 = new SetelliteDTO("Heinrich Hertz (H2Sat)", 241, 80.5, true, 'D', (short) 2000,
				230000, 800.0f, (byte) 8, LocalDate.of(2000, 5, 10), LocalDateTime.now());
		dtos.add(satellite241);

		SetelliteDTO satellite242 = new SetelliteDTO("TerraSAR-X", 242, 90.5, true, 'E', (short) 2005, 240000, 900.0f,
				(byte) 9, LocalDate.of(2005, 6, 20), LocalDateTime.now());
		dtos.add(satellite242);

		SetelliteDTO satellite243 = new SetelliteDTO("TanDEM-X", 243, 100.5, true, 'F', (short) 2010, 250000, 1000.0f,
				(byte) 10, LocalDate.of(2010, 7, 30), LocalDateTime.now());
		dtos.add(satellite243);

		SetelliteDTO satellite244 = new SetelliteDTO("Copernicus Sentinel-1", 244, 110.5, true, 'G', (short) 2015,
				260000, 1100.0f, (byte) 11, LocalDate.of(2015, 8, 1), LocalDateTime.now());
		dtos.add(satellite244);

		SetelliteDTO satellite245 = new SetelliteDTO("Rosat", 245, 120.5, true, 'H', (short) 2020, 270000, 1200.0f,
				(byte) 12, LocalDate.of(2020, 9, 15), LocalDateTime.now());
		dtos.add(satellite245);

		SetelliteDTO satellite246 = new SetelliteDTO("Chandra X-ray Observatory", 246, 130.5, true, 'I', (short) 2025,
				280000, 1300.0f, (byte) 13, LocalDate.of(2025, 10, 25), LocalDateTime.now());
		dtos.add(satellite246);

		SetelliteDTO satellite247 = new SetelliteDTO("EnMAP (Environmental Mapping and Analysis Program)", 247, 140.5,
				true, 'J', (short) 2030, 290000, 1400.0f, (byte) 14, LocalDate.of(2030, 11, 5), LocalDateTime.now());
		dtos.add(satellite247);

		SetelliteDTO satellite248 = new SetelliteDTO("GÖKTÜRK-1", 248, 150.5, true, 'K', (short) 2035, 300000, 1500.0f,
				(byte) 15, LocalDate.of(2035, 12, 15), LocalDateTime.now());
		dtos.add(satellite248);

		SetelliteDTO satellite249 = new SetelliteDTO("Eu:CROPIS", 249, 160.5, true, 'L', (short) 2040, 310000, 1600.0f,
				(byte) 16, LocalDate.of(2040, 1, 1), LocalDateTime.now());
		dtos.add(satellite249);

		SetelliteDTO satellite250 = new SetelliteDTO("PRISMA", 250, 170.5, true, 'M', (short) 2045, 320000, 1700.0f,
				(byte) 17, LocalDate.of(2045, 2, 14), LocalDateTime.now());
		dtos.add(satellite250);

		SetelliteDTO satellite251 = new SetelliteDTO("HISPASAT 36W-1", 251, 180.5, true, 'N', (short) 2050, 330000,
				1800.0f, (byte) 18, LocalDate.of(2050, 3, 29), LocalDateTime.now());
		dtos.add(satellite251);

		SetelliteDTO satellite252 = new SetelliteDTO("HISPASAT 30W-6", 252, 190.5, true, 'O', (short) 2055, 340000,
				1900.0f, (byte) 19, LocalDate.of(2055, 4, 10), LocalDateTime.now());
		dtos.add(satellite252);

		SetelliteDTO satellite253 = new SetelliteDTO("TET-1 (Technologie-Erprobungsträger 1)", 253, 200.5, true, 'P',
				(short) 2060, 350000, 2000.0f, (byte) 20, LocalDate.of(2060, 5, 15), LocalDateTime.now());
		dtos.add(satellite253);

		SetelliteDTO satellite254 = new SetelliteDTO("NORUSAT-1", 254, 210.5, true, 'Q', (short) 2065, 360000, 2100.0f,
				(byte) 21, LocalDate.of(2065, 6, 20), LocalDateTime.now());
		dtos.add(satellite254);

		SetelliteDTO satellite255 = new SetelliteDTO("TUBiSat (Technical University of Berlin Satellite)", 255, 220.5,
				true, 'R', (short) 2070, 370000, 2200.0f, (byte) 22, LocalDate.of(2070, 7, 25), LocalDateTime.now());
		dtos.add(satellite255);

		SetelliteDTO satellite256 = new SetelliteDTO("DLR Earth Sensing Imaging Spectrometer (DESIS)", 256, 230.5, true,
				'S', (short) 2075, 380000, 2300.0f, (byte) 23, LocalDate.of(2075, 8, 30), LocalDateTime.now());
		dtos.add(satellite256);

		SetelliteDTO satellite257 = new SetelliteDTO("FlexiSat", 257, 240.5, true, 'T', (short) 2080, 390000, 2400.0f,
				(byte) 24, LocalDate.of(2080, 9, 5), LocalDateTime.now());
		dtos.add(satellite257);

		SetelliteDTO satellite258 = new SetelliteDTO("UniBRITE", 258, 250.5, true, 'U', (short) 2085, 400000, 2500.0f,
				(byte) 25, LocalDate.of(2085, 10, 10), LocalDateTime.now());
		dtos.add(satellite258);

		SetelliteDTO satellite259 = new SetelliteDTO("BRITE-Austria", 259, 260.5, true, 'V', (short) 2090, 410000,
				2600.0f, (byte) 26, LocalDate.of(2090, 11, 15), LocalDateTime.now());
		dtos.add(satellite259);

		SetelliteDTO satellite260 = new SetelliteDTO("UWE-4 (University Würzburg's Experiment-4)", 260, 270.5, true,
				'W', (short) 2095, 420000, 2700.0f, (byte) 27, LocalDate.of(2095, 12, 20), LocalDateTime.now());
		dtos.add(satellite260);

		SetelliteDTO satellite261 = new SetelliteDTO("Flying Laptop", 261, 280.5, true, 'X', (short) 2100, 430000,
				2800.0f, (byte) 28, LocalDate.of(2100, 1, 25), LocalDateTime.now());
		dtos.add(satellite261);

		SetelliteDTO satellite262 = new SetelliteDTO("BIRD (Bi-spectral Infrared Detection)", 262, 290.5, true, 'Y',
				(short) 2105, 440000, 2900.0f, (byte) 29, LocalDate.of(2105, 2, 2), LocalDateTime.now());
		dtos.add(satellite262);

		SetelliteDTO satellite263 = new SetelliteDTO("MOVE-II", 263, 300.5, true, 'Z', (short) 2110, 450000, 3000.0f,
				(byte) 30, LocalDate.of(2110, 3, 7), LocalDateTime.now());
		dtos.add(satellite263);

		SetelliteDTO satellite264 = new SetelliteDTO(
				"SIMBA (Small Interactive Multi-Mission Satellite with Blender Animation)", 264, 310.5, true, 'A',
				(short) 2115, 460000, 3100.0f, (byte) 31, LocalDate.of(2115, 4, 12), LocalDateTime.now());
		dtos.add(satellite264);

		SetelliteDTO satellite265 = new SetelliteDTO("HOOPOE (Humboldt One on One Plasma Experiment)", 265, 320.5, true,
				'B', (short) 2120, 470000, 3200.0f, (byte) 32, LocalDate.of(2120, 5, 17), LocalDateTime.now());
		dtos.add(satellite265);

		SetelliteDTO satellite266 = new SetelliteDTO("WNISAT-1", 266, 330.5, true, 'C', (short) 2125, 480000, 3300.0f,
				(byte) 33, LocalDate.of(2125, 6, 22), LocalDateTime.now());
		dtos.add(satellite266);

		SetelliteDTO satellite267 = new SetelliteDTO("TechnoSat", 267, 340.5, true, 'D', (short) 2130, 490000, 3400.0f,
				(byte) 34, LocalDate.of(2130, 7, 27), LocalDateTime.now());
		dtos.add(satellite267);

		SetelliteDTO satellite268 = new SetelliteDTO("GRACE-FO (Gravity Recovery and Climate Experiment Follow-On)",
				268, 350.5, true, 'E', (short) 2135, 500000, 3500.0f, (byte) 35, LocalDate.of(2135, 8, 1),
				LocalDateTime.now());
		dtos.add(satellite268);

		SetelliteDTO satellite269 = new SetelliteDTO("MIRKA2-DN", 269, 360.5, true, 'F', (short) 2140, 510000, 3600.0f,
				(byte) 36, LocalDate.of(2140, 9, 5), LocalDateTime.now());
		dtos.add(satellite269);

		SetelliteDTO satellite270 = new SetelliteDTO("Flying Laptop 2", 270, 370.5, true, 'G', (short) 2145, 520000,
				3700.0f, (byte) 37, LocalDate.of(2145, 10, 10), LocalDateTime.now());
		dtos.add(satellite270);

		SetelliteDTO satellite271 = new SetelliteDTO("COSMO-SkyMed 1", 271, 100.5, true, 'A', (short) 2000, 230000,
				550.0f, (byte) 5, LocalDate.of(2000, 1, 1), LocalDateTime.now());
		dtos.add(satellite271);

		SetelliteDTO satellite272 = new SetelliteDTO("COSMO-SkyMed 2", 272, 101.5, true, 'A', (short) 2001, 231000,
				551.0f, (byte) 6, LocalDate.of(2001, 2, 15), LocalDateTime.now());
		dtos.add(satellite272);

		SetelliteDTO satellite273 = new SetelliteDTO("COSMO-SkyMed 3", 273, 102.5, true, 'A', (short) 2002, 232000,
				552.0f, (byte) 7, LocalDate.of(2002, 4, 30), LocalDateTime.now());
		dtos.add(satellite273);

		SetelliteDTO satellite274 = new SetelliteDTO("COSMO-SkyMed 4", 274, 103.5, true, 'A', (short) 2003, 233000,
				553.0f, (byte) 8, LocalDate.of(2003, 6, 15), LocalDateTime.now());
		dtos.add(satellite274);

		SetelliteDTO satellite275 = new SetelliteDTO("PRISMA", 275, 104.5, true, 'A', (short) 2004, 234000, 554.0f,
				(byte) 9, LocalDate.of(2004, 8, 30), LocalDateTime.now());
		dtos.add(satellite275);

		SetelliteDTO satellite276 = new SetelliteDTO("LARES", 276, 105.5, true, 'A', (short) 2005, 235000, 555.0f,
				(byte) 10, LocalDate.of(2005, 10, 1), LocalDateTime.now());
		dtos.add(satellite276);

		SetelliteDTO satellite277 = new SetelliteDTO("GÖKTÜRK-1", 277, 106.5, true, 'A', (short) 2006, 236000, 556.0f,
				(byte) 11, LocalDate.of(2006, 11, 15), LocalDateTime.now());
		dtos.add(satellite277);

		SetelliteDTO satellite278 = new SetelliteDTO("Lares 2", 278, 107.5, true, 'A', (short) 2007, 237000, 557.0f,
				(byte) 12, LocalDate.of(2007, 12, 31), LocalDateTime.now());
		dtos.add(satellite278);

		SetelliteDTO satellite279 = new SetelliteDTO("Agile", 279, 108.5, true, 'A', (short) 2008, 238000, 558.0f,
				(byte) 13, LocalDate.of(2008, 2, 14), LocalDateTime.now());
		dtos.add(satellite279);

		SetelliteDTO satellite280 = new SetelliteDTO("TSS-1R", 280, 109.5, true, 'A', (short) 2009, 239000, 559.0f,
				(byte) 14, LocalDate.of(2009, 4, 30), LocalDateTime.now());
		dtos.add(satellite280);

		SetelliteDTO satellite281 = new SetelliteDTO("ASI-SAC-D", 281, 110.5, true, 'A', (short) 2010, 240000, 560.0f,
				(byte) 15, LocalDate.of(2010, 6, 15), LocalDateTime.now());
		dtos.add(satellite281);

		SetelliteDTO satellite282 = new SetelliteDTO("Picard", 282, 111.5, true, 'A', (short) 2011, 241000, 561.0f,
				(byte) 16, LocalDate.of(2011, 8, 30), LocalDateTime.now());
		dtos.add(satellite282);

		SetelliteDTO satellite283 = new SetelliteDTO("AGILE", 283, 112.5, true, 'A', (short) 2012, 242000, 562.0f,
				(byte) 17, LocalDate.of(2012, 10, 1), LocalDateTime.now());
		dtos.add(satellite283);

		SetelliteDTO satellite284 = new SetelliteDTO("Unisat-5", 284, 113.5, true, 'A', (short) 2013, 243000, 563.0f,
				(byte) 18, LocalDate.of(2013, 11, 15), LocalDateTime.now());
		dtos.add(satellite284);

		SetelliteDTO satellite285 = new SetelliteDTO("Unisat-6", 285, 114.5, true, 'A', (short) 2014, 244000, 564.0f,
				(byte) 19, LocalDate.of(2014, 12, 31), LocalDateTime.now());
		dtos.add(satellite285);

		SetelliteDTO satellite286 = new SetelliteDTO("UniSat-7", 286, 115.5, true, 'A', (short) 2015, 245000, 565.0f,
				(byte) 20, LocalDate.of(2015, 2, 14), LocalDateTime.now());
		dtos.add(satellite286);

		SetelliteDTO satellite287 = new SetelliteDTO("SHALOM", 287, 116.5, true, 'A', (short) 2016, 246000, 566.0f,
				(byte) 21, LocalDate.of(2016, 4, 30), LocalDateTime.now());
		dtos.add(satellite287);

		SetelliteDTO satellite288 = new SetelliteDTO("LARES 2", 288, 117.5, true, 'A', (short) 2017, 247000, 567.0f,
				(byte) 22, LocalDate.of(2017, 6, 15), LocalDateTime.now());
		dtos.add(satellite288);

		SetelliteDTO satellite289 = new SetelliteDTO("AlmaSat-1", 289, 118.5, true, 'A', (short) 2018, 248000, 568.0f,
				(byte) 23, LocalDate.of(2018, 8, 30), LocalDateTime.now());
		dtos.add(satellite289);

		SetelliteDTO satellite290 = new SetelliteDTO("Max Valier", 290, 119.5, true, 'A', (short) 2019, 249000, 569.0f,
				(byte) 24, LocalDate.of(2019, 10, 1), LocalDateTime.now());
		dtos.add(satellite290);

		SetelliteDTO satellite291 = new SetelliteDTO("EROS A", 291, 50.5, true, 'A', (short) 1980, 200000, 500.0f,
				(byte) 5, LocalDate.of(1980, 1, 1), LocalDateTime.now());
		dtos.add(satellite291);

		SetelliteDTO satellite292 = new SetelliteDTO("Venus", 292, 60.5, true, 'B', (short) 1990, 210000, 600.0f,
				(byte) 6, LocalDate.of(1990, 2, 15), LocalDateTime.now());
		dtos.add(satellite292);

		SetelliteDTO satellite293 = new SetelliteDTO("TecSAR", 293, 70.5, true, 'C', (short) 1995, 220000, 700.0f,
				(byte) 7, LocalDate.of(1995, 4, 30), LocalDateTime.now());
		dtos.add(satellite293);

		SetelliteDTO satellite294 = new SetelliteDTO("TAU-SAT", 294, 80.5, true, 'D', (short) 2000, 230000, 800.0f,
				(byte) 8, LocalDate.of(2000, 6, 15), LocalDateTime.now());
		dtos.add(satellite294);

		SetelliteDTO satellite295 = new SetelliteDTO("Venus", 295, 90.5, true, 'E', (short) 2005, 240000, 900.0f,
				(byte) 9, LocalDate.of(2005, 8, 20), LocalDateTime.now());
		dtos.add(satellite295);

		SetelliteDTO satellite296 = new SetelliteDTO("Shavit", 296, 100.5, true, 'F', (short) 2010, 250000, 1000.0f,
				(byte) 10, LocalDate.of(2010, 10, 25), LocalDateTime.now());
		dtos.add(satellite296);

		SetelliteDTO satellite297 = new SetelliteDTO("Dido-1", 297, 110.5, true, 'G', (short) 2015, 260000, 1100.0f,
				(byte) 11, LocalDate.of(2015, 12, 31), LocalDateTime.now());
		dtos.add(satellite297);

		SetelliteDTO satellite298 = new SetelliteDTO("Duchifat-1", 298, 120.5, true, 'H', (short) 2020, 270000, 1200.0f,
				(byte) 12, LocalDate.of(2020, 3, 5), LocalDateTime.now());
		dtos.add(satellite298);

		SetelliteDTO satellite299 = new SetelliteDTO("Duchifat-2", 299, 130.5, true, 'I', (short) 2021, 280000, 1300.0f,
				(byte) 13, LocalDate.of(2021, 5, 10), LocalDateTime.now());
		dtos.add(satellite299);

		SetelliteDTO satellite300 = new SetelliteDTO("AMOS-6", 300, 140.5, true, 'J', (short) 2022, 290000, 1400.0f,
				(byte) 14, LocalDate.of(2022, 7, 15), LocalDateTime.now());
		dtos.add(satellite300);

		int count = 0;
		for (SetelliteDTO satellite : dtos) {
			System.out.println("Name:" + satellite.getName());
			count++;
		}  
		System.out.println("Total:" + count);

		System.out.println();

		boolean set1 = dtos.contains("Is dtos contains '+setellite298':" + satellite298);
		System.out.println(set1);
		System.out.println();

		Collection<SetelliteDTO> satellitesToCheckAll = new ArrayList<>();
		SetelliteDTO venus = new SetelliteDTO("Venus", 295, 90.5, true, 'E', (short) 2005, 240000, 900.0f,
				(byte) 9, LocalDate.of(2005, 8, 20), LocalDateTime.now());
		satellitesToCheckAll.add(venus);

		SetelliteDTO shavit = new SetelliteDTO("Shavit", 296, 100.5, true, 'F', (short) 2010, 250000, 1000.0f,
				(byte) 10, LocalDate.of(2010, 10, 25), LocalDateTime.now());
		satellitesToCheckAll.add(shavit);
		
		boolean foo = satellitesToCheckAll.contains("Is dtos contains '+setellite298':" + satellite298);
		System.out.println(foo);
		System.out.println();
		
		boolean ref1 = satellitesToCheckAll.contains(venus);
		System.out.println("Contains all specified satellites: " + ref1);

		System.out.println();
		
		Collection<SetelliteDTO> set3 = new ArrayList<>();
		SetelliteDTO rsd1 = new SetelliteDTO("Rohini RS-D1", 100, 50.5, true, 'A', (short) 1980, 200000, 500.0f,
				(byte) 5, LocalDate.of(1980, 1, 1), LocalDateTime.now());
		set3.add(rsd1);

		SetelliteDTO ariane = new SetelliteDTO("Ariane Passenger Payload Experiment", 110, 60.5, true, 'B',
				(short) 1990, 210000, 600.0f, (byte) 6, LocalDate.of(1990, 2, 15), LocalDateTime.now());
		set3.add(ariane);
		
		boolean removed = set3.remove(satellite245);
		System.out.println("Removed Satellite 245: " + removed);

		System.out.println();

		
		boolean removeAll = dtos.removeAll(set3);
		System.out.println("Removed all specified satellites: " + removeAll);
	}

}
