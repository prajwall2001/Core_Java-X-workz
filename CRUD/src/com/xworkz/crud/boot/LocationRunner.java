package com.xworkz.crud.boot;

import com.xworkz.crud.app.LocationRepository;
import com.xworkz.crud.app.LocationRepositoryImpl;
import com.xworkz.crud.app.service.LocationService;
import com.xworkz.crud.app.service.LocationServiceImpl;

public class LocationRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in LocationRunner");
        LocationRepository locationRepository = new LocationRepositoryImpl();

        LocationService locationService = new LocationServiceImpl(locationRepository);
        boolean ref = locationService.validateAndSave("New York");
        System.out.println(ref);

        boolean ref1 = locationService.validateAndSave("New York");
        System.out.println(ref1);
    }
}
