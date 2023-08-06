package com.coffee.app;

public class Coffee {
    public String brand;
    public boolean isDecaf;
    public int temperature;
    public double price;
    
    public Coffee() {
        this("Default Brand", false, 70, 5.99);
        System.out.println("Invoking no-arg constructor in Coffee");
    }
    
    public Coffee(String brand, boolean isDecaf, int temperature, double price) {
        System.out.println("Invoking parameterized constructor in Coffee");
        this.brand = brand;
        this.isDecaf = isDecaf;
        this.temperature = temperature;
        this.price = price;
    }
}
