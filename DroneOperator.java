class DroneOperator {
    public static void main(String[] args) {
        System.out.println("Running main in DroneKiller");

        double ref = Drone.getDistanceByFlight("DroneX", "Aerial Survey");
        System.out.println("ref is: " + ref);

        ref = Drone.getDistanceByFlight("FlyCam", "Cargo Transport");
        System.out.println("ref is: " + ref);

        ref = Drone.getDistanceByFlight(null, null);
        System.out.println("ref is: " + ref);

        ref = Drone.getDistanceByFlight("UnknownOperator", "Generalism");
        System.out.println("ref is: " + ref);

        System.out.println("##############################");

        double price = Drone.getPricePerEvent("Aerial Survey");
        System.out.println("price is: " + price);

        price = Drone.getPricePerEvent("Cargo Transport");
        System.out.println("price is: " + price);

        price = Drone.getPricePerEvent(null);
        System.out.println("price is: " + price);

        price = Drone.getPricePerEvent("Generalism");
        System.out.println("price is: " + price);

        System.out.println("##############################");

        int discount = Drone.getDiscountByEvent("Aerial Survey", "Alexa");
        System.out.println("discount is: " + discount);

        discount = Drone.getDiscountByEvent("Cargo Transport", "Siri");
        System.out.println("discount is: " + discount);

        discount = Drone.getDiscountByEvent(null, null);
        System.out.println("discount is: " + discount);

        discount = Drone.getDiscountByEvent("Generalism", "Messi");
        System.out.println("discount is: " + discount);
    }
}
