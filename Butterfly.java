class Butterfly {
    static String species;
    static String color;
    int store;
    String pattern;

    Butterfly(String species, String color) {
    System.out.println("Invoking static argument constructor in Butterfly");
    this.species = species;
    this.color = color;
    }

    Butterfly(int store, String pattern) {
    System.out.println("Invoking instance argument constructor in Butterfly");
    this.store = store;
    this.pattern = pattern;
    }

    static {
    species = "Monarch";
    color = "Orange and Black";
    System.out.println("Invoking static block in Butterfly");
    }

    static void printStatic() {
    System.out.println("Invoking static void method in Butterfly");
    System.out.println("Species: " + species);
    System.out.println("Color: " + color);
    }

    void printInstance() {
    System.out.println("Invoking instance void method in Butterfly");
    System.out.println("Store: " + store);
    System.out.println("Pattern: " + pattern);
    }
}


