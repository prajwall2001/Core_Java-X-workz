class GraphicsCardTaker {
    public static void main(String[] args) {
        GraphicsCard laptop = new GraphicsCard();
        System.out.println("\n");

        System.out.println("Invoking main in GraphicsCardTaker");
        System.out.println("Brand: " + laptop.brand);
        System.out.println("Model: " + laptop.model);
        System.out.println("Memory Size: " + laptop.memorySize);

        System.out.println("\n");

        GraphicsCard laptop1 = new GraphicsCard("Nvidia", "RTX 3080", 10);
        System.out.println("Brand: " + laptop1.brand);
        System.out.println("Model: " + laptop1.model);
        System.out.println("Memory Size: " + laptop1.memorySize);
    }
}
