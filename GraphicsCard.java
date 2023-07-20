class GraphicsCard {
    String brand;
    String model;
    int memorySize;

    GraphicsCard() {
        System.out.println("Invoking no args constructor");
        System.out.println("Inside constructor " + this.brand);
        System.out.println("Inside constructor " + this.model);
        System.out.println("Inside constructor " + this.memorySize);
    }

    GraphicsCard(String brand, String model, int memorySize) {
        System.out.println("Invoking constructor by passing parameters");
        this.brand = brand;
        this.model = model;
        this.memorySize = memorySize;
    }
}

