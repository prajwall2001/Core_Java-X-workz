class Oil {
    String name;
    String type;
    double price;

    Oil() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.name);
        System.out.println("Inside constructor: " + this.type);
        System.out.println("Inside constructor: " + this.price);
    }

    Oil(String name) {
        System.out.println("Invoking String parameterized constructor");
        this.name = name;
    }

    Oil(String name, String type) {
        System.out.println("Invoking String, String parameterized constructor");
        this.name = name;
        this.type = type;
    }

    Oil(String name, String type, double price) {
        System.out.println("Invoking String, String, double parameterized constructor");
        this.name = name;
        this.type = type;
        this.price = price;
    }
}

 