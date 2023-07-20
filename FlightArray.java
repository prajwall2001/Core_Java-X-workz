class FlightArray{
	public static void main(String[] args)
	{
	System.out.println("Running main in flights in the world...");
        String indiGo  ="IndiGo";
		String airAsia ="AirAsia";
		String gulfAir="Gulf  Air";
		String flyDubai="Fly Dubai";
		String thaiAirways="Thai Airways";
		String scoot ="Scoot";
		String qatar="Qatar Airways";
		
		String airways[]={indigo,airAsia,gulfAir,flyDubai,thaiAirways,scoot,qatar};
		for (int domestic=0;domestic<airways.length;domestic++)
			System.out.println("Airway " +airways[domestic]+ " is at position " +domestic);
		
		 airways[5]="Jet Blue";
		 String updated=airways[5];
		
		 System.out.println("\n");
		 
		for (int domestic=airways.length-1;domestic>=0;domestic--)
			System.out.println("Airway " +airways[domestic]+ " is at position" +domestic);
		}
	}