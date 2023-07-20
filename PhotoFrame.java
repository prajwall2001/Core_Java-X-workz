class PhotoFrame {
    String color;
    int width;
    int height;

    PhotoFrame() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.color);
        System.out.println("Inside constructor: " + this.width);
        System.out.println("Inside constructor: " + this.height);
    }

    PhotoFrame(String color, int width, int height) {
        System.out.println("Invoking constructor by passing parameters");
        this.color = color;
        this.width = width;
        this.height = height;
    }
}


