class DoorBellRinger {
    public static void main(String[] args) {
		System.out.println();
        System.out.println("Invoking main in DoorBellMain");

        DoorBell bell = new DoorBell();
        System.out.println();

        DoorBell bell1 = new DoorBell("White");
        System.out.println("Color: " + bell1.color);
		System.out.println("Material: " + bell1.material);
		 System.out.println("Number of Buttons: " + bell1.numberOfButtons);
        System.out.println("Has Camera: " + bell1.hasCamera);
        System.out.println("Has Intercom: " + bell1.hasIntercom);
        System.out.println("Height: " + bell1.height);
        System.out.println("Width: " + bell1.width );
        System.out.println();

        DoorBell bell2 = new DoorBell("Black", "Plastic");
        System.out.println("Color: " + bell2.color);
        System.out.println("Material: " + bell2.material);
		 System.out.println("Number of Buttons: " + bell2.numberOfButtons);
        System.out.println("Has Camera: " + bell2.hasCamera);
        System.out.println("Has Intercom: " + bell2.hasIntercom);
        System.out.println("Height: " + bell2.height);
        System.out.println("Width: " + bell2.width);
        System.out.println();

        DoorBell bell3 = new DoorBell("Silver", "Metal", 2);
        System.out.println("Color: " + bell3.color);
        System.out.println("Material: " + bell3.material);
        System.out.println("Number of Buttons: " + bell3.numberOfButtons);
		System.out.println("Has Camera: " + bell3.hasCamera);
        System.out.println("Has Intercom: " + bell3.hasIntercom);
        System.out.println("Height: " + bell3.height);
        System.out.println("Width: " + bell3.width );
        System.out.println();

        DoorBell bell4 = new DoorBell("Gold", "Metal", 1, true);
        System.out.println("Color: " + bell4.color);
        System.out.println("Material: " + bell4.material);
        System.out.println("Number of Buttons: " + bell4.numberOfButtons);
        System.out.println("Has Camera: " + bell4.hasCamera);
		System.out.println("Has Intercom: " + bell4.hasIntercom);
        System.out.println("Height: " + bell4.height);
        System.out.println("Width: " + bell4.width);
        System.out.println();

        DoorBell bell5 = new DoorBell("Bronze", "Metal", 1, true, true);
        System.out.println("Color: " + bell5.color);
        System.out.println("Material: " + bell5.material);
        System.out.println("Number of Buttons: " + bell5.numberOfButtons);
        System.out.println("Has Camera: " + bell5.hasCamera);
        System.out.println("Has Intercom: " + bell5.hasIntercom);
		System.out.println("Height: " + bell5.height);
        System.out.println("Width: " + bell5.width );
        System.out.println();

        DoorBell bell6 = new DoorBell("Green", "Plastic", 1, false, false, 15.5);
        System.out.println("Color: " + bell6.color);
        System.out.println("Material: " + bell6.material);
        System.out.println("Number of Buttons: " + bell6.numberOfButtons);
        System.out.println("Has Camera: " + bell6.hasCamera);
        System.out.println("Has Intercom: " + bell6.hasIntercom);
        System.out.println("Height: " + bell6.height);
		System.out.println("Width: " + bell6.width);
        System.out.println();

        DoorBell bell7 = new DoorBell("Blue", "Plastic", 2, true, true, 20.0, 10.0);
        System.out.println("Color: " + bell7.color);
        System.out.println("Material: " + bell7.material);
        System.out.println("Number of Buttons: " + bell7.numberOfButtons);
        System.out.println("Has Camera: " + bell7.hasCamera);
        System.out.println("Has Intercom: " + bell7.hasIntercom);
        System.out.println("Height: " + bell7.height);
        System.out.println("Width: " + bell7.width);
    }
}
