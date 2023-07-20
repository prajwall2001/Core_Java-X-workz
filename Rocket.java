class Rocket {
    String name;
    String manufacturer;
    int payloadCapacity;

    Rocket() {
        System.out.println("Invoking no args constructor");
        System.out.println("Inside constructor: " + this.name);
        System.out.println("Inside constructor: " + this.manufacturer);
        System.out.println("Inside constructor: " + this.payloadCapacity);
    }

    Rocket(String name, String manufacturer, int payloadCapacity) {
        System.out.println("Invoking constructor by passing parameters");
        this.name = name;
        this.manufacturer = manufacturer;
        this.payloadCapacity = payloadCapacity;
    }
}

