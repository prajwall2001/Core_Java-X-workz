class WirelessController {
    String model;
    String brand;
    boolean isWireless;
    int numberOfButtons;
    float price;

    public static void main(String[] args) {
        System.out.println("Invoking main in WirelessController");

        WirelessController controller1 = new WirelessController();
        System.out.println("controller1 default value is " + controller1.model);
        System.out.println("controller1 default value is " + controller1.brand);
        System.out.println("controller1 default value is " + controller1.isWireless);
        System.out.println("controller1 default value is " + controller1.numberOfButtons);
        System.out.println("controller1 default value is " + controller1.price);

        System.out.println("\n");

        WirelessController controller2 = new WirelessController();
        System.out.println("controller2 default value is " + controller2.model);
        System.out.println("controller2 default value is " + controller2.brand);
        System.out.println("controller2 default value is " + controller2.isWireless);
        System.out.println("controller2 default value is " + controller2.numberOfButtons);
        System.out.println("controller2 default value is " + controller2.price);

        controller1.model = "Xbox One Controller";
        controller1.brand = "Microsoft";
        controller1.isWireless = true;
        controller1.numberOfButtons = 12;
        controller1.price = 59.99f;

        controller2.model = "DualShock 4";
        controller2.brand = "Sony";
        controller2.isWireless = true;
        controller2.numberOfButtons = 14;
        controller2.price = 49.99f;

        System.out.println("controller1 value is " + controller1.model);
        System.out.println("controller1 value is " + controller1.brand);
        System.out.println("controller1 value is " + controller1.isWireless);
        System.out.println("controller1 value is " + controller1.numberOfButtons);
        System.out.println("controller1 value is " + controller1.price);

        System.out.println("\n");

        System.out.println("controller2 value is " + controller2.model);
        System.out.println("controller2 value is " + controller2.brand);
        System.out.println("controller2 value is " + controller2.isWireless);
        System.out.println("controller2 value is " + controller2.numberOfButtons);
        System.out.println("controller2 value is " + controller2.price);
    }
}
