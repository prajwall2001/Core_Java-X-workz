package com.xworkz.crud.boot;

import com.xworkz.crud.app.PincodeRepository;
import com.xworkz.crud.app.PincodeRepositoryImpl;
import com.xworkz.crud.app.service.PincodeService;
import com.xworkz.crud.app.service.PincodeServiceImpl;

public class PincodeRunner {

    public static void main(String[] args) {
        System.out.println("Invoking main in PincodeRunner");
        PincodeRepository pincodeRepository = new PincodeRepositoryImpl();

        PincodeService pincodeService = new PincodeServiceImpl(pincodeRepository);
        boolean ref = pincodeService.validateAndSave(560001);
        System.out.println(ref);

        boolean ref1 = pincodeService.validateAndSave(560001);
        System.out.println(ref1);
    }
}
