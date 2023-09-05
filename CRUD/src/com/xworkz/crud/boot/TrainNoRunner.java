package com.xworkz.crud.boot;

import com.xworkz.crud.app.TrainNoRepository;
import com.xworkz.crud.app.TrainNoRepositoryImpl;
import com.xworkz.crud.app.service.TrainNoService;
import com.xworkz.crud.app.service.TrainNoServiceImpl;

public class TrainNoRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in TrainRunner");
        TrainNoRepository trainNoRepository = new TrainNoRepositoryImpl();

        TrainNoService trainNoService = new TrainNoServiceImpl(trainNoRepository);
        boolean ref = trainNoService.validateAndSave("65245");
        System.out.println(ref);

        boolean ref1 = trainNoService.validateAndSave("65345");
        System.out.println(ref1);
    }
}

