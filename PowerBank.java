class PowerBank {
    String color;
    String brand;
    int capacity;
    int numOfItems;
    float price;

    public static void main(String[] args) {
        System.out.println("Invoking main in PowerBank");
        
        PowerBank tablets = new PowerBank();
        System.out.println("tablets default value is " + tablets.color);
        System.out.println("tablets default value is " + tablets.brand);
        System.out.println("tablets default value is " + tablets.capacity);
        System.out.println("tablets default value is " + tablets.numOfItems);
        System.out.println("tablets default value is " + tablets.price);
        
        System.out.println("\n");
        
        PowerBank mobile = new PowerBank();
        System.out.println("mobile default value is " + mobile.color);
        System.out.println("mobile default value is " + mobile.brand);
        System.out.println("mobile default value is " + mobile.capacity);
        System.out.println("mobile default value is " + mobile.numOfItems);
        System.out.println("mobile default value is " + mobile.price);
        
        tablets.color = "Black";
        tablets.brand = "Anker";
        tablets.capacity = 20000;
        tablets.numOfItems = 5;
        tablets.price = 500.99f;
        
       mobile.color = "White";
       mobile.brand = "RAVPower";
       mobile.capacity = 10000;
       mobile.numOfItems = 3;
       mobile.price = 599.99f;
        
        System.out.println("\n");
        
        System.out.println("tablets value is " + tablets.color);
        System.out.println("tablets value is " + tablets.brand);
        System.out.println("tablets value is " + tablets.capacity);
        System.out.println("tablets value is " + tablets.numOfItems);
        System.out.println("tablets value is " + tablets.price);
        
        System.out.println("\n");
        
        System.out.println("mobile value is " + mobile.color);
        System.out.println("mobile value is " + mobile.brand);
        System.out.println("mobile value is " + mobile.capacity);
        System.out.println("mobile value is " + mobile.numOfItems);
        System.out.println("mobile value is " + mobile.price);
    }
}
