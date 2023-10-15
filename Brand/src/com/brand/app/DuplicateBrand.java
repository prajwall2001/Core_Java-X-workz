package com.brand.app;
public class DuplicateBrand extends Brand {
    public String duplicateInfo;

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duplicate Info: " + duplicateInfo);
    }
}
