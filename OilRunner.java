class OilRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in OilMain");

        Oil oil1 = new Oil();
        System.out.println();

        Oil oil2 = new Oil("Olive");
        System.out.println("Name: " + oil2.name);
        System.out.println("Type: " + oil2.type);
        System.out.println("Price: " + oil2.price);
        System.out.println();

        Oil oil3 = new Oil("Sesame", "Cooking Oil");
        System.out.println("Name: " + oil3.name);
        System.out.println("Type: " + oil3.type);
        System.out.println("Price: " + oil3.price);
        System.out.println();

        Oil oil4 = new Oil("Sunflower", "Edible Oil", 10.99);
        System.out.println("Name: " + oil4.name);
        System.out.println("Type: " + oil4.type);
        System.out.println("Price: " + oil4.price);
    }
}
