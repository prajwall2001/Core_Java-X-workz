class ChariotRacer{
    public static void main(String[] args) {
        System.out.println("Invoking main in ChariotRacer");

        Chariot chariot = new Chariot();
        System.out.println();

        Chariot chariot1 = new Chariot("Golden");
        System.out.println("Color: " + chariot1.color);
        System.out.println();

        Chariot chariot2 = new Chariot("Silver", 4);
        System.out.println("Color: " + chariot2.color);
        System.out.println("Number of wheels: " + chariot2.numberOfWheels);
        System.out.println();

        Chariot chariot3 = new Chariot("Bronze", 4, 2);
        System.out.println("Color: " + chariot3.color);
        System.out.println("Number of wheels: " + chariot3.numberOfWheels);
        System.out.println("Number of horses: " + chariot3.numberOfHorses);
        System.out.println();

        Chariot chariot4 = new Chariot("Black", 4, 2, 3.5f);
        System.out.println("Color: " + chariot4.color);
        System.out.println("Number of wheels: " + chariot4.numberOfWheels);
        System.out.println("Number of horses: " + chariot4.numberOfHorses);
        System.out.println("Length: " + chariot4.length + " meters");
        System.out.println();

        Chariot chariot5 = new Chariot("White", 4, 2, 3.5f, 1.8f);
        System.out.println("Color: " + chariot5.color);
        System.out.println("Number of wheels: " + chariot5.numberOfWheels);
        System.out.println("Number of horses: " + chariot5.numberOfHorses);
        System.out.println("Length: " + chariot5.length + " meters");
        System.out.println("Width: " + chariot5.width + " meters");
        System.out.println();

        Chariot chariot6 = new Chariot("Red", 4, 2, 3.5f, 1.8f, 1.2f);
        System.out.println("Color: " + chariot6.color);
        System.out.println("Number of wheels: " + chariot6.numberOfWheels);
        System.out.println("Number of horses: " + chariot6.numberOfHorses);
        System.out.println("Length: " + chariot6.length + " meters");
        System.out.println("Width: " + chariot6.width + " meters");
        System.out.println("Height: " + chariot6.height + " meters");
        System.out.println();

        Chariot chariot7 = new Chariot("Blue", 4, 2, 3.5f, 1.8f, 1.2f, "Wood");
        System.out.println("Color: " + chariot7.color);
        System.out.println("Number of wheels: " + chariot7.numberOfWheels);
        System.out.println("Number of horses: " + chariot7.numberOfHorses);
        System.out.println("Length: " + chariot7.length + " meters");
        System.out.println("Width: " + chariot7.width + " meters");
        System.out.println("Height: " + chariot7.height + " meters");
        System.out.println("Material: " + chariot7.material);
        System.out.println();

        Chariot chariot8 = new Chariot("Green", 4, 2, 3.5f, 1.8f, 1.2f, "Wood", true);
        System.out.println("Color: " + chariot8.color);
        System.out.println("Number of wheels: " + chariot8.numberOfWheels);
        System.out.println("Number of horses: " + chariot8.numberOfHorses);
        System.out.println("Length: " + chariot8.length + " meters");
        System.out.println("Width: " + chariot8.width + " meters");
        System.out.println("Height: " + chariot8.height + " meters");
        System.out.println("Material: " + chariot8.material);
        System.out.println("Has Roof: " + chariot8.hasRoof);
        System.out.println();

        Chariot chariot9 = new Chariot("Purple", 4, 2, 3.5f, 1.8f, 1.2f, "Wood", true, true);
        System.out.println("Color: " + chariot9.color);
        System.out.println("Number of wheels: " + chariot9.numberOfWheels);
        System.out.println("Number of horses: " + chariot9.numberOfHorses);
        System.out.println("Length: " + chariot9.length + " meters");
        System.out.println("Width: " + chariot9.width + " meters");
        System.out.println("Height: " + chariot9.height + " meters");
        System.out.println("Material: " + chariot9.material);
        System.out.println("Has Roof: " + chariot9.hasRoof);
        System.out.println("Has Driver Seat: " + chariot9.hasDriverSeat);
        System.out.println();

        Chariot chariot10 = new Chariot("Orange", 4, 2, 3.5f, 1.8f, 1.2f, "Wood", true, true, 2);
        System.out.println("Color: " + chariot10.color);
        System.out.println("Number of wheels: " + chariot10.numberOfWheels);
        System.out.println("Number of horses: " + chariot10.numberOfHorses);
        System.out.println("Length: " + chariot10.length + " meters");
        System.out.println("Width: " + chariot10.width + " meters");
        System.out.println("Height: " + chariot10.height + " meters");
        System.out.println("Material: " + chariot10.material);
        System.out.println("Has Roof: " + chariot10.hasRoof);
        System.out.println("Has Driver Seat: " + chariot10.hasDriverSeat);
        System.out.println("Passenger Capacity: " + chariot10.passengerCapacity);
        System.out.println();

        Chariot chariot11 = new Chariot("Yellow", 4, 2, 3.5f, 1.8f, 1.2f, "Wood", true, true, 2, true);
        System.out.println("Color: " + chariot11.color);
        System.out.println("Number of wheels: " + chariot11.numberOfWheels);
        System.out.println("Number of horses: " + chariot11.numberOfHorses);
        System.out.println("Length: " + chariot11.length + " meters");
        System.out.println("Width: " + chariot11.width + " meters");
        System.out.println("Height: " + chariot11.height + " meters");
        System.out.println("Material: " + chariot11.material);
        System.out.println("Has Roof: " + chariot11.hasRoof);
        System.out.println("Has Driver Seat: " + chariot11.hasDriverSeat);
        System.out.println("Passenger Capacity: " + chariot11.passengerCapacity);
        System.out.println("Is War Chariot: " + chariot11.isWarChariot);
    }
}