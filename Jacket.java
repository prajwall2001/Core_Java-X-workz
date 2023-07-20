class Jacket {
    String color;
    String brand;
    int size;
    int numOfItems;
    float price;

    public static void main(String[] values) {
        System.out.println("Invoking main in Jacket");

        Jacket bag = new Jacket();
        System.out.println("bag default value is " + bag.color);
        System.out.println("bag default value is " + bag.brand);
        System.out.println("bag default value is " + bag.size);
        System.out.println("bag default value is " + bag.numOfItems);
        System.out.println("bag default value is " + bag.price);

        System.out.println("\n");

        Jacket jacketPerson = new Jacket();
        System.out.println("jacketPerson default value is " + jacketPerson.color);
        System.out.println("jacketPerson default value is " + jacketPerson.brand);
        System.out.println("jacketPerson default value is " + jacketPerson.size);
        System.out.println("jacketPerson default value is " + jacketPerson.numOfItems);
        System.out.println("jacketPerson default value is " + jacketPerson.price);

        bag.color = "Black";
        bag.brand = "Levi's";
        bag.size = 42;
        bag.numOfItems = 2;
        bag.price = 150.99f;

        jacketPerson.color = "Blue";
        jacketPerson.brand = "Nike";
        jacketPerson.size = 38;
        jacketPerson.numOfItems = 1;
        jacketPerson.price = 99.99f;

        System.out.println("bag updated value is " + bag.color);
        System.out.println("bag updated value is " + bag.brand);
        System.out.println("bag updated value is " + bag.size);
        System.out.println("bag updated value is " + bag.numOfItems);
        System.out.println("bag updated value is " + bag.price);

        System.out.println("\n");

        System.out.println("jacketPerson updated value is " + jacketPerson.color);
        System.out.println("jacketPerson updated value is " + jacketPerson.brand);
        System.out.println("jacketPerson updated value is " + jacketPerson.size);
        System.out.println("jacketPerson updated value is " + jacketPerson.numOfItems);
        System.out.println("jacketPerson updated value is " + jacketPerson.price);
    }
}
