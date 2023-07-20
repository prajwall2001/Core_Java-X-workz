class Badminton {
    String color;
    String brand;
    int size;
    int numOfRackets;
    float price;

    public static void main(String[] values) {
        System.out.println("Invoking main in Badminton");

        Badminton racket1 = new Badminton();
        System.out.println("racket1 default value is " + racket1.color);
        System.out.println("racket1 default value is " + racket1.brand);
        System.out.println("racket1 default value is " + racket1.size);
        System.out.println("racket1 default value is " + racket1.numOfRackets);
        System.out.println("racket1 default value is " + racket1.price);

        System.out.println("\n");

        Badminton racket2 = new Badminton();
        System.out.println("racket2 default value is " + racket2.color);
        System.out.println("racket2 default value is " + racket2.brand);
        System.out.println("racket2 default value is " + racket2.size);
        System.out.println("racket2 default value is " + racket2.numOfRackets);
        System.out.println("racket2 default value is " + racket2.price);

        racket1.color = "Black";
        racket1.brand = "Yonex";
        racket1.size = 3;
        racket1.numOfRackets = 2;
        racket1.price = 200;

        racket2.color = "Blue";
        racket2.brand = "Li-Ning";
        racket2.size = 4;
        racket2.numOfRackets = 1;
        racket2.price = 150;

        System.out.println("\n");

        System.out.println("racket1 value is " + racket1.color);
        System.out.println("racket1 value is " + racket1.brand);
        System.out.println("racket1 value is " + racket1.size);
        System.out.println("racket1 value is " + racket1.numOfRackets);
        System.out.println("racket1 value is " + racket1.price);

        System.out.println("\n");

        System.out.println("racket2 value is " + racket2.color);
        System.out.println("racket2 value is " + racket2.brand);
        System.out.println("racket2 value is " + racket2.size);
        System.out.println("racket2 value is " + racket2.numOfRackets);
        System.out.println("racket2 value is " + racket2.price);
    }
}
