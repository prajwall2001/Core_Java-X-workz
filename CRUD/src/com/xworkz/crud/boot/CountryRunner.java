package com.xworkz.crud.boot;

import com.xworkz.crud.app.CountryRepository;
import com.xworkz.crud.app.CountryRepositoryImpl;
import com.xworkz.crud.app.service.CountryService;
import com.xworkz.crud.app.service.CountryServiceImpl;

public class CountryRunner {

    public static void main(String[] args) {
        System.out.println("Invoking main in CountryRunner");
        CountryRepository countryRepository = new CountryRepositoryImpl();

        CountryService countryService = new CountryServiceImpl(countryRepository);
        boolean ref = countryService.validateAndSave("India");
        System.out.println(ref);

        boolean ref1 = countryService.validateAndSave("India");
        System.out.println(ref1);
    }
}