class Bureau {
    static String brand;
    static String type;
    int quantity;
    String color;

    Bureau(String brand, String type) {
    System.out.println("Invoking static argument constructor in Bureau");
    this.brand = brand;
    this.type = type;
    }

    Bureau(int quantity, String color) {
    System.out.println("Invoking instance argument constructor in Bureau");
    this.quantity = quantity;
    this.color = color;
    }

    static {
    brand = "Godrej ";
    type = "Wooden"; 
    System.out.println("Invoking static block in Bureau");
    }

    static void printStatic() {
    System.out.println("Invoking static void method in Bureau");
    System.out.println("Brand: " + brand);
    System.out.println("Type: " + type);
    }

    void printInstance() {
    System.out.println("Invoking instance void method in Bureau");
    System.out.println("Quantity: " + quantity);
    System.out.println("Color: " + color);
    }
}


