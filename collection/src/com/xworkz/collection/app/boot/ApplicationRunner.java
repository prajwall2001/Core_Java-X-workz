package com.xworkz.collection.app.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.app.dto.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in ApplicationRunner...");
		LocalDate date=LocalDate.of(2023, 5, 20);
		LocalDate date1=LocalDate.of(2022, 2, 25);
		LocalDate date2=LocalDate.of(2022, 12, 15);
		LocalDate date3=LocalDate.of(2021, 9, 16);
		LocalDate date4=LocalDate.of(2012, 2, 15);

		ApplicationDTO appDto = new ApplicationDTO();
		
		
		ApplicationDTO app=new ApplicationDTO("pubg", "23.0.1", "Krafton", date, 4.9);
		ApplicationDTO app1=new ApplicationDTO("Freefire", "2.0.1", "Gamesloft", date1, 4.2);
		ApplicationDTO app2=new ApplicationDTO("Dr.driving", "2.0.1", "Gamesloft", date2, 3.5);
		ApplicationDTO app3=new ApplicationDTO("Temple run", "5.5.10", "space", date3, 4.5);
		ApplicationDTO app4=new ApplicationDTO("Candy crush", "1.0.21", "loftgames", date4, 4.0);
	
	    Collection<ApplicationDTO> dtos=new ArrayList<>();
	    dtos.add(app);
	    dtos.add(app1);
	    dtos.add(app2);
	    dtos.add(app3);
	    dtos.add(app4);
	    
	    
	    System.out.println("Total: " + dtos.size());

        Iterator<ApplicationDTO> itr = dtos.iterator();
        while (itr.hasNext()) {
            ApplicationDTO applicationDTO = itr.next();
            System.out.println("Name:"+applicationDTO.getName());
        }
	}
}
