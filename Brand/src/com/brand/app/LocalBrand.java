package com.brand.app;
public class LocalBrand extends Brand {
    public String localInfo;

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Local Info: " + localInfo);
    }
}
