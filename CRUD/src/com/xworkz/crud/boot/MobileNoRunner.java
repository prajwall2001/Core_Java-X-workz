package com.xworkz.crud.boot;

import com.xworkz.crud.app.MobileNoRepository;
import com.xworkz.crud.app.MobileNoRepositoryImpl;
import com.xworkz.crud.app.service.MobileNoService;
import com.xworkz.crud.app.service.MobileNoServiceImpl;

public class MobileNoRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in MobileNoRunner");
        MobileNoRepository mobileNoRepository = new MobileNoRepositoryImpl();

        MobileNoService mobileNoService = new MobileNoServiceImpl(mobileNoRepository);
        boolean ref = mobileNoService.validateAndSave(1234567890L);
        System.out.println(ref);

        boolean ref1 = mobileNoService.validateAndSave(1234567890L);
        System.out.println(ref1);
    }
}
