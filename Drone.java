class Drone {
    static double getDistanceByFlight(String operator, String event) {
        System.out.println("Invoking getDistanceByFlight in Drone");
        if (operator != null && event != null) {
            System.out.println("Operator and event are valid");
            if (operator=="DroneX") && event=="Aerial Survey") {
                return 3.5;
            }
            if (operator=="FlyCam" && event=="Cargo Transport") {
                return 9.8;
            }
        } else {
            System.out.println("Operator and event are invalid");
            return -1.0;
        }

        return 1.0;
    }

    static double getPricePerEvent(String eventName) {
        System.out.println("Invoking getPricePerEvent in Drone");
        if (eventName != null) {
            System.out.println("Event name is valid");
            if (eventName=="Aerial Survey") {
                return 6000.0;
            }
            if (eventName=="Cargo Transport") {
                return 4000.50;
            }
        } else {
            System.out.println("Event name is invalid");
            return 500.0;
        }

        return 100;
    }

    static int getDiscountByEvent(String eventName, String refPerson) {
        System.out.println("Invoking getDiscountByEvent in Drone");
        if (eventName != null && refPerson != null) {
            System.out.println("Event name and referred person are valid");
            if (eventName=="Aerial Survey" && refPerson=="Alexa") {
                return 70;
            }
            if (eventName=="Cargo Transport" && refPerson=="Siri") {
                return 90;
            }
        } else {
            System.out.println("Event name and referred person are invalid");
            return -1;
        }

        return 10;
    }
}

