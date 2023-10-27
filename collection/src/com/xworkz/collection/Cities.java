package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cities {
    public static void main(String[] args) {
        Collection<String> karnatakaCities = new ArrayList<>();
        karnatakaCities.add("Bangalore");
        karnatakaCities.add("Mysore");
        karnatakaCities.add("Hubli");
        karnatakaCities.add("Mangalore");
        karnatakaCities.add("Belgaum");
        karnatakaCities.add("Gulbarga");
        karnatakaCities.add("Davangere");
        karnatakaCities.add("Bellary");
        karnatakaCities.add("Shimoga");
        karnatakaCities.add("Tumkur");
        karnatakaCities.add("Hassan");
        karnatakaCities.add("Dharwad");
        karnatakaCities.add("Bidar");
        karnatakaCities.add("Raichur");
        karnatakaCities.add("Udupi");
        karnatakaCities.add("Chitradurga");
        karnatakaCities.add("Bagalkot");
        karnatakaCities.add("Haveri");
        karnatakaCities.add("Gadag");
        karnatakaCities.add("Kolar");

        System.out.println("Total Karnataka Cities: " + karnatakaCities.size());

        Iterator<String> iterator = karnatakaCities.iterator();
        while (iterator.hasNext()) {
            String cityName = iterator.next();
            System.out.println("Name:"+cityName);
        }
    }
}
