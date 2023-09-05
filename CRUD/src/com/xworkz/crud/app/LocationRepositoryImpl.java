package com.xworkz.crud.app;

public class LocationRepositoryImpl implements LocationRepository {
    private String[] locations = new String[TOTAL_LOCATIONS];
    int position;

    @Override
    public void save(String locationName) {
        System.out.println("Invoking save in LocationRepositoryImpl...");

        if (this.position < TOTAL_LOCATIONS) {
            this.locations[position] = locationName;
            System.out.println("Stored " + locationName + " in position " + this.position);
            this.position++;
        } else {
            System.err.println("Storage is Full, cannot store location...");
        }
    }

    @Override
    public boolean isExist(String locationName) {
        for (int start = 0; start <= this.position; start++) {
            String temp = this.locations[start];
            if (temp != null && temp.equals(locationName)) {
                System.err.println("LocationName is already exist");
                return true;
            }
        }
        return false;
    }
}