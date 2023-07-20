class WeighMachine {
    static void weigh(String location, String date, int weight) {
        System.out.println("Location is: " + location);
        System.out.println("On: " + date);
        System.out.println("Weight: " + weight + " kg");
		if (location != null) {
            System.out.println("Location is: " + location);
			return;
        } else {
            System.err.println("Location is not provided");
        }

        if (date != null) {
            System.out.println("On: " + date);
			return;
        } else {
            System.err.println("Date is not provided");
        }

        if (weight >= 0) {
            System.out.println("Weight: " + weight + " kg");
			return;
        } else {
            System.err.println("Invalid weight provided");
        }
    }
}
