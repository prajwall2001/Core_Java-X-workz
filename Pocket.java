class Pocket{
	String color;
    String brand ;
	int size ;
	int numOfItems;
	float price;
    public static void main(String[] values) {
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
		
		pocketMan.color = "Black";
        pocketMan.brand = "Woodland";
        pocketMan.size = 30;
        pocketMan.numOfItems = 10; 
        pocketMan.price = 250;
        
        pocketPerson.color = "Red";
        pocketPerson.brand = "Puma";
        pocketPerson.size = 20;
        pocketPerson.numOfItems = 7; 
        pocketPerson.price = 500;
		
	
        System.out.println("pocketMan defualt value is "+pocketMan.color); 
        System.out.println("pocketMan defualt value is "+pocketMan.brand);
        System.out.println("pocketMan defualt value is "+pocketMan.size); 
        System.out.println("pocketMan defualt value is "+pocketMan.numOfItems);
        System.out.println("pocketMan defualt value is "+pocketMan.price); 
		
         System.out.println("\n");
        
       
        System.out.println("pocketPerson defualt value is "+pocketPerson.color); 
        System.out.println("pocketPerson defualt value is "+pocketPerson.brand); 
        System.out.println("pocketPerson defualt value is "+pocketPerson.size); 
        System.out.println("pocketPerson defualt value is "+pocketPerson.numOfItems);
        System.out.println("pocketPerson defualt value is "+pocketPerson.price);
    }
}
