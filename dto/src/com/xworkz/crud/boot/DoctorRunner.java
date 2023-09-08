package com.xworkz.crud.boot;

import com.xworkz.crud.app.dto.DoctorDTO;
import com.xworkz.crud.app.repository.DoctorRepository;
import com.xworkz.crud.app.repository.DoctorRepositoryImpl;
import com.xworkz.crud.app.service.DoctorService;
import com.xworkz.crud.app.service.DoctorServiceImpl;

public class DoctorRunner {

    public static void main(String[] args) {
        System.out.println("Invoking main.....");
        DoctorRepository doctorRepository = new DoctorRepositoryImpl();
        DoctorService doctorService = new DoctorServiceImpl(doctorRepository);
        DoctorDTO dto = new DoctorDTO("Dr.Rohan", "Cardiologist", 10, "KMC Hospital");
        boolean persisted = doctorService.validateAndSave(dto);
        System.out.println("Persisted: " + persisted);
    }
}