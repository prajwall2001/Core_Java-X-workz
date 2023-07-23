class Helmet {
    static String logo;
    static String type;
    int quantity;
    String color;

    Helmet(String logo, String type) {
    System.out.println("Invoking static argument constructor in Helmet");
    this.logo = logo;
    this.type = type;
    }

    Helmet(int quantity, String color) {
    System.out.println("Invoking instance argument constructor in Helmet");
    this.quantity = quantity;
    this.color = color;
    }

    static {
    logo = "Street Rider";
    type = "Half Face"; 
    System.out.println("Invoking static block in Helmet");
    }

    static void printStatic() {
    System.out.println("Invoking static void method in Helmet");
    System.out.println("Logo: " + logo);
    System.out.println("Type: " + type);
    }

    void printInstance() {
    System.out.println("Invoking instance void method in Helmet");
    System.out.println("Quantity: " + quantity);
    System.out.println("Color: " + color);
    }
}


