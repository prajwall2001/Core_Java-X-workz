class TurbineMaker {
    public static void main(String[] args) {
        Turbine turbine = new Turbine();
        System.out.println("\n");
        System.out.println("Invoking main in Turbinemaker");
        System.out.println("Name: " + turbine.name);
        System.out.println("Type: " + turbine.type);
        System.out.println("powerOutput: " + turbine.powerOutput);

        System.out.println("\n");

        Turbine turbine1 = new Turbine("Wind", "Global wind", 120);
        System.out.println("Turbine name: " + turbine1.name);
        System.out.println("Turbine type: " + turbine1.type);
        System.out.println("Turbine powerOutput: " + turbine1.powerOutput);
    }
}
