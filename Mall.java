class Mall {
    double area;
    String name;
    int numberOfStores;
    String location;
    float rating;
    boolean hasParking;
    int floors;

    Mall(double area) {
        this.area = area;
        System.out.println("Invoking constructor with double argument");
        System.out.println("Name of area: " + area);
    }

    Mall(double area, String name) {
        this(area);
        this.name = name;
        System.out.println("Invoking constructor with double and string arguments");
        System.out.println("Name of area and Mall name: " + area + ", " + name);
    }

    Mall(double area, String name, int numberOfStores) {
        this(area, name);
        this.numberOfStores = numberOfStores;
        System.out.println("Invoking constructor with double, string, and int arguments");
        System.out.println("Name of area,Mall name, and numberOfStores in mall: " + area + ", " + name + ", " + numberOfStores);
    }

    Mall(double area, String name, int numberOfStores, String location) {
        this(area, name, numberOfStores);
        this.location = location;
        System.out.println("Invoking constructor with double, string, int, and string arguments");
        System.out.println("Name of area,Mall name,  numberOfStores and location of mall: " + area + ", " + name + ", " + numberOfStores + ", " + location);
    }

    Mall(double area, String name, int numberOfStores, String location, float rating) {
        this(area, name, numberOfStores, location);
        this.rating = rating;
        System.out.println("Invoking constructor with double, string, int, string, and float arguments");
        System.out.println("Name of area,Mall name,  numberOfStores ,location and rating of mall:  " + area + ", " + name + ", " + numberOfStores + ", " + location + ", " + rating);
    }

    Mall(double area, String name, int numberOfStores, String location, float rating, boolean hasParking) {
        this(area, name, numberOfStores, location, rating);
        this.hasParking = hasParking;
        System.out.println("Invoking constructor with double, string, int, string, float, and boolean arguments");
        System.out.println("Name of area,Mall name,  numberOfStores ,location, rating and hasParking in mall: " + area + ", " + name + ", " + numberOfStores + ", " + location + ", " + rating + ", " + hasParking);
    }

    Mall(double area, String name, int numberOfStores, String location, float rating, boolean hasParking, int floors) {
        this(area, name, numberOfStores, location, rating, hasParking);
        this.floors = floors;
        System.out.println("Invoking constructor with all arguments");
        System.out.println("All properties of Mall: " + area + ", " + name + ", " + numberOfStores + ", " + location + ", " + rating + ", " + hasParking + ", " + floors);
    }
}


