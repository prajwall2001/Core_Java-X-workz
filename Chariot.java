class Chariot { 
 String color;
 int numberOfWheels;
 int numberOfHorses;
 float length;
 float width;
 float height;
 String material;
 boolean hasRoof;
 boolean hasDriverSeat;
 int passengerCapacity;
 boolean isWarChariot;

   Chariot() {
        System.out.println("Invoking no-args constructor");
    }

 Chariot(String color) {
        System.out.println("Invoking String parameterized constructor");
        this.color = color;
    }

     Chariot(String color, int numberOfWheels) {
        System.out.println("Invoking String,int parameterized constructor");
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

 Chariot(String color, int numberOfWheels, int numberOfHorses) {
        System.out.println("Invoking String,int,int parameterized constructor");
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.numberOfHorses = numberOfHorses;
    }

   Chariot(String color, int numberOfWheels, int numberOfHorses, float length) {
        System.out.println("Invoking String,int,int,float parameterized constructor");
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.numberOfHorses = numberOfHorses;
        this.length = length;
    }

  Chariot(String color, int numberOfWheels, int numberOfHorses, float length, float width) {
        System.out.println("Invoking String,int,int,float,float parameterized constructor");
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.numberOfHorses = numberOfHorses;
        this.length = length;
        this.width = width;
    }

    Chariot(String color, int numberOfWheels, int numberOfHorses, float length, float width, float height) {
        System.out.println("Invoking String,int,int,float,float,float parameterized constructor");
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.numberOfHorses = numberOfHorses;
        this.length = length;
        this.width = width;
        this.height = height;
    }

 Chariot(String color, int numberOfWheels, int numberOfHorses, float length, float width, float height, String material) {
        System.out.println("Invoking String,int,int,float,float,float,String parameterized constructor");
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.numberOfHorses = numberOfHorses;
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
    }

    Chariot(String color, int numberOfWheels, int numberOfHorses, float length, float width, float height, String material, boolean hasRoof) {
        System.out.println("Invoking String,int,int,float,float,float,String,boolean parameterized constructor");
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.numberOfHorses = numberOfHorses;
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
        this.hasRoof = hasRoof;
    }

    Chariot(String color, int numberOfWheels, int numberOfHorses, float length, float width, float height, String material, boolean hasRoof, boolean hasDriverSeat) {
        System.out.println("Invoking String,int,int,float,float,float,String,boolean,boolean parameterized constructor");
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.numberOfHorses = numberOfHorses;
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
        this.hasRoof = hasRoof;
        this.hasDriverSeat = hasDriverSeat;
    }

    Chariot(String color, int numberOfWheels, int numberOfHorses, float length, float width, float height, String material, boolean hasRoof, boolean hasDriverSeat, int passengerCapacity) {
        System.out.println("Invoking String,int,int,float,float,float,String,boolean,boolean,int parameterized constructor");
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.numberOfHorses = numberOfHorses;
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
        this.hasRoof = hasRoof;
        this.hasDriverSeat = hasDriverSeat;
        this.passengerCapacity = passengerCapacity;
    }

  Chariot(String color, int numberOfWheels, int numberOfHorses, float length, float width, float height, String material, boolean hasRoof, boolean hasDriverSeat, int passengerCapacity, boolean isWarChariot) {
        System.out.println("Invoking String,int,int,float,float,float,String,boolean,boolean,int,boolean parameterized constructor");
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.numberOfHorses = numberOfHorses;
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
        this.hasRoof = hasRoof;
        this.hasDriverSeat = hasDriverSeat;
        this.passengerCapacity = passengerCapacity;
        this.isWarChariot = isWarChariot;
   
	}
}
