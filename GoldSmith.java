class GoldSmith {
    static void bakeCake(String flavor, String icing, int numberOfLayers) {
        System.out.println("Cake Flavor: " + flavor);
        System.out.println("Cake Icing: " + icing);
        System.out.println("Number of Layers: " + numberOfLayers);
		 if (flavor != null) {
            System.out.println("Cake Flavor: " + flavor);
        } else {
            System.err.println("Cake Flavor not specified");
        }

        if (icing != null) {
            System.out.println("Cake Icing: " + icing);
        } else {
            System.err.println("Cake Icing not specified");
        }

        if (numberOfLayers > 0) {
            System.out.println("Number of Layers: " + numberOfLayers);
        } else {
            System.err.println("Invalid number of layers");
        }
    }
}
