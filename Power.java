class Power {
    static String brand;
    static String type;
    int capacity;
    String color;

    Power(String brand, String type) {
    System.out.println("Invoking static argument constructor in Power");
    this.brand = brand;
    this.type = type;
    }

    Power(int capacity, String color) {
    System.out.println("Invoking instance argument constructor in Power");
    this.capacity = capacity;
    this.color = color;
    }

    static {
    brand = "ABC Power";
    type = "Battery"; 
    System.out.println("Invoking static block in Power");
    }

    static void printStatic() {
    System.out.println("Invoking static void method in Power");
    System.out.println("Brand: " + brand);
    System.out.println("Type: " + type);
    }

    void printInstance() {
    System.out.println("Invoking instance void method in Power");
    System.out.println("Capacity: " + capacity);
    System.out.println("Color: " + color);
    }
}


