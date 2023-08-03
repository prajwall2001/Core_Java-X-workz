package com.brand.app;
public class InternationalBrand extends Brand {
    public String internationalInfo;

    public void displayInfo() {
        super.displayInfo();
        System.out.println("International Info: " + internationalInfo);
    }
}
