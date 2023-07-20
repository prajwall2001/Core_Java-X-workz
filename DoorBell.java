class DoorBell {
  
 String color;
 String material;
 int numberOfButtons;
 boolean hasCamera;
 boolean hasIntercom;
 double height;
 double width;
 
    DoorBell() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.color);
        System.out.println("Inside constructor: " + this.material);
        System.out.println("Inside constructor: " + this.numberOfButtons);
        System.out.println("Inside constructor: " + this.hasCamera);
        System.out.println("Inside constructor: " + this.hasIntercom);
        System.out.println("Inside constructor: " + this.height);
        System.out.println("Inside constructor: " + this.width);
    }

    DoorBell(String color) {
        System.out.println("Invoking String parameterized constructor");
        this.color = color;
    }

    DoorBell(String color, String material) {
        System.out.println("Invoking String, String parameterized constructor");
        this.color = color;
        this.material = material;
    }

    DoorBell(String color, String material, int numberOfButtons) {
        System.out.println("Invoking String, String, int parameterized constructor");
        this.color = color;
        this.material = material;
        this.numberOfButtons = numberOfButtons;
    }

    DoorBell(String color, String material, int numberOfButtons, boolean hasCamera) {
        System.out.println("Invoking String, String, int, boolean parameterized constructor");
        this.color = color;
        this.material = material;
        this.numberOfButtons = numberOfButtons;
        this.hasCamera = hasCamera;
    }

    DoorBell(String color, String material, int numberOfButtons, boolean hasCamera, boolean hasIntercom) {
        System.out.println("Invoking String, String, int, boolean, boolean parameterized constructor");
        this.color = color;
        this.material = material;
        this.numberOfButtons = numberOfButtons;
        this.hasCamera = hasCamera;
        this.hasIntercom = hasIntercom;
    }

    DoorBell(String color, String material, int numberOfButtons, boolean hasCamera, boolean hasIntercom, double height) {
        System.out.println("Invoking String, String, int, boolean, boolean, double parameterized constructor");
        this.color = color;
        this.material = material;
        this.numberOfButtons = numberOfButtons;
        this.hasCamera = hasCamera;
        this.hasIntercom = hasIntercom;
        this.height = height;
    }

    DoorBell(String color, String material, int numberOfButtons, boolean hasCamera, boolean hasIntercom, double height, double width) {
        System.out.println("Invoking String, String, int, boolean, boolean, double, double parameterized constructor");
        this.color = color;
        this.material = material;
        this.numberOfButtons = numberOfButtons;
        this.hasCamera = hasCamera;
        this.hasIntercom = hasIntercom;
        this.height = height;
        this.width = width;
    }
}
