class CityPlayer{
public static void main(String[] args)
{
City player=new City();
System.out.println("\n");
System.out.println("Invoking main in CityPlayer");
	System.out.println("Name:" +player.name);
	System.out.println("State:" +player.state);
	System.out.println("Pincode:" +player.pincode);
	
	System.out.println("\n");
	
	City player1=new City("Banglore","Karnataka",500680);
	
	System.out.println("City name:"   +player1.name);
	System.out.println("State of the city:"  +player1.state);
	System.out.println("Pincode of city:"+player1.pincode);
	
}
}