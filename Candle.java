class Candle {
    static String scent;
    static String shape;
    int quantity;
    String color;

    Candle(String scent, String shape) {
    System.out.println("Invoking static argument constructor in Candle");
    this.scent = scent;
    this.shape = shape;
    }

    Candle(int quantity, String color) {
    System.out.println("Invoking instance argument constructor in Candle");
    this.quantity = quantity;
    this.color = color;
    }

    static {
    scent = "Vanilla";
    shape = "Pillar";
    System.out.println("Invoking static block in Candle");
    }

    static void printStatic() {
    System.out.println("Invoking static void method in Candle");
    System.out.println("Scent: " + scent);
    System.out.println("Shape: " + shape);
    }

    void printInstance() {
    System.out.println("Invoking instance void method in Candle");
    System.out.println("Quantity: " + quantity);
    System.out.println("Color: " + color);
    }
}


