class Park {
    double area;
    String location;
    int numberOfTrees;
    String parkType;
    boolean hasPlayground;
    int numberOfBenches;
    boolean hasFountain;
    int numberOfFlowerBeds;
    String parkName;

    Park(double area) {
        super();
        this.area = area;
        System.out.println("Invoking double constructor");
        System.out.println("Name of area: " + area);
    }

    Park(double area, String location) {
        this(area);
        this.location = location;
        System.out.println("Invoking double, string constructor");
        System.out.println("Name of area and location: " + area + ", " + location);
    }

    Park(double area, String location, int numberOfTrees) {
        this(area, location);
        this.numberOfTrees = numberOfTrees;
        System.out.println("Invoking double, string, int constructor");
        System.out.println("Name of area, location, and numberOfTrees: " + area + ", " + location + ", " + numberOfTrees);
    }

    Park(double area, String location, int numberOfTrees, String parkType) {
        this(area, location, numberOfTrees);
        this.parkType = parkType;
        System.out.println("Invoking double, string, int, string constructor");
        System.out.println("Name of area, location, numberOfTrees, and parkType: " + area + ", " + location + ", " + numberOfTrees + ", " + parkType);
    }

    Park(double area, String location, int numberOfTrees, String parkType, boolean hasPlayground) {
        this(area, location, numberOfTrees, parkType);
        this.hasPlayground = hasPlayground;
        System.out.println("Invoking double, string, int, string, boolean constructor");
        System.out.println("Name of area, location, numberOfTrees, parkType, and hasPlayground: " + area + ", " + location + ", " + numberOfTrees + ", " + parkType + ", " + hasPlayground);
    }

    Park(double area, String location, int numberOfTrees, String parkType, boolean hasPlayground, int numberOfBenches) {
        this(area, location, numberOfTrees, parkType, hasPlayground);
        this.numberOfBenches = numberOfBenches;
        System.out.println("Invoking double, string, int, string, boolean, int constructor");
        System.out.println("Name of area, location, numberOfTrees, parkType, hasPlayground, and numberOfBenches: " + area + ", " + location + ", " + numberOfTrees + ", " + parkType + ", " + hasPlayground + ", " + numberOfBenches);
    }

    Park(double area, String location, int numberOfTrees, String parkType, boolean hasPlayground, int numberOfBenches, boolean hasFountain) {
        this(area, location, numberOfTrees, parkType, hasPlayground, numberOfBenches);
        this.hasFountain = hasFountain;
        System.out.println("Invoking double, string, int, string, boolean, int, boolean constructor");
        System.out.println("Name of area, location, numberOfTrees, parkType, hasPlayground, numberOfBenches, and hasFountain: " + area + ", " + location + ", " + numberOfTrees + ", " + parkType + ", " + hasPlayground + ", " + numberOfBenches + ", " + hasFountain);
    }

    Park(double area, String location, int numberOfTrees, String parkType, boolean hasPlayground, int numberOfBenches, boolean hasFountain, int numberOfFlowerBeds) {
        this(area, location, numberOfTrees, parkType, hasPlayground, numberOfBenches, hasFountain);
        this.numberOfFlowerBeds = numberOfFlowerBeds;
        System.out.println("Invoking double, string, int, string, boolean, int, boolean, int constructor");
        System.out.println("Name of area, location, numberOfTrees, parkType, hasPlayground, numberOfBenches, hasFountain, and numberOfFlowerBeds: " + area + ", " + location + ", " + numberOfTrees + ", " + parkType + ", " + hasPlayground + ", " + numberOfBenches + ", " + hasFountain + ", " + numberOfFlowerBeds);
    }

    Park(double area, String location, int numberOfTrees, String parkType, boolean hasPlayground, int numberOfBenches, boolean hasFountain, int numberOfFlowerBeds, String parkName) {
        this(area, location, numberOfTrees, parkType, hasPlayground, numberOfBenches, hasFountain, numberOfFlowerBeds);
        this.parkName = parkName;
        System.out.println("Invoking all properties constructor");
        System.out.println("All Properties of Park: " + area + ", " + location + ", " + numberOfTrees + ", " + parkType + ", " + hasPlayground + ", " + numberOfBenches + ", " + hasFountain + ", " + numberOfFlowerBeds+ "," +parkName);
    }
}


