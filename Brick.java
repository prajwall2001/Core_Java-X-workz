class Brick {
    static String brand;
    static String type;
    int weight;
    String color;

    Brick(String brand, String type) {
    System.out.println("Invoking static argument constructor in Brick");
    this.brand = brand;
    this.type = type;
    }

    Brick(int weight, String color) {
    System.out.println("Invoking instance argument constructor in Brick");
    this.weight = weight;
    this.color = color;
    }

    static {
    brand = "Mud Bricks";
    type = "Red Clay";
    System.out.println("Invoking static block in Brick");
    }

    static void printStatic() {
    System.out.println("Invoking static void method in Brick");
    System.out.println("Brand: " + brand);
    System.out.println("Type: " + type);
    }

    void printInstance() {
    System.out.println("Invoking instance void method in Brick");
    System.out.println("Weight: " + weight);
    System.out.println("Color: " + color);
    }
}


