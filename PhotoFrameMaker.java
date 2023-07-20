class PhotoFrameMaker {
    public static void main(String[] args) {
        PhotoFrame frame = new PhotoFrame();
        System.out.println();

        System.out.println("Invoking main in PhotoFrameMaker");
        System.out.println("Color: " + frame.color);
        System.out.println("Width: " + frame.width);
        System.out.println("Height: " + frame.height);

        System.out.println();

        PhotoFrame frame1 = new PhotoFrame("Black", 10, 12);
        System.out.println("Frame color: " + frame1.color);
        System.out.println("Frame width: " + frame1.width);
        System.out.println("Frame height: " + frame1.height);
    }
}