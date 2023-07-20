class Gym {
    String name;
    String location;
    int capacity;
    int numOfMembers;
    float membershipFee;

    public static void main(String[] args) {
        System.out.println("Invoking main in Gym");

        Gym ref = new Gym();
        System.out.println("ref default value is " + ref.name);
        System.out.println("ref default value is " + ref.location);
        System.out.println("ref default value is " + ref.capacity);
        System.out.println("ref default value is " + ref.numOfMembers);
        System.out.println("ref default value is " + ref.membershipFee);

        System.out.println();

        Gym store = new Gym();
        System.out.println("store default value is " + store.name);
        System.out.println("store default value is " + store.location);
        System.out.println("store default value is " + store.capacity);
        System.out.println("store default value is " + store.numOfMembers);
        System.out.println("store default value is " + store.membershipFee);

        ref.name = "Fitness Zone";
        ref.location = "City Center";
        ref.capacity = 200;
        ref.numOfMembers = 150;
        ref.membershipFee = 100.0f;

        store.name = "Muscle Factory";
        store.location = "Downtown";
        store.capacity = 100;
        store.numOfMembers = 80;
        store.membershipFee = 150.0f;

        System.out.println();

        System.out.println("ref value is " + ref.name);
        System.out.println("ref value is " + ref.location);
        System.out.println("ref value is " + ref.capacity);
        System.out.println("ref value is " + ref.numOfMembers);
        System.out.println("ref value is " + ref.membershipFee);

        System.out.println();

        System.out.println("store value is " + store.name);
        System.out.println("store value is " + store.location);
        System.out.println("store value is " + store.capacity);
        System.out.println("store value is " + store.numOfMembers);
        System.out.println("store value is " + store.membershipFee);
    }
}
