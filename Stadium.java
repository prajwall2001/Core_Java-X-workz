class Stadium {
    String name;
    String location;
    int capacity;
    int numOfMatches;
    float ticketPrice;

    public static void main(String[] args) {
        System.out.println("Invoking main in Stadium");

        Stadium stadiumA = new Stadium();
        System.out.println("stadiumA default value is " + stadiumA.name);
        System.out.println("stadiumA default value is " + stadiumA.location);
        System.out.println("stadiumA default value is " + stadiumA.capacity);
        System.out.println("stadiumA default value is " + stadiumA.numOfMatches);
        System.out.println("stadiumA default value is " + stadiumA.ticketPrice);

        System.out.println();

        Stadium stadiumB = new Stadium();
        System.out.println("stadiumB default value is " + stadiumB.name);
        System.out.println("stadiumB default value is " + stadiumB.location);
        System.out.println("stadiumB default value is " + stadiumB.capacity);
        System.out.println("stadiumB default value is " + stadiumB.numOfMatches);
        System.out.println("stadiumB default value is " + stadiumB.ticketPrice);

        stadiumA.name = "Wembley Stadium";
        stadiumA.location = "London, UK";
        stadiumA.capacity = 90000;
        stadiumA.numOfMatches = 20;
        stadiumA.ticketPrice = 50.5f;

        stadiumB.name = "Camp Nou";
        stadiumB.location = "Barcelona, Spain";
        stadiumB.capacity = 99000;
        stadiumB.numOfMatches = 18;
        stadiumB.ticketPrice = 60.75f;

        System.out.println();

        System.out.println("stadiumA value is " + stadiumA.name);
        System.out.println("stadiumA value is " + stadiumA.location);
        System.out.println("stadiumA value is " + stadiumA.capacity);
        System.out.println("stadiumA value is " + stadiumA.numOfMatches);
        System.out.println("stadiumA value is " + stadiumA.ticketPrice);

        System.out.println();

        System.out.println("stadiumB value is " + stadiumB.name);
        System.out.println("stadiumB value is " + stadiumB.location);
        System.out.println("stadiumB value is " + stadiumB.capacity);
        System.out.println("stadiumB value is " + stadiumB.numOfMatches);
        System.out.println("stadiumB value is " + stadiumB.ticketPrice);
    }
}
