class Soda {
    static void drink(String brand,String type, int quantity) {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Quantity: " + quantity);
		if (brand != null) {
            System.out.println("Brand: " + brand);
        } else {
            System.err.println("Brand not specified");
        }

        if (type != null) {
            System.out.println("Type: " + type);
        } else {
            System.err.println("Type not specified");
        }

        if (quantity >= 0) {
            System.out.println("Quantity: " + quantity);
        } else {
            System.err.println("Invalid quantity");
        }
    }

 }