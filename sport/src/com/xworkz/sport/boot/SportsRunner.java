package com.xworkz.sport.boot;

import com.xworkz.sport.app.dto.SportDTO;
import com.xworkz.sport.app.repository.SportRepository;
import com.xworkz.sport.app.repository.SportRepositoryImpl;
import com.xworkz.sport.app.service.SportService;
import com.xworkz.sport.app.service.SportServiceImpl;

public class SportsRunner {
	public static void main(String[] args) {
		System.out.println("Running main ....");
		SportRepository sportRepo = new SportRepositoryImpl();
		SportService service = new SportServiceImpl(sportRepo);
		SportDTO sportDto = new SportDTO("Football", 11, "Football, Goalposts", 105.0, "Follow the rules of football.",
				"FIFA", "Ancient China", false, 1990, "FIFA World Cup");
		boolean persisted = service.validateAndSave(sportDto);
		System.out.println("Persisted " + persisted);

		SportDTO sportDto2 = new SportDTO("Football", 11, "Football, Goalposts", 105.0, "Follow the rules of football.",
				"FIFA", "Ancient China", false, 1990, "FIFA World Cup");
		service.validateAndSave(sportDto2);

		SportDTO sportDto3 = service.findBySportName("Football");
		System.out.println("Found " + sportDto3);

	}
}
