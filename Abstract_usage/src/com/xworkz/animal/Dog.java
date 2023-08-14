package com.xworkz.animal;
public class Dog extends Animal {
    @Override
    public void species() {
        System.out.println("Species: Canine");
    }

    @Override
   public  void habitat() {
        System.out.println("Habitat: Domesticated");
    }

    @Override
   public void age() {
        System.out.println("Age: Varies");
    }

    @Override
   public void color() {
        System.out.println("Color: Varies");
    }

    @Override
   public void gender() {
        System.out.println("Gender: Male/Female");
    }
}

