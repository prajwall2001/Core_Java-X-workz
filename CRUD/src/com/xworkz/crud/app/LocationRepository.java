package com.xworkz.crud.app;

public interface LocationRepository {
    int TOTAL_LOCATIONS = 10;

    void save(String locationName);

    default boolean isExist(String locationName) {
        return false;
    }
}
