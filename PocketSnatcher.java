class Pocket{
	String color;
    String brand ;
	int size ;
	int numOfItems;
	float price;
    public static void main(String[] args) {
        System.out.println("Invoking main in PocketSnatcher");
        
        Pocket pocketMan = new Pocket();
        System.out.println("pocketMan defualt value is "+pocketMan.color); 
        System.out.println("pocketMan defualt value is "+pocketMan.brand);
        System.out.println("pocketMan defualt value is "+pocketMan.size); 
        System.out.println("pocketMan defualt value is "+pocketMan.numOfItems);
        System.out.println("pocketMan defualt value is "+pocketMan.price); 
		
         System.out.println("\n");
        
        Pocket pocketPerson = new Pocket();
        System.out.println("pocketPerson defualt value is "+pocketPerson.color); 
        System.out.println("pocketPerson defualt value is "+pocketPerson.brand); 
        System.out.println("pocketPerson defualt value is "+pocketPerson.size); 
        System.out.println("pocketPerson defualt value is "+pocketPerson.numOfItems);
        System.out.println("pocketPerson defualt value is "+pocketPerson.price);
		
		pocket.color = "Black";
        pocket.brand = "Woodland";
        pocket.size = 30;
        pocket.numOfItems = 10; 
        pocket.price = 250;
        
        pocketPerson.color = "Red";
        pocketPerson.brand = "Puma";
        pocketPerson.size = 20;
        pocketPerson.numOfItems = 7; 
        pocketPerson.price = 500;
		
		Pocket pocketMan = new Pocket();
        System.out.println("pocketMan defualt value is "+pocketMan.color); 
        System.out.println("pocketMan defualt value is "+pocketMan.brand);
        System.out.println("pocketMan defualt value is "+pocketMan.size); 
        System.out.println("pocketMan defualt value is "+pocketMan.numOfItems);
        System.out.println("pocketMan defualt value is "+pocketMan.price); 
		
         System.out.println("\n");
        
        Pocket pocketPerson = new Pocket();
        System.out.println("pocketPerson defualt value is "+pocketPerson.color); 
        System.out.println("pocketPerson defualt value is "+pocketPerson.brand); 
        System.out.println("pocketPerson defualt value is "+pocketPerson.size); 
        System.out.println("pocketPerson defualt value is "+pocketPerson.numOfItems);
        System.out.println("pocketPerson defualt value is "+pocketPerson.price);
    }
}
