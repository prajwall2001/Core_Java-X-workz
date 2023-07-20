class Turbine {
    String name;
    String type;
    double powerOutput;

    Turbine() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.name);
        System.out.println("Inside constructor: " + this.type);
        System.out.println("Inside constructor: " + this.powerOutput);
    }

    Turbine(String name, String type,double powerOutput) {
        System.out.println("Invoking constructor by passing parameters");
        this.name = name;
        this.type = type;
        this.powerOutput = powerOutput;
    }
}

