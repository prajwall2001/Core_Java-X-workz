class RocketLauncher {
    public static void main(String[] args) {
        Rocket schedule = new Rocket();
        System.out.println("\n");
        System.out.println("Invoking main in Rocket launcher");
        System.out.println("Name: " + schedule.name);
        System.out.println("Manufacturer: " + schedule.manufacturer);
        System.out.println("Payload Capacity: " + schedule.payloadCapacity);

        System.out.println("\n");

        Rocket schedule1 = new Rocket("Falcon 9", "SpaceX", 22800);
        System.out.println("Rocket name: " + schedule1.name);
        System.out.println("Manufacturer: " + schedule1.manufacturer);
        System.out.println("Payload Capacity: " + schedule1.payloadCapacity);
    }
}
