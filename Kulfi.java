class Kulfi {
    static void eat(String flavor, double price, int scoops) {
        System.out.println("Flavor: " + flavor);
        System.out.println("Cost Rs: " + price);
        System.out.println("Number of scoops: " + scoops);
		if (flavor != null && !flavor.isEmpty()) {
            System.out.println("Flavor: " + flavor);
			return;
        } else {
            System.err.println("No flavor specified.");
        }

        if (price > 0) {
            System.out.println("Cost Rs: " + price);
			return;
        } else {
            System.err.println("Invalid price.");
        }

        if (scoops > 0) {
            System.out.println("Number of scoops: " + scoops);
			return;
        } else {
            System.err.println("Invalid number of scoops.");
        }
    }
}
