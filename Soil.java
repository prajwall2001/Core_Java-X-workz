class Soil {
    static String type;
    static String color;
    double phLevel;     
    String moistureLevel;

    Soil(String type, String color) {
    System.out.println("Invoking static argument constructor in Soil");
    this.type = type;
    this.color = color;
    }

    Soil(double phLevel, String moistureLevel) {
    System.out.println("Invoking instance argument constructor in Soil");
    this.phLevel = phLevel;
    this.moistureLevel = moistureLevel;
    }

    static {
    type = "Clayey";
    color = "Brown";
    System.out.println("Invoking static block in Soil");
    }

    static void printStatic() {
    System.out.println("Invoking static void method in Soil");
    System.out.println("Type: " + type);
    System.out.println("Color: " + color);
    }

    void printInstance() {
    System.out.println("Invoking instance void method in Soil");
    System.out.println("pH Level: " + phLevel);
    System.out.println("Moisture Level: " + moistureLevel);
    }
}


