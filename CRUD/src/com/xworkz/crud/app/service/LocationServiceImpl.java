package com.xworkz.crud.app.service;

import com.xworkz.crud.app.LocationRepository;

public class LocationServiceImpl implements LocationService {
    private LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public boolean validateAndSave(String locationName) {
        System.out.println("Invoking validateAndSave in LocationServiceImpl");
        if (locationName != null && !locationName.isEmpty() && locationName.length() >= 3 && locationName.length() <= 10) {
            System.out.println("locationName is valid, then store locationName " + this.getClass().getSimpleName());
            if (!this.locationRepository.isExist(locationName)) {
                this.locationRepository.save(locationName);
                return true;
            } else {
                System.err.println("LocationName " + locationName + " is already exist, please insert another");
            }
        } else {
            System.err.println("Cannot store data, locationName is invalid");
        }
        return false;
    }
}
