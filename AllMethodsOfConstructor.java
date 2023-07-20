class AllMethodsOfConstructor{
public static void main(String[] args) {
		System.out.println();
        Carrom board =new Carrom();
		
	System.out.println();
	System.out.println("Invoking main in AllMethodsOfConstructor");
	
    Carrom board1=new Carrom("Red");
        System.out.println("Color : " + board1.boardColor);
        System.out.println("Total coins : " + board1.numberOfCoins);
        System.out.println("Striker diameter: " + board1.strikerDiameter);
        System.out.println("Board length: " + board1.boardLength);
        System.out.println("Board Width: " + board1.boardWidth);
		
		System.out.println();
	
    Carrom board2=new Carrom("Red",18);
        System.out.println("Color : " + board2.boardColor);
        System.out.println("Total coins : " + board2.numberOfCoins);
        System.out.println("Striker diameter: " + board1.strikerDiameter);
        System.out.println("Board length: " + board2.boardLength);
        System.out.println("Board Width: " + board2.boardWidth);
		
		System.out.println();
	
    Carrom board3=new Carrom("Red",18,8);
        System.out.println("Color : " + board3.boardColor);
        System.out.println("Total coins : " + board3.numberOfCoins);
        System.out.println("Striker diameter: " + board3.strikerDiameter);
        System.out.println("Board length: " + board3.boardLength);
        System.out.println("Board Width: " + board3.boardWidth);
		
		System.out.println();
	
    Carrom board4=new Carrom("Red",18,8,60f);
        System.out.println("Color : " + board4.boardColor);
        System.out.println("Total coins : " + board4.numberOfCoins);
        System.out.println("Striker diameter: " + board4.strikerDiameter);
        System.out.println("Board length: " + board4.boardLength);
        System.out.println("Board Width: " + board4.boardWidth);
		
		System.out.println();
	
    Carrom board5=new Carrom("Red",18,8,60,60f);
        System.out.println("Color : " + board5.boardColor);
        System.out.println("Total coins : " + board5.numberOfCoins);
        System.out.println("Striker diameter: " + board5.strikerDiameter);
        System.out.println("Board length: " + board5.boardLength);
        System.out.println("Board Width: " + board5.boardWidth);
		
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
		
		
		System.out.println();
        System.out.println("Invoking main in LogoCreator");

        Logo logo = new Logo();
        System.out.println();
		
		Logo logo1 = new Logo("Black");
		System.out.println("Color: " + logo1.color);
        System.out.println("Width: " + logo1.width);
        System.out.println("Height: " + logo1.height);
		System.out.println("Has Text: " + logo1.hasText);
        System.out.println("Text: " + logo1.text);
        System.out.println("IsCircular: " + logo1.isCircular);
        System.out.println("Font Size: " + logo1.fontSize );
		System.out.println("Font Type:" + logo1.fontType );
		System.out.println("Background Color: " + logo1.backgroundColor);
        System.out.println();
		
		Logo logo2 = new Logo("Black",160);
		System.out.println("Color: " + logo2.color);
        System.out.println("Width: " + logo2.width);
        System.out.println("Height: " + logo2.height);
		System.out.println("Has Text: " + logo2.hasText);
        System.out.println("Text: " + logo2.text);
        System.out.println("IsCircular: " + logo2.isCircular);
        System.out.println("Font Size: " + logo2.fontSize );
		System.out.println("Font Type:" + logo2.fontType );
		System.out.println("Background Color: " + logo2.backgroundColor);
        System.out.println();
		
		Logo logo3 = new Logo("Black",160,160);
		System.out.println("Color: " + logo3.color);
        System.out.println("Width: " + logo3.width);
        System.out.println("Height: " + logo3.height);
		System.out.println("Has Text: " + logo3.hasText);
        System.out.println("Text: " + logo3.text);
        System.out.println("IsCircular: " + logo3.isCircular);
        System.out.println("Font Size: " + logo3.fontSize );
		System.out.println("Font Type:" + logo3.fontType );
		System.out.println("Background Color: " + logo3.backgroundColor);
        System.out.println();
		
		Logo logo4 = new Logo("Black",160,160,false);
		System.out.println("Color: " + logo4.color);
        System.out.println("Width: " + logo4.width);
        System.out.println("Height: " + logo4.height);
		System.out.println("Has Text: " + logo4.hasText);
        System.out.println("Text: " + logo4.text);
        System.out.println("IsCircular: " + logo4.isCircular);
        System.out.println("Font Size: " + logo4.fontSize );
		System.out.println("Font Type:" + logo4.fontType );
		System.out.println("Background Color: " + logo4.backgroundColor);
        System.out.println();
		
		Logo logo5 = new Logo("Black",160,160,false, null);
		System.out.println("Color: " + logo5.color);
        System.out.println("Width: " + logo5.width);
        System.out.println("Height: " + logo5.height);
		System.out.println("Has Text: " + logo5.hasText);
        System.out.println("Text: " + logo5.text);
        System.out.println("IsCircular: " + logo5.isCircular);
        System.out.println("Font Size: " + logo5.fontSize );
		System.out.println("Font Type:" + logo5.fontType );
		System.out.println("Background Color: " + logo5.backgroundColor);
        System.out.println();
		
		Logo logo6 = new Logo("Black",160,160,false, null,true);
		System.out.println("Color: " + logo6.color);
        System.out.println("Width: " + logo6.width);
        System.out.println("Height: " + logo6.height);
		System.out.println("Has Text: " + logo6.hasText);
        System.out.println("Text: " + logo6.text);
        System.out.println("IsCircular: " + logo6.isCircular);
        System.out.println("Font Size: " + logo6.fontSize );
		System.out.println("Font Type:" + logo6.fontType );
		System.out.println("Background Color: " + logo6.backgroundColor);
        System.out.println();
		
		Logo logo7 = new Logo("Black",160,160,false, null,true,16);
		System.out.println("Color: " + logo7.color);
        System.out.println("Width: " + logo7.width);
        System.out.println("Height: " + logo7.height);
		System.out.println("Has Text: " + logo7.hasText);
        System.out.println("Text: " + logo7.text);
        System.out.println("IsCircular: " + logo7.isCircular);
        System.out.println("Font Size: " + logo7.fontSize );
		System.out.println("Font Type:" + logo7.fontType );
		System.out.println("Background Color: " + logo7.backgroundColor);
        System.out.println();
		
		Logo logo8 = new Logo("Black",160,160,false, null,true,16,"Times New Roman");
		System.out.println("Color: " + logo8.color);
        System.out.println("Width: " + logo8.width);
        System.out.println("Height: " + logo8.height);
		System.out.println("Has Text: " + logo8.hasText);
        System.out.println("Text: " + logo8.text);
        System.out.println("IsCircular: " + logo8.isCircular);
        System.out.println("Font Size: " + logo8.fontSize );
		System.out.println("Font Type:" + logo8.fontType );
		System.out.println("Background Color: " + logo8.backgroundColor);
        System.out.println();
		
		Logo logo9 = new Logo("Black",160,160,false, null,true,16,"Times New Roman", "White");
		System.out.println("Color: " + logo9.color);
        System.out.println("Width: " + logo9.width);
        System.out.println("Height: " + logo9.height);
		System.out.println("Has Text: " + logo9.hasText);
        System.out.println("Text: " + logo9.text);
        System.out.println("IsCircular: " + logo9.isCircular);
        System.out.println("Font Size: " + logo9.fontSize );
		System.out.println("Font Type:" + logo9.fontType );
		System.out.println("Background Color: " + logo9.backgroundColor);
        System.out.println();
		
		
		System.out.println("Invoking main in OilMain");

        Oil oil1 = new Oil();
        System.out.println();

        Oil oil2 = new Oil("Olive");
        System.out.println("Name: " + oil2.name);
        System.out.println("Type: " + oil2.type);
        System.out.println("Price: " + oil2.price);
        System.out.println();

        Oil oil3 = new Oil("Sesame", "Cooking Oil");
        System.out.println("Name: " + oil3.name);
        System.out.println("Type: " + oil3.type);
        System.out.println("Price: " + oil3.price);
        System.out.println();

        Oil oil4 = new Oil("Sunflower", "Edible Oil", 10.99);
        System.out.println("Name: " + oil4.name);
        System.out.println("Type: " + oil4.type);
        System.out.println("Price: " + oil4.price);
		
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
