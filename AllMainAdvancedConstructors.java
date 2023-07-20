class AllMainAdvancedConstructors{
public static void main(String[] args)
{
System.out.println("Invoking main in WoodMaker");
Wood wood=new Wood(1000.50,"brownish red",30.1f,"softwood",75);
System.out.println("\n");

System.out.println("Invoking main in MallOwner");
Mall owner = new Mall(5000.25,"Mantri Square",75,"Malleshwaram",4.7f,true,5);
System.out.println("\n");

System.out.println("Invoking main in ParkMaker");
Park park = new Park(1000.50, "Central Park", 100, "Urban Park", true, 50, true, 30, "City Park");
System.out.println();
}
}