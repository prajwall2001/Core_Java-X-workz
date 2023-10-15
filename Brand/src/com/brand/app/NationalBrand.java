package com.brand.app;
public class NationalBrand extends Brand {
    public String nationalInfo;

    public void displayInfo() {
        super.displayInfo();
        System.out.println("National Info: " + nationalInfo);
    }

}
