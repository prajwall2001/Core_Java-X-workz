class Metro {
    String lineName;
    String stationName;
    int numberOfTrains;
    int capacityPerTrain;
    float fare;

    public static void main(String[] args) {
        System.out.println("Invoking main in Metro");

        Metro metro1 = new Metro();
        System.out.println("metro1 default value is " + metro1.lineName);
        System.out.println("metro1 default value is " + metro1.stationName);
        System.out.println("metro1 default value is " + metro1.numberOfTrains);
        System.out.println("metro1 default value is " + metro1.capacityPerTrain);
        System.out.println("metro1 default value is " + metro1.fare);

        System.out.println("\n");

        Metro metro2 = new Metro();
        System.out.println("metro2 default value is " + metro2.lineName);
        System.out.println("metro2 default value is " + metro2.stationName);
        System.out.println("metro2 default value is " + metro2.numberOfTrains);
        System.out.println("metro2 default value is " + metro2.capacityPerTrain);
        System.out.println("metro2 default value is " + metro2.fare);

        metro1.lineName = "Red Line";
        metro1.stationName = "Central Station";
        metro1.numberOfTrains = 10;
        metro1.capacityPerTrain = 200;
        metro1.fare = 2.5f;

        metro2.lineName = "Green Line";
        metro2.stationName = "North Station";
        metro2.numberOfTrains = 8;
        metro2.capacityPerTrain = 150;
        metro2.fare = 2.0f;

        System.out.println("metro1 value is " + metro1.lineName);
        System.out.println("metro1 value is " + metro1.stationName);
        System.out.println("metro1 value is " + metro1.numberOfTrains);
        System.out.println("metro1 value is " + metro1.capacityPerTrain);
        System.out.println("metro1 value is " + metro1.fare);

        System.out.println("\n");

        System.out.println("metro2 value is " + metro2.lineName);
        System.out.println("metro2 value is " + metro2.stationName);
        System.out.println("metro2 value is " + metro2.numberOfTrains);
        System.out.println("metro2 value is " + metro2.capacityPerTrain);
        System.out.println("metro2 value is " + metro2.fare);
    }
}
